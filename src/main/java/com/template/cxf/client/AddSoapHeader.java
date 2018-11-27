package com.template.cxf.client;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;

public class AddSoapHeader extends AbstractSoapInterceptor {

    public AddSoapHeader() {
        super(Phase.WRITE);
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {
        Document doc = DOMUtils.createDocument();

        Element id = doc.createElement("UserName");
        id.setTextContent("0001");

        Element pwd = doc.createElement("Password");
        pwd.setTextContent("123");

        Element root = doc.createElementNS("http://tempuri.org/", "MpSoapHeader");
        root.appendChild(id);
        root.appendChild(pwd);

        QName qName = new QName("MpSoapHeader");
        message.getHeaders().add(new SoapHeader(qName, root));
    }
}
