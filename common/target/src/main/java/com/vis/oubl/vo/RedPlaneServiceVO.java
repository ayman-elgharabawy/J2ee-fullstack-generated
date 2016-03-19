// license-header java merge-point
//
/**
 * @author Generated on 03/19/2016 08:16:09+0200 Do not modify by hand!
 *
 * TEMPLATE:     ValueObject.vsl in andromda-java-cartridge.
 * MODEL CLASS:  Data::com.vis.oubl::vo::RedPlaneServiceVO
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
 * TODO: Model Documentation for class RedPlaneServiceVO
 */
@XmlRootElement(name = "RedPlaneServiceVO")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedPlaneServiceVO", // namespace="http://vo.oubl.vis.com/",
  propOrder = {
    "id",
    "msisdn"
})
public class RedPlaneServiceVO
    implements Serializable, Comparable<RedPlaneServiceVO>
{
    /** The serial version UID of this class. Needed for serialization. */
    private static final long serialVersionUID = -8658117017986284864L;

    // Class attributes
    /** TODO: Model Documentation for attribute id */
    @XmlElement(name = "id")
    protected Integer id;
    /** TODO: Model Documentation for attribute msisdn */
    @XmlElement(name = "msisdn")
    protected String msisdn;

    /** Default Constructor with no properties */
    public RedPlaneServiceVO()
    {
        // Documented empty block - avoid compiler warning - no super constructor
    }

    /**
     * Constructor taking only required properties
     * @param msisdnIn String
     */
    public RedPlaneServiceVO(final String msisdnIn)
    {
        this.msisdn = msisdnIn;
    }

    /**
     * Constructor with all properties
     * @param idIn Integer
     * @param msisdnIn String
     */
    public RedPlaneServiceVO(final Integer idIn, final String msisdnIn)
    {
        this.id = idIn;
        this.msisdn = msisdnIn;
    }

    /**
     * Copies constructor from other RedPlaneServiceVO
     *
     * @param otherBean Cannot be <code>null</code>
     * @throws NullPointerException if the argument is <code>null</code>
     */
    public RedPlaneServiceVO(final RedPlaneServiceVO otherBean)
    {
        this.id = otherBean.getId();
        this.msisdn = otherBean.getMsisdn();
    }

    /**
     * Copies all properties from the argument value object into this value object.
     * @param otherBean Cannot be <code>null</code>
     */
    public void copy(final RedPlaneServiceVO otherBean)
    {
        if (null != otherBean)
        {
            this.setId(otherBean.getId());
            this.setMsisdn(otherBean.getMsisdn());
        }
    }

    /**
     * TODO: Model Documentation for attribute id
     * Get the id Attribute
     * @return id Integer
     */
    public Integer getId()
    {
        return this.id;
    }

    /**
     * 
     * @param value Integer
     */
    public void setId(final Integer value)
    {
        this.id = value;
    }

    /**
     * TODO: Model Documentation for attribute msisdn
     * Get the msisdn Attribute
     * @return msisdn String
     */
    public String getMsisdn()
    {
        return this.msisdn;
    }

    /**
     * 
     * @param value String
     */
    public void setMsisdn(final String value)
    {
        this.msisdn = value;
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
        RedPlaneServiceVO rhs = (RedPlaneServiceVO) object;
        return new EqualsBuilder()
            .append(this.getId(), rhs.getId())
            .append(this.getMsisdn(), rhs.getMsisdn())
            .isEquals();
    }

    /**
     * @param object to compare this object against
     * @return int if equal
     * @see Comparable#compareTo(Object)
     */
    public int compareTo(final RedPlaneServiceVO object)
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
            .append(this.getMsisdn(), object.getMsisdn())
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
            .append(this.getMsisdn())
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
            .append("msisdn", this.getMsisdn())
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

        final RedPlaneServiceVO that = (RedPlaneServiceVO)thatObject;

        return
            equal(this.getId(), that.getId())
            && equal(this.getMsisdn(), that.getMsisdn())
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

    // RedPlaneServiceVO value-object java merge-point
}