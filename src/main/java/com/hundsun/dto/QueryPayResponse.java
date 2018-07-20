
package com.hundsun.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueryPayResponse complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="QueryPayResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qdetail" type="{http://dto.hundsun.com}ArrayOfQueryPayResponseDetail" minOccurs="0"/>
 *         &lt;element name="totalAmount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
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
@XmlType(name = "QueryPayResponse", propOrder = {
    "qdetail",
    "totalAmount",
    "totalCount"
})
public class QueryPayResponse {

    @XmlElementRef(name = "qdetail", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfQueryPayResponseDetail> qdetail;
    protected Float totalAmount;
    protected Integer totalCount;

    /**
     * ��ȡqdetail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQueryPayResponseDetail }{@code >}
     *     
     */
    public JAXBElement<ArrayOfQueryPayResponseDetail> getQdetail() {
        return qdetail;
    }

    /**
     * ����qdetail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfQueryPayResponseDetail }{@code >}
     *     
     */
    public void setQdetail(JAXBElement<ArrayOfQueryPayResponseDetail> value) {
        this.qdetail = value;
    }

    /**
     * ��ȡtotalAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalAmount() {
        return totalAmount;
    }

    /**
     * ����totalAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalAmount(Float value) {
        this.totalAmount = value;
    }

    /**
     * ��ȡtotalCount���Ե�ֵ��
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
     * ����totalCount���Ե�ֵ��
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
