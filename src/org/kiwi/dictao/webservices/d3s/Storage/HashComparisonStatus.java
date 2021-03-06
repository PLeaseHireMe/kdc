
package org.kiwi.dictao.webservices.d3s.Storage;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HashComparisonStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HashComparisonStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}HashComparisonStatusCode"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="detail" type="{http://www.dictao.com/d3s/xsd/v2010_10/Common}StatusDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HashComparisonStatus", propOrder = {
    "code",
    "message",
    "detail"
})
public class HashComparisonStatus {

    @XmlElement(required = true)
    protected HashComparisonStatusCode code;
    protected String message;
    protected StatusDetail detail;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link HashComparisonStatusCode }
     *     
     */
    public HashComparisonStatusCode getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link HashComparisonStatusCode }
     *     
     */
    public void setCode(HashComparisonStatusCode value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link StatusDetail }
     *     
     */
    public StatusDetail getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusDetail }
     *     
     */
    public void setDetail(StatusDetail value) {
        this.detail = value;
    }

}
