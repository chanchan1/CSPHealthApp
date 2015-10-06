<%-- Health Web Application
		Dozent: Dr. Christoph Peylo
		Teilnehmer: Sarah Schuchardt, Alexander Schmitz, Sebastian Dittrich
		=========================================================================
		created with Eclipse JEE running on ArchLinux, powered by Apache Tomcat 8 --%>
		
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>youHealth</title>
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