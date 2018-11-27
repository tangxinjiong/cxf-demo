package com.template.cxf.client;

import com.template.cxf.client.simple.MpUvrWebSvr;
import com.template.cxf.client.simple.MpUvrWebSvrSoap;
import com.template.cxf.client.simple.WebApiResultEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;

import java.net.URL;

/**
 * wsdl2java -p com.template.cxf.client.simple -encoding utf-8 -d d:/java -autoNameResolution http://cheil.wedochina.cn/webservice/MpUvrWebSvr.asmx?wsdl
 */
public class SimpleClientTest {

    public static void main(String[] args) throws Exception {
        URL url = new URL("http://localhost:8080/webservice/mpUvrWebSvr?wsdl");

        MpUvrWebSvr mpUvrWebSvr = new MpUvrWebSvr(url);
        MpUvrWebSvrSoap mpUvrWebSvrSoap = mpUvrWebSvr.getMpUvrWebSvrSoap();

        Client client = ClientProxy.getClient(mpUvrWebSvrSoap);
        client.getOutInterceptors().add(new AddSoapHeader());

        WebApiResultEntity result = mpUvrWebSvrSoap.bindFansMobileByOpenId("ss", "ss");
        System.out.println(ToStringBuilder.reflectionToString(result));
    }
}
