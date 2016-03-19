// license-header java merge-point
//
/**
 * @author Generated on 03/19/2016 08:16:09+0200 Do not modify by hand!
 *
 * TEMPLATE:     ValueObject.vsl in andromda-java-cartridge.
 * MODEL CLASS:  Data::com.vis.oubl::vo::CustomerDTO
 * STEREOTYPE:   ValueObject
 */
package com.vis.oubl.vo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * TODO: Model Documentation for class CustomerDTO
 */
@XmlRootElement(name = "CustomerDTO")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDTO", // namespace="http://vo.oubl.vis.com/",
  propOrder = {
    "id",
    "customerKey",
    "customerCode",
    "customerId",
    "activatedDate",
    "billCycle",
    "billCycleCode",
    "birthDate",
    "bmbCode",
    "creditLimit",
    "csLevel",
    "currentBalance"
})
public class CustomerDTO
    implements Serializable, Comparable<CustomerDTO>
{
    /** The serial version UID of this class. Needed for serialization. */
    private static final long serialVersionUID = -1632274676636131903L;

    // Class attributes
    /** TODO: Model Documentation for attribute id */
    @XmlElement(name = "id")
    protected Long id;
    /** TODO: Model Documentation for attribute customerKey */
    @XmlElement(name = "customerKey")
    protected Long customerKey;
    /** TODO: Model Documentation for attribute customerCode */
    @XmlElement(name = "customerCode")
    protected String customerCode;
    /** TODO: Model Documentation for attribute customerId */
    @XmlElement(name = "customerId")
    protected Long customerId;
    /** TODO: Model Documentation for attribute activatedDate */
    @XmlAttribute(name = "activatedDate", required=true)
    protected Date activatedDate;
    /** TODO: Model Documentation for attribute billCycle */
    @XmlElement(name = "billCycle")
    protected String billCycle;
    /** TODO: Model Documentation for attribute billCycleCode */
    @XmlElement(name = "billCycleCode")
    protected String billCycleCode;
    /** TODO: Model Documentation for attribute birthDate */
    @XmlElement(name = "birthDate")
    protected String birthDate;
    /** TODO: Model Documentation for attribute bmbCode */
    @XmlElement(name = "bmbCode")
    protected String bmbCode;
    /** TODO: Model Documentation for attribute creditLimit */
    @XmlElement(name = "creditLimit")
    protected Long creditLimit;
    /** TODO: Model Documentation for attribute csLevel */
    @XmlElement(name = "csLevel")
    protected String csLevel;
    /** TODO: Model Documentation for attribute currentBalance */
    @XmlElement(name = "currentBalance")
    protected String currentBalance;

    /** Default Constructor with no properties */
    public CustomerDTO()
    {
        // Documented empty block - avoid compiler warning - no super constructor
    }

    /**
     * Constructor taking only required properties
     * @param customerCodeIn String
     * @param activatedDateIn Date
     * @param billCycleIn String
     * @param billCycleCodeIn String
     * @param birthDateIn String
     * @param bmbCodeIn String
     * @param csLevelIn String
     * @param currentBalanceIn String
     */
    public CustomerDTO(final String customerCodeIn, final Date activatedDateIn, final String billCycleIn, final String billCycleCodeIn, final String birthDateIn, final String bmbCodeIn, final String csLevelIn, final String currentBalanceIn)
    {
        this.customerCode = customerCodeIn;
        this.activatedDate = activatedDateIn;
        this.billCycle = billCycleIn;
        this.billCycleCode = billCycleCodeIn;
        this.birthDate = birthDateIn;
        this.bmbCode = bmbCodeIn;
        this.csLevel = csLevelIn;
        this.currentBalance = currentBalanceIn;
    }

    /**
     * Constructor with all properties
     * @param idIn Long
     * @param customerKeyIn Long
     * @param customerCodeIn String
     * @param customerIdIn Long
     * @param activatedDateIn Date
     * @param billCycleIn String
     * @param billCycleCodeIn String
     * @param birthDateIn String
     * @param bmbCodeIn String
     * @param creditLimitIn Long
     * @param csLevelIn String
     * @param currentBalanceIn String
     */
    public CustomerDTO(final Long idIn, final Long customerKeyIn, final String customerCodeIn, final Long customerIdIn, final Date activatedDateIn, final String billCycleIn, final String billCycleCodeIn, final String birthDateIn, final String bmbCodeIn, final Long creditLimitIn, final String csLevelIn, final String currentBalanceIn)
    {
        this.id = idIn;
        this.customerKey = customerKeyIn;
        this.customerCode = customerCodeIn;
        this.customerId = customerIdIn;
        this.activatedDate = activatedDateIn;
        this.billCycle = billCycleIn;
        this.billCycleCode = billCycleCodeIn;
        this.birthDate = birthDateIn;
        this.bmbCode = bmbCodeIn;
        this.creditLimit = creditLimitIn;
        this.csLevel = csLevelIn;
        this.currentBalance = currentBalanceIn;
    }

    /**
     * Copies constructor from other CustomerDTO
     *
     * @param otherBean Cannot be <code>null</code>
     * @throws NullPointerException if the argument is <code>null</code>
     */
    public CustomerDTO(final CustomerDTO otherBean)
    {
        this.id = otherBean.getId();
        this.customerKey = otherBean.getCustomerKey();
        this.customerCode = otherBean.getCustomerCode();
        this.customerId = otherBean.getCustomerId();
        this.activatedDate = otherBean.getActivatedDate();
        this.billCycle = otherBean.getBillCycle();
        this.billCycleCode = otherBean.getBillCycleCode();
        this.birthDate = otherBean.getBirthDate();
        this.bmbCode = otherBean.getBmbCode();
        this.creditLimit = otherBean.getCreditLimit();
        this.csLevel = otherBean.getCsLevel();
        this.currentBalance = otherBean.getCurrentBalance();
    }

    /**
     * Copies all properties from the argument value object into this value object.
     * @param otherBean Cannot be <code>null</code>
     */
    public void copy(final CustomerDTO otherBean)
    {
        if (null != otherBean)
        {
            this.setId(otherBean.getId());
            this.setCustomerKey(otherBean.getCustomerKey());
            this.setCustomerCode(otherBean.getCustomerCode());
            this.setCustomerId(otherBean.getCustomerId());
            this.setActivatedDate(otherBean.getActivatedDate());
            this.setBillCycle(otherBean.getBillCycle());
            this.setBillCycleCode(otherBean.getBillCycleCode());
            this.setBirthDate(otherBean.getBirthDate());
            this.setBmbCode(otherBean.getBmbCode());
            this.setCreditLimit(otherBean.getCreditLimit());
            this.setCsLevel(otherBean.getCsLevel());
            this.setCurrentBalance(otherBean.getCurrentBalance());
        }
    }

    /**
     * TODO: Model Documentation for attribute id
     * Get the id Attribute
     * @return id Long
     */
    public Long getId()
    {
        return this.id;
    }

    /**
     * 
     * @param value Long
     */
    public void setId(final Long value)
    {
        this.id = value;
    }

    /**
     * TODO: Model Documentation for attribute customerKey
     * Get the customerKey Attribute
     * @return customerKey Long
     */
    public Long getCustomerKey()
    {
        return this.customerKey;
    }

    /**
     * 
     * @param value Long
     */
    public void setCustomerKey(final Long value)
    {
        this.customerKey = value;
    }

    /**
     * TODO: Model Documentation for attribute customerCode
     * Get the customerCode Attribute
     * @return customerCode String
     */
    public String getCustomerCode()
    {
        return this.customerCode;
    }

    /**
     * 
     * @param value String
     */
    public void setCustomerCode(final String value)
    {
        this.customerCode = value;
    }

    /**
     * TODO: Model Documentation for attribute customerId
     * Get the customerId Attribute
     * @return customerId Long
     */
    public Long getCustomerId()
    {
        return this.customerId;
    }

    /**
     * 
     * @param value Long
     */
    public void setCustomerId(final Long value)
    {
        this.customerId = value;
    }

    /**
     * TODO: Model Documentation for attribute activatedDate
     * Get the activatedDate Attribute
     * @return activatedDate Date
     */
    public Date getActivatedDate()
    {
        return this.activatedDate;
    }

    /**
     * 
     * @param value Date
     */
    public void setActivatedDate(final Date value)
    {
        this.activatedDate = value;
    }

    /**
     * TODO: Model Documentation for attribute billCycle
     * Get the billCycle Attribute
     * @return billCycle String
     */
    public String getBillCycle()
    {
        return this.billCycle;
    }

    /**
     * 
     * @param value String
     */
    public void setBillCycle(final String value)
    {
        this.billCycle = value;
    }

    /**
     * TODO: Model Documentation for attribute billCycleCode
     * Get the billCycleCode Attribute
     * @return billCycleCode String
     */
    public String getBillCycleCode()
    {
        return this.billCycleCode;
    }

    /**
     * 
     * @param value String
     */
    public void setBillCycleCode(final String value)
    {
        this.billCycleCode = value;
    }

    /**
     * TODO: Model Documentation for attribute birthDate
     * Get the birthDate Attribute
     * @return birthDate String
     */
    public String getBirthDate()
    {
        return this.birthDate;
    }

    /**
     * 
     * @param value String
     */
    public void setBirthDate(final String value)
    {
        this.birthDate = value;
    }

    /**
     * TODO: Model Documentation for attribute bmbCode
     * Get the bmbCode Attribute
     * @return bmbCode String
     */
    public String getBmbCode()
    {
        return this.bmbCode;
    }

    /**
     * 
     * @param value String
     */
    public void setBmbCode(final String value)
    {
        this.bmbCode = value;
    }

    /**
     * TODO: Model Documentation for attribute creditLimit
     * Get the creditLimit Attribute
     * @return creditLimit Long
     */
    public Long getCreditLimit()
    {
        return this.creditLimit;
    }

    /**
     * 
     * @param value Long
     */
    public void setCreditLimit(final Long value)
    {
        this.creditLimit = value;
    }

    /**
     * TODO: Model Documentation for attribute csLevel
     * Get the csLevel Attribute
     * @return csLevel String
     */
    public String getCsLevel()
    {
        return this.csLevel;
    }

    /**
     * 
     * @param value String
     */
    public void setCsLevel(final String value)
    {
        this.csLevel = value;
    }

    /**
     * TODO: Model Documentation for attribute currentBalance
     * Get the currentBalance Attribute
     * @return currentBalance String
     */
    public String getCurrentBalance()
    {
        return this.currentBalance;
    }

    /**
     * 
     * @param value String
     */
    public void setCurrentBalance(final String value)
    {
        this.currentBalance = value;
    }

    /**
     * @param object to compare this object against
     * @return boolean if equal
     * @see Object#equals(Object)
     */
    @Override
    public boolean equals(final Object object)
    {
        if (object==null || object.getClass() != this.getClass())
        {
             return false;
        }
        // Check if the same object instance
        if (object==this)
        {
            return true;
        }
        CustomerDTO rhs = (CustomerDTO) object;
        return new EqualsBuilder()
            .append(this.getId(), rhs.getId())
            .append(this.getCustomerKey(), rhs.getCustomerKey())
            .append(this.getCustomerCode(), rhs.getCustomerCode())
            .append(this.getCustomerId(), rhs.getCustomerId())
            .append(this.getActivatedDate(), rhs.getActivatedDate())
            .append(this.getBillCycle(), rhs.getBillCycle())
            .append(this.getBillCycleCode(), rhs.getBillCycleCode())
            .append(this.getBirthDate(), rhs.getBirthDate())
            .append(this.getBmbCode(), rhs.getBmbCode())
            .append(this.getCreditLimit(), rhs.getCreditLimit())
            .append(this.getCsLevel(), rhs.getCsLevel())
            .append(this.getCurrentBalance(), rhs.getCurrentBalance())
            .isEquals();
    }

    /**
     * @param object to compare this object against
     * @return int if equal
     * @see Comparable#compareTo(Object)
     */
    public int compareTo(final CustomerDTO object)
    {
        if (object==null)
        {
            return -1;
        }
        // Check if the same object instance
        if (object==this)
        {
            return 0;
        }
        return new CompareToBuilder()
            .append(this.getId(), object.getId())
            .append(this.getCustomerKey(), object.getCustomerKey())
            .append(this.getCustomerCode(), object.getCustomerCode())
            .append(this.getCustomerId(), object.getCustomerId())
            .append(this.getActivatedDate(), object.getActivatedDate())
            .append(this.getBillCycle(), object.getBillCycle())
            .append(this.getBillCycleCode(), object.getBillCycleCode())
            .append(this.getBirthDate(), object.getBirthDate())
            .append(this.getBmbCode(), object.getBmbCode())
            .append(this.getCreditLimit(), object.getCreditLimit())
            .append(this.getCsLevel(), object.getCsLevel())
            .append(this.getCurrentBalance(), object.getCurrentBalance())
            .toComparison();
    }

    /**
     * @return int hashCode value
     * @see Object#hashCode()
     */
    @Override
    public int hashCode()
    {
        return new HashCodeBuilder(1249046965, -82296885)
            .append(this.getId())
            .append(this.getCustomerKey())
            .append(this.getCustomerCode())
            .append(this.getCustomerId())
            .append(this.getActivatedDate())
            .append(this.getBillCycle())
            .append(this.getBillCycleCode())
            .append(this.getBirthDate())
            .append(this.getBmbCode())
            .append(this.getCreditLimit())
            .append(this.getCsLevel())
            .append(this.getCurrentBalance())
            .toHashCode();
    }

    /**
     * @return String representation of object
     * @see Object#toString()
     */
    @Override
    public String toString()
    {
        return new ToStringBuilder(this)
            .append("id", this.getId())
            .append("customerKey", this.getCustomerKey())
            .append("customerCode", this.getCustomerCode())
            .append("customerId", this.getCustomerId())
            .append("activatedDate", this.getActivatedDate())
            .append("billCycle", this.getBillCycle())
            .append("billCycleCode", this.getBillCycleCode())
            .append("birthDate", this.getBirthDate())
            .append("bmbCode", this.getBmbCode())
            .append("creditLimit", this.getCreditLimit())
            .append("csLevel", this.getCsLevel())
            .append("currentBalance", this.getCurrentBalance())
            .toString();
    }

    /**
     * Compares the properties of this instance to the properties of the argument. This method will return
     * {@code false} as soon as it detects that the argument is {@code null} or not of the same type as
     * (or a sub-type of) this instance's type.
     *
     * <p/>For array, collection or map properties the comparison will be done one level deep, in other words:
     * the elements will be compared using the {@code equals()} operation.
     *
     * <p/>Note that two properties will be considered equal when both values are {@code null}.
     *
     * @param thatObject the object containing the properties to compare against this instance
     * @return this method will return {@code true} in case the argument has the same type as this class, or is a
     *      sub-type of this class and all properties as found on this class have equal values when queried on that
     *      argument instance; in all other cases this method will return {@code false}
     */
    public boolean equalProperties(final Object thatObject)
    {
        if (thatObject == null || !this.getClass().isAssignableFrom(thatObject.getClass()))
        {
            return false;
        }

        final CustomerDTO that = (CustomerDTO)thatObject;

        return
            equal(this.getId(), that.getId())
            && equal(this.getCustomerKey(), that.getCustomerKey())
            && equal(this.getCustomerCode(), that.getCustomerCode())
            && equal(this.getCustomerId(), that.getCustomerId())
            && equal(this.getActivatedDate(), that.getActivatedDate())
            && equal(this.getBillCycle(), that.getBillCycle())
            && equal(this.getBillCycleCode(), that.getBillCycleCode())
            && equal(this.getBirthDate(), that.getBirthDate())
            && equal(this.getBmbCode(), that.getBmbCode())
            && equal(this.getCreditLimit(), that.getCreditLimit())
            && equal(this.getCsLevel(), that.getCsLevel())
            && equal(this.getCurrentBalance(), that.getCurrentBalance())
        ;
    }

    /**
     * This is a convenient helper method which is able to detect whether or not two values are equal. Two values
     * are equal when they are both {@code null}, are arrays of the same length with equal elements or are
     * equal objects (this includes {@link java.util.Collection} and {@link java.util.Map} instances).
     *
     * <p/>Note that for array, collection or map instances the comparison runs one level deep.
     *
     * @param first the first object to compare, may be {@code null}
     * @param second the second object to compare, may be {@code null}
     * @return this method will return {@code true} in case both objects are equal as explained above;
     *      in all other cases this method will return {@code false}
     */
    protected static boolean equal(final Object first, final Object second)
    {
        final boolean equal;

        if (first == null)
        {
            equal = (second == null);
        }
        else if (first.getClass().isArray() && (second != null) && second.getClass().isArray())
        {
            equal = Arrays.equals((Object[])first, (Object[])second);
        }
        else // note that the following also covers java.util.Collection and java.util.Map
        {
            equal = first.equals(second);
        }

        return equal;
    }

    // CustomerDTO value-object java merge-point
}