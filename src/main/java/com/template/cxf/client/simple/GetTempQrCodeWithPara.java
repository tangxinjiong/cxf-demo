
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
 *         &lt;element name="scene_id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="expire_seconds" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "sceneId",
    "expireSeconds"
})
@XmlRootElement(name = "GetTempQrCodeWithPara")
public class GetTempQrCodeWithPara {

    @XmlElement(name = "scene_id")
    protected int sceneId;
    @XmlElement(name = "expire_seconds")
    protected int expireSeconds;

    /**
     * 获取sceneId属性的值。
     * 
     */
    public int getSceneId() {
        return sceneId;
    }

    /**
     * 设置sceneId属性的值。
     * 
     */
    public void setSceneId(int value) {
        this.sceneId = value;
    }

    /**
     * 获取expireSeconds属性的值。
     * 
     */
    public int getExpireSeconds() {
        return expireSeconds;
    }

    /**
     * 设置expireSeconds属性的值。
     * 
     */
    public void setExpireSeconds(int value) {
        this.expireSeconds = value;
    }

}
