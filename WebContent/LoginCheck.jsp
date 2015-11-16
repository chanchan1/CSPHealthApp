<%-- Health Web Application
		Dozent: Dr. Christoph Peylo
		Teilnehmer: Sarah Schuchardt, Alexander Schmitz, Sebastian Dittrich
		=========================================================================
		created with Eclipse JEE running with Java 1.8, powered by Apache Tomcat 8 --%>
		
<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>yourHealth</title>
	</head>
	<body>
		<% 
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			
			if((username.equals("user") && password.equals("password")))
				{
				session.setAttribute("username",username);
				response.sendRedirect("Home.jsp");
				}
			else
				response.sendRedirect("Error.jsp");
		%>
	</body>
</html>