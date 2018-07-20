
package com.hundsun.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>QueryPayResponseDetail complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡamount���Ե�ֵ��
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
     * ����amount���Ե�ֵ��
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
     * ��ȡattribute1���Ե�ֵ��
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
     * ����attribute1���Ե�ֵ��
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
     * ��ȡattribute2���Ե�ֵ��
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
     * ����attribute2���Ե�ֵ��
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
     * ��ȡbankMsg���Ե�ֵ��
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
     * ����bankMsg���Ե�ֵ��
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
     * ��ȡcurrency���Ե�ֵ��
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
     * ����currency���Ե�ֵ��
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
     * ��ȡdealType���Ե�ֵ��
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
     * ����dealType���Ե�ֵ��
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
     * ��ȡdetailSeqID���Ե�ֵ��
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
     * ����detailSeqID���Ե�ֵ��
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
     * ��ȡdscode���Ե�ֵ��
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
     * ����dscode���Ե�ֵ��
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
     * ��ȡkdEbSeqID���Ե�ֵ��
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
     * ����kdEbSeqID���Ե�ֵ��
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
     * ��ȡkdEbStatus���Ե�ֵ��
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
     * ����kdEbStatus���Ե�ֵ��
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
     * ��ȡmoneyWay���Ե�ֵ��
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
     * ����moneyWay���Ե�ֵ��
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
     * ��ȡnoteMoney���Ե�ֵ��
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
     * ����noteMoney���Ե�ֵ��
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
     * ��ȡpayAccount���Ե�ֵ��
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
     * ����payAccount���Ե�ֵ��
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
     * ��ȡpayAccountName���Ե�ֵ��
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
     * ����payAccountName���Ե�ֵ��
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
     * ��ȡpayBank���Ե�ֵ��
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
     * ����payBank���Ե�ֵ��
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
     * ��ȡpayBankArea���Ե�ֵ��
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
     * ����payBankArea���Ե�ֵ��
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
     * ��ȡpayBankLocation���Ե�ֵ��
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
     * ����payBankLocation���Ե�ֵ��
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
     * ��ȡpayCurrency���Ե�ֵ��
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
     * ����payCurrency���Ե�ֵ��
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
     * ��ȡpayDate���Ե�ֵ��
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
     * ����payDate���Ե�ֵ��
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
     * ��ȡpayEntityCode���Ե�ֵ��
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
     * ����payEntityCode���Ե�ֵ��
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
     * ��ȡpayName���Ե�ֵ��
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
     * ����payName���Ե�ֵ��
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
     * ��ȡpayObjectType���Ե�ֵ��
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
     * ����payObjectType���Ե�ֵ��
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
     * ��ȡpaymentTime���Ե�ֵ��
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
     * ����paymentTime���Ե�ֵ��
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
     * ��ȡrecAccount���Ե�ֵ��
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
     * ����recAccount���Ե�ֵ��
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
     * ��ȡrecAccountName���Ե�ֵ��
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
     * ����recAccountName���Ե�ֵ��
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
     * ��ȡrecBank���Ե�ֵ��
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
     * ����recBank���Ե�ֵ��
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
     * ��ȡrecBankArea���Ե�ֵ��
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
     * ����recBankArea���Ե�ֵ��
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
     * ��ȡrecBankLocation���Ե�ֵ��
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
     * ����recBankLocation���Ե�ֵ��
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
     * ��ȡrecName���Ե�ֵ��
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
     * ����recName���Ե�ֵ��
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
     * ��ȡrecObjectType���Ե�ֵ��
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
     * ����recObjectType���Ե�ֵ��
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
