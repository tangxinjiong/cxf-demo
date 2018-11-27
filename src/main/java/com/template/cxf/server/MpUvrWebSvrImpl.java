package com.template.cxf.server;

import javax.jws.WebService;

@WebService(targetNamespace = "http://tempuri.org/", endpointInterface = "com.template.cxf.server.MpUvrWebSvr", serviceName = "MpUvrWebSvr")
public class MpUvrWebSvrImpl implements MpUvrWebSvr {

    @Override
    public WebApiResultEntity bindFansMobileByOpenId(String openId, String mobile) {
        System.out.println("openId:" + openId + ";mobile:" + mobile);
        WebApiResultEntity entity = new WebApiResultEntity();
        entity.setCode("1");
        entity.setMsg("你无权访问");
        return entity;
    }
}
