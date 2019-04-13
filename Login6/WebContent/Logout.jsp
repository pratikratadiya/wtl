<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logout page</title>
</head>
<body>
<%

session.setAttribute("name",null);
request.getSession().invalidate();
response.sendRedirect("Login.html");
%>
</body>
</html>