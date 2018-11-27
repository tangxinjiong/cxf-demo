package com.template.cxf.server;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.security.AuthenticationException;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;

import java.util.List;

public class AuthInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

    public AuthInterceptor() {
        super(Phase.PRE_INVOKE);
    }

    @Override
    public void handleMessage(SoapMessage message) throws Fault {
        List<Header> headers = message.getHeaders();
        Header header = headers.get(0);
        Element root = (Element) header.getObject();
        String userName = root.getElementsByTagName("UserName").item(0).getTextContent().trim();
        String password = root.getElementsByTagName("Password").item(0).getTextContent().trim();

        throw new Fault(new AuthenticationException("Authentication failed"));
    }
}
