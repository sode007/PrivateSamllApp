package com.DAO;

import org.hibernate.*;
import com.ORM.*;

public class TestDAOImpl implements TestDAO {

	public void addCustomer(Customer customer) {
		Session session = MySessionFactory.currentSession();
		Transaction ts = null;
		try{
			ts = session.beginTransaction();
			session.save(customer);
			ts.commit();
		}catch(Exception ex){
			ts.rollback();
			System.out.println("【系统错误】在TestDAOImpl的addCustomer方法中出错：");
			ex.printStackTrace();			
		}finally{
			MySessionFactory.closeSession();
		}
	}

	public Customer loadCustomer(Integer id) {
		Session session = MySessionFactory.currentSession();
		Transaction ts = null;
		Customer customer = null;
		try{
			ts = session.beginTransaction();
			customer = (Customer)session.get(Customer.class,id);
			ts.commit();
		}catch(Exception ex){
			ts.rollback();
			System.out.println("【系统错误】在TestDAOImpl的loadCustomer方法中出错：");
			ex.printStackTrace();			
		}finally{
			MySessionFactory.closeSession();
		}
		return customer;
	}

	public void delCustomer(Integer id) {
		Session session = MySessionFactory.currentSession();
		Transaction ts = null;
		try{
			ts = session.beginTransaction();
			Customer customer = (Customer)session.load(Customer.class,id);
			session.delete(customer);
			ts.commit();
		}catch(Exception ex){
			ts.rollback();
			System.out.println("【系统错误】在TestDAOImpl的delCustomer方法中出错：");
			ex.printStackTrace();			
		}finally{
			MySessionFactory.closeSession();
		}
	}

	public void addOrders(Orders order) {
		Session session = MySessionFactory.currentSession();
		Transaction ts = null;
		try{
			ts = session.beginTransaction();
			session.save(order);
			ts.commit();
		}catch(Exception ex){
			ts.rollback();
			System.out.println("【系统错误】在TestDAOImpl的addOrders方法中出错：");
			ex.printStackTrace();			
		}finally{
			MySessionFactory.closeSession();
		}
	}

	public Orders loadOrders(Integer id) {
		Session session = MySessionFactory.currentSession();
		Transaction ts = null;
		Orders order = null;
		try{
			ts = session.beginTransaction();
			order = (Orders)session.get(Orders.class,id);
			ts.commit();
		}catch(Exception ex){
			ts.rollback();
			System.out.println("【系统错误】在TestDAOImpl的loadOrders方法中出错：");
			ex.printStackTrace();			
		}finally{
			MySessionFactory.closeSession();
		}
		return order;
	}

	public void delOrders(Integer id) {
		Session session = MySessionFactory.currentSession();
		Transaction ts = null;
		try{
			ts = session.beginTransaction();
			Orders order = (Orders)session.load(Orders.class,id);
			session.delete(order);
			ts.commit();
		}catch(Exception ex){
			ts.rollback();
			System.out.println("【系统错误】在TestDAOImpl的delOrders方法中出错：");
			ex.printStackTrace();			
		}finally{
			MySessionFactory.closeSession();
		}
	}
}