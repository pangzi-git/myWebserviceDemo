
package com.hundsun.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>QueryPayResponseDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueryPayResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="attribute1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attribute2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dealType" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="detailSeqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kdEbSeqID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kdEbStatus" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="moneyWay" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="noteMoney" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="payAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payBankArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payBankLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="payEntityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="paymentTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recAccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recBank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recBankArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recBankLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="recObjectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPayResponseDetail", propOrder = {
    "amount",
    "attribute1",
    "attribute2",
    "bankMsg",
    "currency",
    "dealType",
    "detailSeqID",
    "dscode",
    "kdEbSeqID",
    "kdEbStatus",
    "moneyWay",
    "noteMoney",
    "payAccount",
    "payAccountName",
    "payBank",
    "payBankArea",
    "payBankLocation",
    "payCurrency",
    "payDate",
    "payEntityCode",
    "payName",
    "payObjectType",
    "paymentTime",
    "recAccount",
    "recAccountName",
    "recBank",
    "recBankArea",
    "recBankLocation",
    "recName",
    "recObjectType"
})
public class QueryPayResponseDetail {

    @XmlElementRef(name = "amount", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> amount;
    @XmlElementRef(name = "attribute1", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attribute1;
    @XmlElementRef(name = "attribute2", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attribute2;
    @XmlElementRef(name = "bankMsg", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankMsg;
    @XmlElementRef(name = "currency", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency;
    protected Integer dealType;
    @XmlElementRef(name = "detailSeqID", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> detailSeqID;
    @XmlElementRef(name = "dscode", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dscode;
    @XmlElementRef(name = "kdEbSeqID", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> kdEbSeqID;
    protected Integer kdEbStatus;
    protected Integer moneyWay;
    protected Float noteMoney;
    @XmlElementRef(name = "payAccount", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payAccount;
    @XmlElementRef(name = "payAccountName", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payAccountName;
    @XmlElementRef(name = "payBank", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payBank;
    @XmlElementRef(name = "payBankArea", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payBankArea;
    @XmlElementRef(name = "payBankLocation", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payBankLocation;
    @XmlElementRef(name = "payCurrency", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payCurrency;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar payDate;
    @XmlElementRef(name = "payEntityCode", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payEntityCode;
    @XmlElementRef(name = "payName", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payName;
    @XmlElementRef(name = "payObjectType", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> payObjectType;
    @XmlElementRef(name = "paymentTime", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> paymentTime;
    @XmlElementRef(name = "recAccount", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recAccount;
    @XmlElementRef(name = "recAccountName", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recAccountName;
    @XmlElementRef(name = "recBank", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recBank;
    @XmlElementRef(name = "recBankArea", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recBankArea;
    @XmlElementRef(name = "recBankLocation", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recBankLocation;
    @XmlElementRef(name = "recName", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recName;
    @XmlElementRef(name = "recObjectType", namespace = "http://dto.hundsun.com", type = JAXBElement.class, required = false)
    protected JAXBElement<String> recObjectType;

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setAmount(JAXBElement<byte[]> value) {
        this.amount = value;
    }

    /**
     * 获取attribute1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribute1() {
        return attribute1;
    }

    /**
     * 设置attribute1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribute1(JAXBElement<String> value) {
        this.attribute1 = value;
    }

    /**
     * 获取attribute2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttribute2() {
        return attribute2;
    }

    /**
     * 设置attribute2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttribute2(JAXBElement<String> value) {
        this.attribute2 = value;
    }

    /**
     * 获取bankMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankMsg() {
        return bankMsg;
    }

    /**
     * 设置bankMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankMsg(JAXBElement<String> value) {
        this.bankMsg = value;
    }

    /**
     * 获取currency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrency() {
        return currency;
    }

    /**
     * 设置currency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrency(JAXBElement<String> value) {
        this.currency = value;
    }

    /**
     * 获取dealType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDealType() {
        return dealType;
    }

    /**
     * 设置dealType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDealType(Integer value) {
        this.dealType = value;
    }

    /**
     * 获取detailSeqID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDetailSeqID() {
        return detailSeqID;
    }

    /**
     * 设置detailSeqID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDetailSeqID(JAXBElement<String> value) {
        this.detailSeqID = value;
    }

    /**
     * 获取dscode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDscode() {
        return dscode;
    }

    /**
     * 设置dscode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDscode(JAXBElement<String> value) {
        this.dscode = value;
    }

    /**
     * 获取kdEbSeqID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKdEbSeqID() {
        return kdEbSeqID;
    }

    /**
     * 设置kdEbSeqID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKdEbSeqID(JAXBElement<String> value) {
        this.kdEbSeqID = value;
    }

    /**
     * 获取kdEbStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getKdEbStatus() {
        return kdEbStatus;
    }

    /**
     * 设置kdEbStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setKdEbStatus(Integer value) {
        this.kdEbStatus = value;
    }

    /**
     * 获取moneyWay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMoneyWay() {
        return moneyWay;
    }

    /**
     * 设置moneyWay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMoneyWay(Integer value) {
        this.moneyWay = value;
    }

    /**
     * 获取noteMoney属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNoteMoney() {
        return noteMoney;
    }

    /**
     * 设置noteMoney属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNoteMoney(Float value) {
        this.noteMoney = value;
    }

    /**
     * 获取payAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayAccount() {
        return payAccount;
    }

    /**
     * 设置payAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayAccount(JAXBElement<String> value) {
        this.payAccount = value;
    }

    /**
     * 获取payAccountName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayAccountName() {
        return payAccountName;
    }

    /**
     * 设置payAccountName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayAccountName(JAXBElement<String> value) {
        this.payAccountName = value;
    }

    /**
     * 获取payBank属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayBank() {
        return payBank;
    }

    /**
     * 设置payBank属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayBank(JAXBElement<String> value) {
        this.payBank = value;
    }

    /**
     * 获取payBankArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayBankArea() {
        return payBankArea;
    }

    /**
     * 设置payBankArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayBankArea(JAXBElement<String> value) {
        this.payBankArea = value;
    }

    /**
     * 获取payBankLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayBankLocation() {
        return payBankLocation;
    }

    /**
     * 设置payBankLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayBankLocation(JAXBElement<String> value) {
        this.payBankLocation = value;
    }

    /**
     * 获取payCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayCurrency() {
        return payCurrency;
    }

    /**
     * 设置payCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayCurrency(JAXBElement<String> value) {
        this.payCurrency = value;
    }

    /**
     * 获取payDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPayDate() {
        return payDate;
    }

    /**
     * 设置payDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPayDate(XMLGregorianCalendar value) {
        this.payDate = value;
    }

    /**
     * 获取payEntityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayEntityCode() {
        return payEntityCode;
    }

    /**
     * 设置payEntityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayEntityCode(JAXBElement<String> value) {
        this.payEntityCode = value;
    }

    /**
     * 获取payName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayName() {
        return payName;
    }

    /**
     * 设置payName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayName(JAXBElement<String> value) {
        this.payName = value;
    }

    /**
     * 获取payObjectType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPayObjectType() {
        return payObjectType;
    }

    /**
     * 设置payObjectType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPayObjectType(JAXBElement<String> value) {
        this.payObjectType = value;
    }

    /**
     * 获取paymentTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPaymentTime() {
        return paymentTime;
    }

    /**
     * 设置paymentTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPaymentTime(JAXBElement<String> value) {
        this.paymentTime = value;
    }

    /**
     * 获取recAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecAccount() {
        return recAccount;
    }

    /**
     * 设置recAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecAccount(JAXBElement<String> value) {
        this.recAccount = value;
    }

    /**
     * 获取recAccountName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecAccountName() {
        return recAccountName;
    }

    /**
     * 设置recAccountName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecAccountName(JAXBElement<String> value) {
        this.recAccountName = value;
    }

    /**
     * 获取recBank属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecBank() {
        return recBank;
    }

    /**
     * 设置recBank属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecBank(JAXBElement<String> value) {
        this.recBank = value;
    }

    /**
     * 获取recBankArea属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecBankArea() {
        return recBankArea;
    }

    /**
     * 设置recBankArea属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecBankArea(JAXBElement<String> value) {
        this.recBankArea = value;
    }

    /**
     * 获取recBankLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecBankLocation() {
        return recBankLocation;
    }

    /**
     * 设置recBankLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecBankLocation(JAXBElement<String> value) {
        this.recBankLocation = value;
    }

    /**
     * 获取recName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecName() {
        return recName;
    }

    /**
     * 设置recName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecName(JAXBElement<String> value) {
        this.recName = value;
    }

    /**
     * 获取recObjectType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRecObjectType() {
        return recObjectType;
    }

    /**
     * 设置recObjectType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRecObjectType(JAXBElement<String> value) {
        this.recObjectType = value;
    }

}
