package com.DAO;

import org.hibernate.*;
import com.ORM.*;

public class TestDAOImpl implements TestDAO {

	public void addCompany(Company company) {
		Session session = MySessionFactory.currentSession();
		Transaction ts = null;
		try{
			ts = session.beginTransaction();
			session.save(company);
			ts.commit();
		}catch(Exception ex){
			ts.rollback();
			System.out.println("【系统错误】在TestDAOImpl的addCompany方法中出错：");
			ex.printStackTrace();			
		}finally{
			MySessionFactory.closeSession();
		}
	}

	public Company loadCompany(Integer id) {
		Session session = MySessionFactory.currentSession();
		Transaction ts = null;
		Company company = null;
		try{
			ts = session.beginTransaction();
			company = (Company)session.get(Company.class,id);
			ts.commit();
		}catch(Exception ex){
			ts.rollback();
			System.out.println("【系统错误】在TestDAOImpl的loadCompany方法中出错：");
			ex.printStackTrace();			
		}finally{
			MySessionFactory.closeSession();
		}
		return company;
	}

	public void delCompany(Integer id) {
		Session session = MySessionFactory.currentSession();
		Transaction ts = null;
		try{
			ts = session.beginTransaction();
			Company company = (Company)session.load(Company.class,id);
			session.delete(company);
			ts.commit();
		}catch(Exception ex){
			ts.rollback();
			System.out.println("【系统错误】在TestDAOImpl的delCompany方法中出错：");
			ex.printStackTrace();			
		}finally{
			MySessionFactory.closeSession();
		}
	}

	public void addClient(Client client) {
		Session session = MySessionFactory.currentSession();
		Transaction ts = null;
		try{
			ts = session.beginTransaction();
			session.save(client);
			ts.commit();
		}catch(Exception ex){
			ts.rollback();
			System.out.println("【系统错误】在TestDAOImpl的addClient方法中出错：");
			ex.printStackTrace();			
		}finally{
			MySessionFactory.closeSession();
		}
	}

	public Client loadClient(Integer id) {
		Session session = MySessionFactory.currentSession();
		Transaction ts = null;
		Client client = null;
		try{
			ts = session.beginTransaction();
			client = (Client)session.get(Client.class,id);
			ts.commit();
		}catch(Exception ex){
			ts.rollback();
			System.out.println("【系统错误】在TestDAOImpl的loadClient方法中出错：");
			ex.printStackTrace();			
		}finally{
			MySessionFactory.closeSession();
		}
		return client;
	}

	public void delClient(Integer id) {
		Session session = MySessionFactory.currentSession();
		Transaction ts = null;
		try{
			ts = session.beginTransaction();
			Client client = (Client)session.load(Client.class,id);
			session.delete(client);
			ts.commit();
		}catch(Exception ex){
			ts.rollback();
			System.out.println("【系统错误】在TestDAOImpl的delClient方法中出错：");
			ex.printStackTrace();			
		}finally{
			MySessionFactory.closeSession();
		}
	}
}
