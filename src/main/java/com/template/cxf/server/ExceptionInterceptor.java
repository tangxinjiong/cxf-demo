package com.template.cxf.server;

import org.apache.commons.lang3.StringUtils;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.apache.cxf.service.model.BindingOperationInfo;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.OutputStream;
import java.io.StringWriter;
import java.lang.reflect.Field;

public class ExceptionInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

    public ExceptionInterceptor() {
        super(Phase.PRE_PROTOCOL);
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {
        Fault f = (Fault) message.getContent(Exception.class);
        BindingOperationInfo bop = message.getExchange().getBindingOperationInfo();
        String returnName = StringUtils.capitalize(bop.getOperationInfo().getOutputName());

        WebApiResultEntity entity = new WebApiResultEntity();
        entity.setCode("1");
        entity.setMsg(f.getMessage());

        try {
            Class<?> aClass = Class.forName("com.template.cxf.server." + returnName);
            Object response = aClass.newInstance();
            Field resultEntity = aClass.getDeclaredFields()[0];
            resultEntity.setAccessible(true);
            resultEntity.set(response, entity);

            OutputStream outputStream = message.getContent(OutputStream.class);
            outputStream.write(getResXml(response).getBytes("UTF-8"));
            outputStream.close();

            message.getInterceptorChain().abort();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getResXml(Object obj) throws JAXBException {
        StringWriter writer = new StringWriter();
        JAXBContext context = JAXBContext.newInstance(obj.getClass());
        Marshaller marshal = context.createMarshaller();

        marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false); // 格式化输出
        marshal.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");// 编码格式,默认为utf-8
        marshal.setProperty(Marshaller.JAXB_FRAGMENT, true);// 是否省略xml头信息
        marshal.setProperty("jaxb.encoding", "utf-8");
        marshal.marshal(obj, writer);

        StringBuffer buffer = writer.getBuffer();
        buffer.insert(0, "<soap:Envelope xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\"><soap:Body>");
        buffer.append("</soap:Body></soap:Envelope>");
        return buffer.toString();
    }
}
