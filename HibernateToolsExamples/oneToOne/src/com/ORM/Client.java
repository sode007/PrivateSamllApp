package com.ORM;

import java.io.Serializable;

public class Client implements Serializable{

    private int hashValue = 0;
    private java.lang.Integer id;
    private java.lang.String clientname;
    private java.lang.String phone;
    private java.lang.String email;
    private Address address;

    public Client(){}

    public Client(java.lang.Integer id){
        this.setId(id);
    }

    public java.lang.Integer getId(){
        return id;
    }
    public void setId(java.lang.Integer id){
        this.hashValue = 0;
        this.id = id;
    }

    public java.lang.String getClientname(){
        return this.clientname;
    }
    public void setClientname(java.lang.String clientname){
        this.clientname = clientname;
    }

    public java.lang.String getPhone(){
        return this.phone;
    }
    public void setPhone(java.lang.String phone){
        this.phone = phone;
    }

    public java.lang.String getEmail(){
        return this.email;
    }
    public void setEmail(java.lang.String email){
        this.email = email;
    }

    public Address getAddress(){
        return this.address;
    }
    public void setAddress(Address address){
        this.address = address;
    }

    public boolean equals(Object rhs){
        if (rhs == null)
            return false;
        if (! (rhs instanceof Client))
            return false;
        Client that = (Client) rhs;
        if (this.getId() == null || that.getId() == null)
            return false;
        return (this.getId().equals(that.getId()));
    }

    public int hashCode(){
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
