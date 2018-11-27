package com.template.cxf.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://tempuri.org/")
public interface MpUvrWebSvr {

    @RequestWrapper(localName = "BindFansMobileByOpenId", className = "com.template.cxf.server.BindFansMobileByOpenId")
    @ResponseWrapper(localName = "BindFansMobileByOpenIdResponse", className = "com.template.cxf.server.BindFansMobileByOpenIdResponse")
    @WebResult(name = "BindFansMobileByOpenIdResult")
    WebApiResultEntity bindFansMobileByOpenId(@WebParam(name = "openId") String openId, @WebParam(name = "mobile") String mobile);
}
