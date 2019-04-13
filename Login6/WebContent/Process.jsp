<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Processing</title>
</head>
<body>
<%
String uname = request.getParameter("uname");

session.setAttribute("name",uname);
response.sendRedirect("home.jsp");
%>
</body>
</html>