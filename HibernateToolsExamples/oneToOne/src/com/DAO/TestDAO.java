package com.DAO;

import com.ORM.*;

public interface TestDAO {
	public void addCompany(Company company);
	public Company loadCompany(Integer id);
	public void delCompany(Integer id);
	
	public void addClient(Client client);
	public Client loadClient(Integer id);
	public void delClient(Integer id);	
}
