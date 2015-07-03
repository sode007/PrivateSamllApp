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
		company.setCompanyname("A��˾");
		company.setLinkman("����");
		company.setTelephone("020-12345678");
		company.setEmail("a@test.com");
		//�໥���ù���
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
		address.setProvince("�㶫ʡ");
		address.setCity("������");
		address.setStreet("������԰");
		address.setZipcode("510600");
		client.setClientname("������");
		client.setPhone("020-12345678");
		client.setEmail("a@test.com");
		//�໥���ù���
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
