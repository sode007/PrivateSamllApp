<%@ page language="java" pageEncoding="gb2312"%>
<%@ page import="com.bean.TestBean"%>
<%@ page import="com.ORM.*"%>
<jsp:useBean id="test" class="com.bean.TestBean" />
<html>
  <head>
    <title>Hibernate的一对一关联关系映射</title>
  </head>
  
  <body>
  	<h2>Hibernate的一对一关联关系映射</h2>
	<hr>
	<%
		test.addCompany();
		test.addClient();		
		Integer id = new Integer(1);
		Company company = test.loadCompany(id);
		Login login = company.getLogin();
		Client client = test.loadClient(id);
		Address address = client.getAddress();
		out.println("company.getCompanyname()="+company.getCompanyname());
		out.println("<br>company.getLinkman()="+company.getLinkman());
		out.println("<br>company.getTelephone()="+company.getTelephone());
		out.println("<br>login.getLoginname()="+login.getLoginname());
		out.println("<br>login.getLoginpwd()="+login.getLoginpwd());
		out.println("<br>");	
		out.println("<br>client.getClientname()="+client.getClientname());
		out.println("<br>client.getPhone()="+client.getPhone());
		out.println("<br>client.getEmail()="+client.getEmail());		
		out.println("<br>address.getProvince()="+address.getProvince());
		out.println("<br>address.getCity()="+address.getCity());
		out.println("<br>address.getStreet()="+address.getStreet());
		out.println("<br>address.getZipcode()="+address.getZipcode());
	%>
  </body>
</html>