<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
Sample JSP page!

<h4>
<%
	out.println("Good morning!");
	String name = "John Smith";
%>
</h4>

<div>
	<%= name.toUpperCase() %>
</div>

</body>
</html>