
package com.hundsun.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.hundsun.service.ArrayOfString;


/**
 * <p>QueryPayRequest complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryPayRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bzType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detailSeqID" type="{http://service.hundsun.com}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="totalCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPayRequest", propOrder = {
    "bzType",
    "detailSeqID",
    "totalCount"
})
public class QueryPayRequest {

    @XmlElementRef(name = "bzType", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bzType;
    @XmlElementRef(name = "detailSeqID", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfString> detailSeqID;
    protected Integer totalCount;

    /**
     * 获取bzType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBzType() {
        return bzType;
    }

    /**
     * 设置bzType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBzType(JAXBElement<String> value) {
        this.bzType = value;
    }

    /**
     * 获取detailSeqID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public JAXBElement<ArrayOfString> getDetailSeqID() {
        return detailSeqID;
    }

    /**
     * 设置detailSeqID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}
     *     
     */
    public void setDetailSeqID(JAXBElement<ArrayOfString> value) {
        this.detailSeqID = value;
    }

    /**
     * 获取totalCount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * 设置totalCount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalCount(Integer value) {
        this.totalCount = value;
    }

}
