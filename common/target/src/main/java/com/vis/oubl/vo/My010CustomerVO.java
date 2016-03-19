// license-header java merge-point
//
/**
 * @author Generated on 03/19/2016 08:16:09+0200 Do not modify by hand!
 *
 * TEMPLATE:     ValueObject.vsl in andromda-java-cartridge.
 * MODEL CLASS:  Data::com.vis.oubl::vo::My010CustomerVO
 * STEREOTYPE:   ValueObject
 */
package com.vis.oubl.vo;

import java.io.Serializable;
import java.util.Arrays;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang.builder.CompareToBuilder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

/**
 * TODO: Model Documentation for class My010CustomerVO
 */
@XmlRootElement(name = "My010CustomerVO")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "My010CustomerVO", // namespace="http://vo.oubl.vis.com/",
  propOrder = {
    "id",
    "firstName",
    "lastName",
    "middleName",
    "identityNumber",
    "insuranceNumber",
    "address",
    "mobileNumber",
    "telephoneNumber",
    "nationality",
    "type"
})
public class My010CustomerVO
    implements Serializable, Comparable<My010CustomerVO>
{
    /** The serial version UID of this class. Needed for serialization. */
    private static final long serialVersionUID = 4955246053614888138L;

    // Class attributes
    /** TODO: Model Documentation for attribute id */
    @XmlElement(name = "id")
    protected Long id;
    /** TODO: Model Documentation for attribute firstName */
    @XmlElement(name = "firstName")
    protected String firstName;
    /** TODO: Model Documentation for attribute lastName */
    @XmlElement(name = "lastName")
    protected String lastName;
    /** TODO: Model Documentation for attribute middleName */
    @XmlElement(name = "middleName")
    protected String middleName;
    /** TODO: Model Documentation for attribute identityNumber */
    @XmlElement(name = "identityNumber")
    protected Integer identityNumber;
    /** TODO: Model Documentation for attribute insuranceNumber */
    @XmlElement(name = "insuranceNumber")
    protected Integer insuranceNumber;
    /** TODO: Model Documentation for attribute address */
    @XmlElement(name = "address")
    protected String address;
    /** TODO: Model Documentation for attribute mobileNumber */
    @XmlElement(name = "mobileNumber")
    protected Long mobileNumber;
    /** TODO: Model Documentation for attribute telephoneNumber */
    @XmlElement(name = "telephoneNumber")
    protected Integer telephoneNumber;
    /** TODO: Model Documentation for attribute nationality */
    @XmlElement(name = "nationality")
    protected String nationality;
    /** TODO: Model Documentation for attribute type */
    @XmlElement(name = "type")
    protected String type;

    /** Default Constructor with no properties */
    public My010CustomerVO()
    {
        // Documented empty block - avoid compiler warning - no super constructor
    }

    /**
     * Constructor taking only required properties
     * @param firstNameIn String
     * @param lastNameIn String
     * @param middleNameIn String
     * @param addressIn String
     * @param nationalityIn String
     * @param typeIn String
     */
    public My010CustomerVO(final String firstNameIn, final String lastNameIn, final String middleNameIn, final String addressIn, final String nationalityIn, final String typeIn)
    {
        this.firstName = firstNameIn;
        this.lastName = lastNameIn;
        this.middleName = middleNameIn;
        this.address = addressIn;
        this.nationality = nationalityIn;
        this.type = typeIn;
    }

    /**
     * Constructor with all properties
     * @param idIn Long
     * @param firstNameIn String
     * @param lastNameIn String
     * @param middleNameIn String
     * @param identityNumberIn Integer
     * @param insuranceNumberIn Integer
     * @param addressIn String
     * @param mobileNumberIn Long
     * @param telephoneNumberIn Integer
     * @param nationalityIn String
     * @param typeIn String
     */
    public My010CustomerVO(final Long idIn, final String firstNameIn, final String lastNameIn, final String middleNameIn, final Integer identityNumberIn, final Integer insuranceNumberIn, final String addressIn, final Long mobileNumberIn, final Integer telephoneNumberIn, final String nationalityIn, final String typeIn)
    {
        this.id = idIn;
        this.firstName = firstNameIn;
        this.lastName = lastNameIn;
        this.middleName = middleNameIn;
        this.identityNumber = identityNumberIn;
        this.insuranceNumber = insuranceNumberIn;
        this.address = addressIn;
        this.mobileNumber = mobileNumberIn;
        this.telephoneNumber = telephoneNumberIn;
        this.nationality = nationalityIn;
        this.type = typeIn;
    }

    /**
     * Copies constructor from other My010CustomerVO
     *
     * @param otherBean Cannot be <code>null</code>
     * @throws NullPointerException if the argument is <code>null</code>
     */
    public My010CustomerVO(final My010CustomerVO otherBean)
    {
        this.id = otherBean.getId();
        this.firstName = otherBean.getFirstName();
        this.lastName = otherBean.getLastName();
        this.middleName = otherBean.getMiddleName();
        this.identityNumber = otherBean.getIdentityNumber();
        this.insuranceNumber = otherBean.getInsuranceNumber();
        this.address = otherBean.getAddress();
        this.mobileNumber = otherBean.getMobileNumber();
        this.telephoneNumber = otherBean.getTelephoneNumber();
        this.nationality = otherBean.getNationality();
        this.type = otherBean.getType();
    }

    /**
     * Copies all properties from the argument value object into this value object.
     * @param otherBean Cannot be <code>null</code>
     */
    public void copy(final My010CustomerVO otherBean)
    {
        if (null != otherBean)
        {
            this.setId(otherBean.getId());
            this.setFirstName(otherBean.getFirstName());
            this.setLastName(otherBean.getLastName());
            this.setMiddleName(otherBean.getMiddleName());
            this.setIdentityNumber(otherBean.getIdentityNumber());
            this.setInsuranceNumber(otherBean.getInsuranceNumber());
            this.setAddress(otherBean.getAddress());
            this.setMobileNumber(otherBean.getMobileNumber());
            this.setTelephoneNumber(otherBean.getTelephoneNumber());
            this.setNationality(otherBean.getNationality());
            this.setType(otherBean.getType());
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
     * TODO: Model Documentation for attribute firstName
     * Get the firstName Attribute
     * @return firstName String
     */
    public String getFirstName()
    {
        return this.firstName;
    }

    /**
     * 
     * @param value String
     */
    public void setFirstName(final String value)
    {
        this.firstName = value;
    }

    /**
     * TODO: Model Documentation for attribute lastName
     * Get the lastName Attribute
     * @return lastName String
     */
    public String getLastName()
    {
        return this.lastName;
    }

    /**
     * 
     * @param value String
     */
    public void setLastName(final String value)
    {
        this.lastName = value;
    }

    /**
     * TODO: Model Documentation for attribute middleName
     * Get the middleName Attribute
     * @return middleName String
     */
    public String getMiddleName()
    {
        return this.middleName;
    }

    /**
     * 
     * @param value String
     */
    public void setMiddleName(final String value)
    {
        this.middleName = value;
    }

    /**
     * TODO: Model Documentation for attribute identityNumber
     * Get the identityNumber Attribute
     * @return identityNumber Integer
     */
    public Integer getIdentityNumber()
    {
        return this.identityNumber;
    }

    /**
     * 
     * @param value Integer
     */
    public void setIdentityNumber(final Integer value)
    {
        this.identityNumber = value;
    }

    /**
     * TODO: Model Documentation for attribute insuranceNumber
     * Get the insuranceNumber Attribute
     * @return insuranceNumber Integer
     */
    public Integer getInsuranceNumber()
    {
        return this.insuranceNumber;
    }

    /**
     * 
     * @param value Integer
     */
    public void setInsuranceNumber(final Integer value)
    {
        this.insuranceNumber = value;
    }

    /**
     * TODO: Model Documentation for attribute address
     * Get the address Attribute
     * @return address String
     */
    public String getAddress()
    {
        return this.address;
    }

    /**
     * 
     * @param value String
     */
    public void setAddress(final String value)
    {
        this.address = value;
    }

    /**
     * TODO: Model Documentation for attribute mobileNumber
     * Get the mobileNumber Attribute
     * @return mobileNumber Long
     */
    public Long getMobileNumber()
    {
        return this.mobileNumber;
    }

    /**
     * 
     * @param value Long
     */
    public void setMobileNumber(final Long value)
    {
        this.mobileNumber = value;
    }

    /**
     * TODO: Model Documentation for attribute telephoneNumber
     * Get the telephoneNumber Attribute
     * @return telephoneNumber Integer
     */
    public Integer getTelephoneNumber()
    {
        return this.telephoneNumber;
    }

    /**
     * 
     * @param value Integer
     */
    public void setTelephoneNumber(final Integer value)
    {
        this.telephoneNumber = value;
    }

    /**
     * TODO: Model Documentation for attribute nationality
     * Get the nationality Attribute
     * @return nationality String
     */
    public String getNationality()
    {
        return this.nationality;
    }

    /**
     * 
     * @param value String
     */
    public void setNationality(final String value)
    {
        this.nationality = value;
    }

    /**
     * TODO: Model Documentation for attribute type
     * Get the type Attribute
     * @return type String
     */
    public String getType()
    {
        return this.type;
    }

    /**
     * 
     * @param value String
     */
    public void setType(final String value)
    {
        this.type = value;
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
        My010CustomerVO rhs = (My010CustomerVO) object;
        return new EqualsBuilder()
            .append(this.getId(), rhs.getId())
            .append(this.getFirstName(), rhs.getFirstName())
            .append(this.getLastName(), rhs.getLastName())
            .append(this.getMiddleName(), rhs.getMiddleName())
            .append(this.getIdentityNumber(), rhs.getIdentityNumber())
            .append(this.getInsuranceNumber(), rhs.getInsuranceNumber())
            .append(this.getAddress(), rhs.getAddress())
            .append(this.getMobileNumber(), rhs.getMobileNumber())
            .append(this.getTelephoneNumber(), rhs.getTelephoneNumber())
            .append(this.getNationality(), rhs.getNationality())
            .append(this.getType(), rhs.getType())
            .isEquals();
    }

    /**
     * @param object to compare this object against
     * @return int if equal
     * @see Comparable#compareTo(Object)
     */
    public int compareTo(final My010CustomerVO object)
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
            .append(this.getFirstName(), object.getFirstName())
            .append(this.getLastName(), object.getLastName())
            .append(this.getMiddleName(), object.getMiddleName())
            .append(this.getIdentityNumber(), object.getIdentityNumber())
            .append(this.getInsuranceNumber(), object.getInsuranceNumber())
            .append(this.getAddress(), object.getAddress())
            .append(this.getMobileNumber(), object.getMobileNumber())
            .append(this.getTelephoneNumber(), object.getTelephoneNumber())
            .append(this.getNationality(), object.getNationality())
            .append(this.getType(), object.getType())
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
            .append(this.getFirstName())
            .append(this.getLastName())
            .append(this.getMiddleName())
            .append(this.getIdentityNumber())
            .append(this.getInsuranceNumber())
            .append(this.getAddress())
            .append(this.getMobileNumber())
            .append(this.getTelephoneNumber())
            .append(this.getNationality())
            .append(this.getType())
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
            .append("firstName", this.getFirstName())
            .append("lastName", this.getLastName())
            .append("middleName", this.getMiddleName())
            .append("identityNumber", this.getIdentityNumber())
            .append("insuranceNumber", this.getInsuranceNumber())
            .append("address", this.getAddress())
            .append("mobileNumber", this.getMobileNumber())
            .append("telephoneNumber", this.getTelephoneNumber())
            .append("nationality", this.getNationality())
            .append("type", this.getType())
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

        final My010CustomerVO that = (My010CustomerVO)thatObject;

        return
            equal(this.getId(), that.getId())
            && equal(this.getFirstName(), that.getFirstName())
            && equal(this.getLastName(), that.getLastName())
            && equal(this.getMiddleName(), that.getMiddleName())
            && equal(this.getIdentityNumber(), that.getIdentityNumber())
            && equal(this.getInsuranceNumber(), that.getInsuranceNumber())
            && equal(this.getAddress(), that.getAddress())
            && equal(this.getMobileNumber(), that.getMobileNumber())
            && equal(this.getTelephoneNumber(), that.getTelephoneNumber())
            && equal(this.getNationality(), that.getNationality())
            && equal(this.getType(), that.getType())
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

    // My010CustomerVO value-object java merge-point
}