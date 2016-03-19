
package com.vis.oubl.vo;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for My010CustomerVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="My010CustomerVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="firstName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="lastName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="middleName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="identityNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="insuranceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="address" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mobileNumber" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="nationality" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "My010CustomerVO")
@XmlRootElement(name = "My010CustomerVO")
public class My010CustomerVO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "firstName", required = true)
    protected String firstName;
    @XmlAttribute(name = "lastName", required = true)
    protected String lastName;
    @XmlAttribute(name = "middleName", required = true)
    protected String middleName;
    @XmlAttribute(name = "identityNumber")
    protected BigInteger identityNumber;
    @XmlAttribute(name = "insuranceNumber")
    protected BigInteger insuranceNumber;
    @XmlAttribute(name = "address", required = true)
    protected String address;
    @XmlAttribute(name = "mobileNumber")
    protected Long mobileNumber;
    @XmlAttribute(name = "telephoneNumber")
    protected BigInteger telephoneNumber;
    @XmlAttribute(name = "nationality", required = true)
    protected String nationality;
    @XmlAttribute(name = "type", required = true)
    protected String type;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the identityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdentityNumber() {
        return identityNumber;
    }

    /**
     * Sets the value of the identityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdentityNumber(BigInteger value) {
        this.identityNumber = value;
    }

    /**
     * Gets the value of the insuranceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getInsuranceNumber() {
        return insuranceNumber;
    }

    /**
     * Sets the value of the insuranceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setInsuranceNumber(BigInteger value) {
        this.insuranceNumber = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the mobileNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Sets the value of the mobileNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMobileNumber(Long value) {
        this.mobileNumber = value;
    }

    /**
     * Gets the value of the telephoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Sets the value of the telephoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTelephoneNumber(BigInteger value) {
        this.telephoneNumber = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
