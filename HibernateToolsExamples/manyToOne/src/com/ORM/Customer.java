/*
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 *
 * Created Thu Nov 16 21:25:40 CST 2006 by MyEclipse Hibernate Tool.
 */
package com.ORM;

import java.io.Serializable;

/**
 * A class that represents a row in the customer table. 
 * You can customize the behavior of this class by editing the class, {@link Customer()}.
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 */
public class Customer implements Serializable{
    /** The cached hash code value for this instance.  Settting to 0 triggers re-calculation. */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer id;

    /** The value of the simple cname property. */
    private java.lang.String cname;

    /** The value of the simple bank property. */
    private java.lang.String bank;

    /** The value of the simple phone property. */
    private java.lang.String phone;

    /**
     * Simple constructor of AbstractCustomer instances.
     */
    public Customer()
    {
    }

    /**
     * Constructor of AbstractCustomer instances given a simple primary key.
     * @param id
     */
    public Customer(java.lang.Integer id)
    {
        this.setId(id);
    }

    /**
     * Return the simple primary key value that identifies this object.
     * @return java.lang.Integer
     */
    public java.lang.Integer getId()
    {
        return id;
    }

    /**
     * Set the simple primary key value that identifies this object.
     * @param id
     */
    public void setId(java.lang.Integer id)
    {
        this.hashValue = 0;
        this.id = id;
    }

    /**
     * Return the value of the CNAME column.
     * @return java.lang.String
     */
    public java.lang.String getCname()
    {
        return this.cname;
    }

    /**
     * Set the value of the CNAME column.
     * @param cname
     */
    public void setCname(java.lang.String cname)
    {
        this.cname = cname;
    }

    /**
     * Return the value of the BANK column.
     * @return java.lang.String
     */
    public java.lang.String getBank()
    {
        return this.bank;
    }

    /**
     * Set the value of the BANK column.
     * @param bank
     */
    public void setBank(java.lang.String bank)
    {
        this.bank = bank;
    }

    /**
     * Return the value of the PHONE column.
     * @return java.lang.String
     */
    public java.lang.String getPhone()
    {
        return this.phone;
    }

    /**
     * Set the value of the PHONE column.
     * @param phone
     */
    public void setPhone(java.lang.String phone)
    {
        this.phone = phone;
    }

    /**
     * Implementation of the equals comparison on the basis of equality of the primary key values.
     * @param rhs
     * @return boolean
     */
    public boolean equals(Object rhs)
    {
        if (rhs == null)
            return false;
        if (! (rhs instanceof Customer))
            return false;
        Customer that = (Customer) rhs;
        if (this.getId() == null || that.getId() == null)
            return false;
        return (this.getId().equals(that.getId()));
    }

    /**
     * Implementation of the hashCode method conforming to the Bloch pattern with
     * the exception of array properties (these are very unlikely primary key types).
     * @return int
     */
    public int hashCode()
    {
        if (this.hashValue == 0)
        {
            int result = 17;
            int idValue = this.getId() == null ? 0 : this.getId().hashCode();
            result = result * 37 + idValue;
            this.hashValue = result;
        }
        return this.hashValue;
    }
}
