
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
 *         &lt;element name="GetPermanentQRCodeWithParaResult" type="{http://tempuri.org/}WebApiResultEntity" minOccurs="0"/&gt;
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
    "getPermanentQRCodeWithParaResult"
})
@XmlRootElement(name = "GetPermanentQRCodeWithParaResponse")
public class GetPermanentQRCodeWithParaResponse {

    @XmlElement(name = "GetPermanentQRCodeWithParaResult")
    protected WebApiResultEntity getPermanentQRCodeWithParaResult;

    /**
     * 获取getPermanentQRCodeWithParaResult属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WebApiResultEntity }
     *     
     */
    public WebApiResultEntity getGetPermanentQRCodeWithParaResult() {
        return getPermanentQRCodeWithParaResult;
    }

    /**
     * 设置getPermanentQRCodeWithParaResult属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WebApiResultEntity }
     *     
     */
    public void setGetPermanentQRCodeWithParaResult(WebApiResultEntity value) {
        this.getPermanentQRCodeWithParaResult = value;
    }

}
