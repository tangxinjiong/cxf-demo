
package com.template.cxf.client.simple;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="vCusGiftInfo" type="{http://tempuri.org/}VCustomerGiftInfo" minOccurs="0"/&gt;
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
    "vCusGiftInfo"
})
@XmlRootElement(name = "SendKingGift")
public class SendKingGift {

    protected VCustomerGiftInfo vCusGiftInfo;

    /**
     * 获取vCusGiftInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VCustomerGiftInfo }
     *     
     */
    public VCustomerGiftInfo getVCusGiftInfo() {
        return vCusGiftInfo;
    }

    /**
     * 设置vCusGiftInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VCustomerGiftInfo }
     *     
     */
    public void setVCusGiftInfo(VCustomerGiftInfo value) {
        this.vCusGiftInfo = value;
    }

}
