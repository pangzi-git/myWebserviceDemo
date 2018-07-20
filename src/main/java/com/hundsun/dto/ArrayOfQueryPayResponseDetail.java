
package com.hundsun.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ArrayOfQueryPayResponseDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ArrayOfQueryPayResponseDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QueryPayResponseDetail" type="{http://dto.hundsun.com}QueryPayResponseDetail" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfQueryPayResponseDetail", propOrder = {
    "queryPayResponseDetail"
})
public class ArrayOfQueryPayResponseDetail {

    @XmlElement(name = "QueryPayResponseDetail", nillable = true)
    protected List<QueryPayResponseDetail> queryPayResponseDetail;

    /**
     * Gets the value of the queryPayResponseDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queryPayResponseDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueryPayResponseDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueryPayResponseDetail }
     * 
     * 
     */
    public List<QueryPayResponseDetail> getQueryPayResponseDetail() {
        if (queryPayResponseDetail == null) {
            queryPayResponseDetail = new ArrayList<QueryPayResponseDetail>();
        }
        return this.queryPayResponseDetail;
    }

}
