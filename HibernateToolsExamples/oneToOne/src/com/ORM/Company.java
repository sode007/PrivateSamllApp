package com.ORM;

import java.io.Serializable;

public class Company implements Serializable{

    private int hashValue = 0;
    private java.lang.Integer id;
    private java.lang.String companyname;
    private java.lang.String linkman;
    private java.lang.String telephone;
    private java.lang.String email;
    private Login login;

    public Company(){}

    public Company(java.lang.Integer id){
        this.setId(id);
    }

    public java.lang.Integer getId(){
        return id;
    }
    public void setId(java.lang.Integer id){
        this.hashValue = 0;
        this.id = id;
    }

    public java.lang.String getCompanyname(){
        return this.companyname;
    }
    public void setCompanyname(java.lang.String companyname){
        this.companyname = companyname;
    }

    public java.lang.String getLinkman(){
        return this.linkman;
    }
    public void setLinkman(java.lang.String linkman){
        this.linkman = linkman;
    }

    public java.lang.String getTelephone(){
        return this.telephone;
    }
    public void setTelephone(java.lang.String telephone){
        this.telephone = telephone;
    }

    public java.lang.String getEmail(){
        return this.email;
    }
    public void setEmail(java.lang.String email){
        this.email = email;
    }
    
	public Login getLogin() {
		return login;
	}
	public void setLogin(Login login) {
		this.login = login;
	}    

    public boolean equals(Object rhs){
        if (rhs == null)
            return false;
        if (! (rhs instanceof Company))
            return false;
        Company that = (Company) rhs;
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
