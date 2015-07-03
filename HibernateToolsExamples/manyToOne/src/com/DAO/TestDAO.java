package com.DAO;

import com.ORM.*;

public interface TestDAO {
	public void addCustomer(Customer customer);
	public Customer loadCustomer(Integer id);
	public void delCustomer(Integer id);
	
	public void addOrders(Orders order);
	public Orders loadOrders(Integer id);
	public void delOrders(Integer id);
}
