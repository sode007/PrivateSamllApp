<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="com.bean.TestBean"%>
<%@ page import="com.ORM.*"%>
<jsp:useBean id="test" class="com.bean.TestBean" />
<html>
  <head>
    <title>Hibernate的多对一单向关联关系映射</title>
  </head>
  
  <body>
  	<h2>Hibernate的多对一单向关联关系映射</h2>
	<hr>
	<%
		test.addCustomer();
		Integer id = new Integer(1);
		Customer customer = test.loadCustomer(id);
		test.addOrders(customer);
		test.addOrders(customer);
		test.addOrders(customer);
		Orders order1 = test.loadOrders(new Integer(1));
		Orders order2 = test.loadOrders(new Integer(2));
		Orders order3 = test.loadOrders(new Integer(3));				
		out.println("customer.getCname()="+customer.getCname());
		out.println("<br>");		
		out.println("<br>order1.getOrderno()="+order1.getOrderno());
		out.println("<br>order1.getMoney()="+order1.getMoney());
		out.println("<br>order1.getCustomer().getCname()="+order1.getCustomer().getCname());
		out.println("<br>");	
		out.println("<br>order2.getOrderno()="+order2.getOrderno());
		out.println("<br>order2.getMoney()="+order2.getMoney());
		out.println("<br>order2.getCustomer().getCname()="+order2.getCustomer().getCname());
		out.println("<br>");		
		out.println("<br>order3.getOrderno()="+order3.getOrderno());
		out.println("<br>order3.getMoney()="+order3.getMoney());
		out.println("<br>order3.getCustomer().getCname()="+order3.getCustomer().getCname());		
	%>
  </body>
</html>