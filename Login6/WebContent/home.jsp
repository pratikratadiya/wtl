<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<%
response.setHeader("Cache-control", "no-cache");
response.setHeader("Cache-control", "no-store");
response.setHeader("Pragma", "no-store");
response.setDateHeader("Expires", 0);
if(session.getAttribute("name")==null){
	response.sendRedirect("Login.html");
}
else{
out.println("Welcome "+session.getAttribute("name"));

}

%>
<a href="Logout.jsp">Log Out!</a>
</body>
</html>