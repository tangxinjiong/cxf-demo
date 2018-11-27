
package com.template.cxf.server;

import javax.xml.bind.annotation.*;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BindFansMobileByOpenIdResult" type="{http://tempuri.org/}WebApiResultEntity" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "bindFansMobileByOpenIdResult"
})
@XmlRootElement(name = "BindFansMobileByOpenIdResponse")
public class BindFansMobileByOpenIdResponse {

    @XmlElement(name = "BindFansMobileByOpenIdResult")
    protected WebApiResultEntity bindFansMobileByOpenIdResult;

    /**
     * 获取bindFansMobileByOpenIdResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link com.template.cxf.server.WebApiResultEntity }
     *     
     */
    public WebApiResultEntity getBindFansMobileByOpenIdResult() {
        return bindFansMobileByOpenIdResult;
    }

    /**
     * 设置bindFansMobileByOpenIdResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link com.template.cxf.server.WebApiResultEntity }
     *     
     */
    public void setBindFansMobileByOpenIdResult(WebApiResultEntity value) {
        this.bindFansMobileByOpenIdResult = value;
    }

}
