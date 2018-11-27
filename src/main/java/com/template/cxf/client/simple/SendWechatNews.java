
package com.template.cxf.client.simple;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SendWechatNews complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SendWechatNews"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OpenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WechatArticle" type="{http://tempuri.org/}WechatArticle" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendWechatNews", propOrder = {
    "openId",
    "wechatArticle"
})
public class SendWechatNews {

    @XmlElement(name = "OpenId")
    protected String openId;
    @XmlElement(name = "WechatArticle")
    protected WechatArticle wechatArticle;

    /**
     * 获取openId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置openId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenId(String value) {
        this.openId = value;
    }

    /**
     * 获取wechatArticle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WechatArticle }
     *     
     */
    public WechatArticle getWechatArticle() {
        return wechatArticle;
    }

    /**
     * 设置wechatArticle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WechatArticle }
     *     
     */
    public void setWechatArticle(WechatArticle value) {
        this.wechatArticle = value;
    }

}
