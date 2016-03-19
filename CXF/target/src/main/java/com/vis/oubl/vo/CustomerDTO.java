
package com.vis.oubl.vo;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Java class for CustomerDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="customerKey" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="customerCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="customerId" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="activatedDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="billCycle" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="billCycleCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="birthDate" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bmbCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="creditLimit" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="csLevel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="currentBalance" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDTO")
@XmlRootElement(name = "CustomerDTO")
public class CustomerDTO
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlAttribute(name = "id")
    protected Long id;
    @XmlAttribute(name = "customerKey")
    protected Long customerKey;
    @XmlAttribute(name = "customerCode", required = true)
    protected String customerCode;
    @XmlAttribute(name = "customerId")
    protected Long customerId;
    @XmlAttribute(name = "activatedDate", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Date activatedDate;
    @XmlAttribute(name = "billCycle", required = true)
    protected String billCycle;
    @XmlAttribute(name = "billCycleCode", required = true)
    protected String billCycleCode;
    @XmlAttribute(name = "birthDate", required = true)
    protected String birthDate;
    @XmlAttribute(name = "bmbCode", required = true)
    protected String bmbCode;
    @XmlAttribute(name = "creditLimit")
    protected Long creditLimit;
    @XmlAttribute(name = "csLevel", required = true)
    protected String csLevel;
    @XmlAttribute(name = "currentBalance", required = true)
    protected String currentBalance;

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
     * Gets the value of the customerKey property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerKey() {
        return customerKey;
    }

    /**
     * Sets the value of the customerKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerKey(Long value) {
        this.customerKey = value;
    }

    /**
     * Gets the value of the customerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerCode() {
        return customerCode;
    }

    /**
     * Sets the value of the customerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerCode(String value) {
        this.customerCode = value;
    }

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCustomerId(Long value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the activatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getActivatedDate() {
        return activatedDate;
    }

    /**
     * Sets the value of the activatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivatedDate(Date value) {
        this.activatedDate = value;
    }

    /**
     * Gets the value of the billCycle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycle() {
        return billCycle;
    }

    /**
     * Sets the value of the billCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycle(String value) {
        this.billCycle = value;
    }

    /**
     * Gets the value of the billCycleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillCycleCode() {
        return billCycleCode;
    }

    /**
     * Sets the value of the billCycleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillCycleCode(String value) {
        this.billCycleCode = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the bmbCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBmbCode() {
        return bmbCode;
    }

    /**
     * Sets the value of the bmbCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBmbCode(String value) {
        this.bmbCode = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCreditLimit(Long value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the csLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsLevel() {
        return csLevel;
    }

    /**
     * Sets the value of the csLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsLevel(String value) {
        this.csLevel = value;
    }

    /**
     * Gets the value of the currentBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentBalance() {
        return currentBalance;
    }

    /**
     * Sets the value of the currentBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentBalance(String value) {
        this.currentBalance = value;
    }

}
