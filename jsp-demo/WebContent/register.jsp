<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>
<%@ page import="com.demo.service.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="service" class="com.demo.service.EmployeeService"></jsp:useBean>
<jsp:useBean id="emp" class="com.demo.model.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="emp"/>
<%
	/*
	String ename = request.getParameter("ename");
	int eage = Integer.parseInt(request.getParameter("eage"));
	double esal = Double.parseDouble(request.getParameter("esal"));
	
	emp.setEname(ename);
	emp.setEage(eage);
	emp.setEsal(esal);*/
	
	//EmployeeService service = new EmployeeService();
	int y = service.insert(emp);
	out.println(y + " row(s) inserted!");
%>

</body>
</html>