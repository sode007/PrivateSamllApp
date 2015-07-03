/*
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 *
 * Created Thu Nov 16 21:25:42 CST 2006 by MyEclipse Hibernate Tool.
 */
package com.ORM;

import java.io.Serializable;

/**
 * A class that represents a row in the orders table. 
 * You can customize the behavior of this class by editing the class, {@link Orders()}.
 * WARNING: DO NOT EDIT THIS FILE. This is a generated file that is synchronized
 * by MyEclipse Hibernate tool integration.
 */
public class Orders implements Serializable{
    /** The cached hash code value for this instance.  Settting to 0 triggers re-calculation. */
    private int hashValue = 0;

    /** The composite primary key value. */
    private java.lang.Integer id;

    /** The value of the simple orderno property. */
    private java.lang.String orderno;

    /** The value of the simple money property. */
    private java.lang.Double money;

    /** The value of the simple customerId property. */
    private Customer customer;

    /**
     * Simple constructor of AbstractOrders instances.
     */
    public Orders()
    {
    }

    /**
     * Constructor of AbstractOrders instances given a simple primary key.
     * @param id
     */
    public Orders(java.lang.Integer id)
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
     * Return the value of the ORDERNO column.
     * @return java.lang.String
     */
    public java.lang.String getOrderno()
    {
        return this.orderno;
    }

    /**
     * Set the value of the ORDERNO column.
     * @param orderno
     */
    public void setOrderno(java.lang.String orderno)
    {
        this.orderno = orderno;
    }

    /**
     * Return the value of the MONEY column.
     * @return java.lang.Double
     */
    public java.lang.Double getMoney()
    {
        return this.money;
    }

    /**
     * Set the value of the MONEY column.
     * @param money
     */
    public void setMoney(java.lang.Double money)
    {
        this.money = money;
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
        if (! (rhs instanceof Orders))
            return false;
        Orders that = (Orders) rhs;
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

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
