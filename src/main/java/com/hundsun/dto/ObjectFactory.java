
package com.hundsun.dto;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.hundsun.service.ArrayOfString;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hundsun.dto package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _QueryPayResponseQdetail_QNAME = new QName("http://dto.hundsun.com", "qdetail");
    private final static QName _QueryPayResponseDetailPayName_QNAME = new QName("http://dto.hundsun.com", "payName");
    private final static QName _QueryPayResponseDetailPaymentTime_QNAME = new QName("http://dto.hundsun.com", "paymentTime");
    private final static QName _QueryPayResponseDetailKdEbSeqID_QNAME = new QName("http://dto.hundsun.com", "kdEbSeqID");
    private final static QName _QueryPayResponseDetailRecBank_QNAME = new QName("http://dto.hundsun.com", "recBank");
    private final static QName _QueryPayResponseDetailPayEntityCode_QNAME = new QName("http://dto.hundsun.com", "payEntityCode");
    private final static QName _QueryPayResponseDetailDscode_QNAME = new QName("http://dto.hundsun.com", "dscode");
    private final static QName _QueryPayResponseDetailCurrency_QNAME = new QName("http://dto.hundsun.com", "currency");
    private final static QName _QueryPayResponseDetailRecBankArea_QNAME = new QName("http://dto.hundsun.com", "recBankArea");
    private final static QName _QueryPayResponseDetailBankMsg_QNAME = new QName("http://dto.hundsun.com", "bankMsg");
    private final static QName _QueryPayResponseDetailPayBankArea_QNAME = new QName("http://dto.hundsun.com", "payBankArea");
    private final static QName _QueryPayResponseDetailPayBank_QNAME = new QName("http://dto.hundsun.com", "payBank");
    private final static QName _QueryPayResponseDetailRecName_QNAME = new QName("http://dto.hundsun.com", "recName");
    private final static QName _QueryPayResponseDetailRecAccountName_QNAME = new QName("http://dto.hundsun.com", "recAccountName");
    private final static QName _QueryPayResponseDetailRecObjectType_QNAME = new QName("http://dto.hundsun.com", "recObjectType");
    private final static QName _QueryPayResponseDetailPayObjectType_QNAME = new QName("http://dto.hundsun.com", "payObjectType");
    private final static QName _QueryPayResponseDetailPayAccountName_QNAME = new QName("http://dto.hundsun.com", "payAccountName");
    private final static QName _QueryPayResponseDetailPayCurrency_QNAME = new QName("http://dto.hundsun.com", "payCurrency");
    private final static QName _QueryPayResponseDetailAttribute1_QNAME = new QName("http://dto.hundsun.com", "attribute1");
    private final static QName _QueryPayResponseDetailAttribute2_QNAME = new QName("http://dto.hundsun.com", "attribute2");
    private final static QName _QueryPayResponseDetailDetailSeqID_QNAME = new QName("http://dto.hundsun.com", "detailSeqID");
    private final static QName _QueryPayResponseDetailPayAccount_QNAME = new QName("http://dto.hundsun.com", "payAccount");
    private final static QName _QueryPayResponseDetailRecAccount_QNAME = new QName("http://dto.hundsun.com", "recAccount");
    private final static QName _QueryPayResponseDetailRecBankLocation_QNAME = new QName("http://dto.hundsun.com", "recBankLocation");
    private final static QName _QueryPayResponseDetailPayBankLocation_QNAME = new QName("http://dto.hundsun.com", "payBankLocation");
    private final static QName _QueryPayResponseDetailAmount_QNAME = new QName("http://dto.hundsun.com", "amount");
    private final static QName _QueryPayRequestBzType_QNAME = new QName("http://dto.hundsun.com", "bzType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hundsun.dto
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueryPayResponse }
     * 
     */
    public QueryPayResponse createQueryPayResponse() {
        return new QueryPayResponse();
    }

    /**
     * Create an instance of {@link QueryPayResponseDetail }
     * 
     */
    public QueryPayResponseDetail createQueryPayResponseDetail() {
        return new QueryPayResponseDetail();
    }

    /**
     * Create an instance of {@link ArrayOfQueryPayResponseDetail }
     * 
     */
    public ArrayOfQueryPayResponseDetail createArrayOfQueryPayResponseDetail() {
        return new ArrayOfQueryPayResponseDetail();
    }

    /**
     * Create an instance of {@link QueryPayRequest }
     * 
     */
    public QueryPayRequest createQueryPayRequest() {
        return new QueryPayRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfQueryPayResponseDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "qdetail", scope = QueryPayResponse.class)
    public JAXBElement<ArrayOfQueryPayResponseDetail> createQueryPayResponseQdetail(ArrayOfQueryPayResponseDetail value) {
        return new JAXBElement<ArrayOfQueryPayResponseDetail>(_QueryPayResponseQdetail_QNAME, ArrayOfQueryPayResponseDetail.class, QueryPayResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "payName", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailPayName(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailPayName_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "paymentTime", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailPaymentTime(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailPaymentTime_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "kdEbSeqID", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailKdEbSeqID(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailKdEbSeqID_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "recBank", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailRecBank(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailRecBank_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "payEntityCode", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailPayEntityCode(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailPayEntityCode_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "dscode", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailDscode(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailDscode_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "currency", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailCurrency(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailCurrency_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "recBankArea", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailRecBankArea(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailRecBankArea_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "bankMsg", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailBankMsg(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailBankMsg_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "payBankArea", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailPayBankArea(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailPayBankArea_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "payBank", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailPayBank(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailPayBank_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "recName", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailRecName(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailRecName_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "recAccountName", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailRecAccountName(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailRecAccountName_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "recObjectType", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailRecObjectType(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailRecObjectType_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "payObjectType", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailPayObjectType(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailPayObjectType_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "payAccountName", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailPayAccountName(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailPayAccountName_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "payCurrency", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailPayCurrency(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailPayCurrency_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "attribute1", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailAttribute1(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailAttribute1_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "attribute2", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailAttribute2(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailAttribute2_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "detailSeqID", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailDetailSeqID(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailDetailSeqID_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "payAccount", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailPayAccount(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailPayAccount_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "recAccount", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailRecAccount(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailRecAccount_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "recBankLocation", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailRecBankLocation(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailRecBankLocation_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "payBankLocation", scope = QueryPayResponseDetail.class)
    public JAXBElement<String> createQueryPayResponseDetailPayBankLocation(String value) {
        return new JAXBElement<String>(_QueryPayResponseDetailPayBankLocation_QNAME, String.class, QueryPayResponseDetail.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "amount", scope = QueryPayResponseDetail.class)
    public JAXBElement<byte[]> createQueryPayResponseDetailAmount(byte[] value) {
        return new JAXBElement<byte[]>(_QueryPayResponseDetailAmount_QNAME, byte[].class, QueryPayResponseDetail.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "bzType", scope = QueryPayRequest.class)
    public JAXBElement<String> createQueryPayRequestBzType(String value) {
        return new JAXBElement<String>(_QueryPayRequestBzType_QNAME, String.class, QueryPayRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dto.hundsun.com", name = "detailSeqID", scope = QueryPayRequest.class)
    public JAXBElement<ArrayOfString> createQueryPayRequestDetailSeqID(ArrayOfString value) {
        return new JAXBElement<ArrayOfString>(_QueryPayResponseDetailDetailSeqID_QNAME, ArrayOfString.class, QueryPayRequest.class, value);
    }

}
