package com.ORM;

import java.io.Serializable;

public class Address implements Serializable{

    private int hashValue = 0;
    private java.lang.Integer id;
    private java.lang.String province;
    private java.lang.String city;
    private java.lang.String street;
    private java.lang.String zipcode;
    private Client client;

    public Address(){}

    public Address(java.lang.Integer id){
        this.setId(id);
    }

    public java.lang.Integer getId(){
        return id;
    }
    public void setId(java.lang.Integer id){
        this.hashValue = 0;
        this.id = id;
    }

    public java.lang.String getProvince(){
        return this.province;
    }
    public void setProvince(java.lang.String province){
        this.province = province;
    }

    public java.lang.String getCity(){
        return this.city;
    }
    public void setCity(java.lang.String city){
        this.city = city;
    }

    public java.lang.String getStreet(){
        return this.street;
    }
    public void setStreet(java.lang.String street){
        this.street = street;
    }

    public java.lang.String getZipcode(){
        return this.zipcode;
    }
    public void setZipcode(java.lang.String zipcode){
        this.zipcode = zipcode;
    }
    
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}    

    public boolean equals(Object rhs){
        if (rhs == null)
            return false;
        if (! (rhs instanceof Address))
            return false;
        Address that = (Address) rhs;
        if (this.getId() == null || that.getId() == null)
            return false;
        return (this.getId().equals(that.getId()));
    }

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
