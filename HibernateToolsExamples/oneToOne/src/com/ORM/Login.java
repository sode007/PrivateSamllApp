package com.ORM;

import java.io.Serializable;

public class Login implements Serializable{

    private int hashValue = 0;
    private java.lang.Integer id;
    private java.lang.String loginname;
    private java.lang.String loginpwd;
    private Company company;

    public Login(){}

    public Login(java.lang.Integer id){
        this.setId(id);
    }

    public java.lang.Integer getId(){
        return id;
    }
    public void setId(java.lang.Integer id){
        this.hashValue = 0;
        this.id = id;
    }

    public java.lang.String getLoginname(){
        return this.loginname;
    }
    public void setLoginname(java.lang.String loginname){
        this.loginname = loginname;
    }

    public java.lang.String getLoginpwd(){
        return this.loginpwd;
    }
    public void setLoginpwd(java.lang.String loginpwd){
        this.loginpwd = loginpwd;
    }
    
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}    

    public boolean equals(Object rhs){
        if (rhs == null)
            return false;
        if (! (rhs instanceof Login))
            return false;
        Login that = (Login) rhs;
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
