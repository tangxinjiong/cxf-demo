
package com.template.cxf.client.simple;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="SendCrmCardTemplateResult" type="{http://tempuri.org/}WebApiResultEntity" minOccurs="0"/&gt;
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
    "sendCrmCardTemplateResult"
})
@XmlRootElement(name = "SendCrmCardTemplateResponse")
public class SendCrmCardTemplateResponse {

    @XmlElement(name = "SendCrmCardTemplateResult")
    protected WebApiResultEntity sendCrmCardTemplateResult;

    /**
     * 获取sendCrmCardTemplateResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WebApiResultEntity }
     *     
     */
    public WebApiResultEntity getSendCrmCardTemplateResult() {
        return sendCrmCardTemplateResult;
    }

    /**
     * 设置sendCrmCardTemplateResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WebApiResultEntity }
     *     
     */
    public void setSendCrmCardTemplateResult(WebApiResultEntity value) {
        this.sendCrmCardTemplateResult = value;
    }

}
