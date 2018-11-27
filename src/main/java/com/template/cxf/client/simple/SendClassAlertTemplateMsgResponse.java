
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
 *         &lt;element name="SendClassAlertTemplateMsgResult" type="{http://tempuri.org/}WebApiResultEntity" minOccurs="0"/&gt;
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
    "sendClassAlertTemplateMsgResult"
})
@XmlRootElement(name = "SendClassAlertTemplateMsgResponse")
public class SendClassAlertTemplateMsgResponse {

    @XmlElement(name = "SendClassAlertTemplateMsgResult")
    protected WebApiResultEntity sendClassAlertTemplateMsgResult;

    /**
     * 获取sendClassAlertTemplateMsgResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WebApiResultEntity }
     *     
     */
    public WebApiResultEntity getSendClassAlertTemplateMsgResult() {
        return sendClassAlertTemplateMsgResult;
    }

    /**
     * 设置sendClassAlertTemplateMsgResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WebApiResultEntity }
     *     
     */
    public void setSendClassAlertTemplateMsgResult(WebApiResultEntity value) {
        this.sendClassAlertTemplateMsgResult = value;
    }

}
