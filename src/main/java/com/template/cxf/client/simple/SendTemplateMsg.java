
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
 *         &lt;element name="openId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="obj" type="{http://tempuri.org/}TemplateNews" minOccurs="0"/&gt;
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
    "openId",
    "obj"
})
@XmlRootElement(name = "SendTemplateMsg")
public class SendTemplateMsg {

    protected String openId;
    protected TemplateNews obj;

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
     * 获取obj属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TemplateNews }
     *     
     */
    public TemplateNews getObj() {
        return obj;
    }

    /**
     * 设置obj属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TemplateNews }
     *     
     */
    public void setObj(TemplateNews value) {
        this.obj = value;
    }

}
