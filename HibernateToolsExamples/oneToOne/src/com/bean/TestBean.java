package com.bean;

import com.ORM.*;
import com.DAO.*;

public class TestBean {
	TestDAO dao = new TestDAOImpl();
	
	public void addCompany(){
		Company company = new Company();
		Login login = new Login();
		login.setLoginname("test");
		login.setLoginpwd("123");
		company.setCompanyname("A公司");
		company.setLinkman("张三");
		company.setTelephone("020-12345678");
		company.setEmail("a@test.com");
		//相互设置关联
		login.setCompany(company);	
		company.setLogin(login);		
		dao.addCompany(company);
	}
	
	public Company loadCompany(Integer id){
		return dao.loadCompany(id);
	}
	
	public void delCompany(Integer id){
		dao.delCompany(id);
	}
	
	public void addClient(){
		Client client = new Client();
		Address address = new Address();
		address.setProvince("广东省");
		address.setCity("广州市");
		address.setStreet("天河软件园");
		address.setZipcode("510600");
		client.setClientname("张老三");
		client.setPhone("020-12345678");
		client.setEmail("a@test.com");
		//相互设置关联
		address.setClient(client);
		client.setAddress(address);
		dao.addClient(client);
	}
	
	public Client loadClient(Integer id){
		return dao.loadClient(id);
	}
	
	public void delClient(Integer id){
		dao.delClient(id);
	}	
}
