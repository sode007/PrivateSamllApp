package com.bean;

import java.util.Random;
import com.ORM.*;
import com.DAO.*;

public class TestBean {
	TestDAO dao = new TestDAOImpl();
	Random rnd = new Random();
	
	public void addCustomer(){
		Customer customer = new Customer();
		customer.setCname("ÕÅÈý");
		customer.setBank("123456789123456789");
		customer.setPhone("020-12345678");
		dao.addCustomer(customer);
	}
	
	public Customer loadCustomer(Integer id){
		return dao.loadCustomer(id);
	}
	
	public void delCustomer(Integer id){
		dao.delCustomer(id);
	}
	
	public void addOrders(Customer customer){
		Orders order = new Orders();
		order.setOrderno(new Long(System.currentTimeMillis()).toString());
		order.setMoney(new Double(rnd.nextDouble()*10000));
		order.setCustomer(customer);
		dao.addOrders(order);
	}
	
	public Orders loadOrders(Integer id){
		return dao.loadOrders(id);
	}
	
	public void delOrders(Integer id){
		dao.delOrders(id);
	}	
}