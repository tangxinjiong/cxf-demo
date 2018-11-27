
package com.template.cxf.client.simple;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>VCustomerGiftInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VCustomerGiftInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CampaignId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CampaignCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CampaignName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DealerId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="CityId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ShopCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductGiftId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ProductGiftName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="OpenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RegTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VCustomerGiftInfo", propOrder = {
    "campaignId",
    "campaignCode",
    "campaignName",
    "dealerId",
    "cityId",
    "shopCode",
    "productGiftId",
    "productGiftName",
    "quantity",
    "openId",
    "mobile",
    "customerName",
    "regTime",
    "remark"
})
public class VCustomerGiftInfo {

    @XmlElement(name = "CampaignId")
    protected int campaignId;
    @XmlElement(name = "CampaignCode")
    protected String campaignCode;
    @XmlElement(name = "CampaignName")
    protected String campaignName;
    @XmlElement(name = "DealerId")
    protected int dealerId;
    @XmlElement(name = "CityId")
    protected int cityId;
    @XmlElement(name = "ShopCode")
    protected String shopCode;
    @XmlElement(name = "ProductGiftId")
    protected int productGiftId;
    @XmlElement(name = "ProductGiftName")
    protected String productGiftName;
    @XmlElement(name = "Quantity")
    protected int quantity;
    @XmlElement(name = "OpenId")
    protected String openId;
    @XmlElement(name = "Mobile")
    protected String mobile;
    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "RegTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regTime;
    @XmlElement(name = "Remark")
    protected String remark;

    /**
     * 获取campaignId属性的值。
     * 
     */
    public int getCampaignId() {
        return campaignId;
    }

    /**
     * 设置campaignId属性的值。
     * 
     */
    public void setCampaignId(int value) {
        this.campaignId = value;
    }

    /**
     * 获取campaignCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignCode() {
        return campaignCode;
    }

    /**
     * 设置campaignCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignCode(String value) {
        this.campaignCode = value;
    }

    /**
     * 获取campaignName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**
     * 设置campaignName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCampaignName(String value) {
        this.campaignName = value;
    }

    /**
     * 获取dealerId属性的值。
     * 
     */
    public int getDealerId() {
        return dealerId;
    }

    /**
     * 设置dealerId属性的值。
     * 
     */
    public void setDealerId(int value) {
        this.dealerId = value;
    }

    /**
     * 获取cityId属性的值。
     * 
     */
    public int getCityId() {
        return cityId;
    }

    /**
     * 设置cityId属性的值。
     * 
     */
    public void setCityId(int value) {
        this.cityId = value;
    }

    /**
     * 获取shopCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShopCode() {
        return shopCode;
    }

    /**
     * 设置shopCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShopCode(String value) {
        this.shopCode = value;
    }

    /**
     * 获取productGiftId属性的值。
     * 
     */
    public int getProductGiftId() {
        return productGiftId;
    }

    /**
     * 设置productGiftId属性的值。
     * 
     */
    public void setProductGiftId(int value) {
        this.productGiftId = value;
    }

    /**
     * 获取productGiftName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductGiftName() {
        return productGiftName;
    }

    /**
     * 设置productGiftName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductGiftName(String value) {
        this.productGiftName = value;
    }

    /**
     * 获取quantity属性的值。
     * 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     */
    public void setQuantity(int value) {
        this.quantity = value;
    }

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
     * 获取mobile属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置mobile属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * 获取customerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置customerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * 获取regTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegTime() {
        return regTime;
    }

    /**
     * 设置regTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegTime(XMLGregorianCalendar value) {
        this.regTime = value;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

}
