<%-- Health Web Application
		Dozent: Dr. Christoph Peylo
		Teilnehmer: Sarah Schuchardt, Alexander Schmitz, Sebastian Dittrich
		=========================================================================
		created with Eclipse JEE running on ArchLinux, powered by Apache Tomcat 8 --%>
		
<?xml version="1.0" encoding="ISO-8859-1" ?>
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
		<!-- Header -->
	<jsp:include page="Header.jsp"></jsp:include>
		<center>
			<h1>Register Details</h1>
			<form action="LoginCheck.jsp" method="post">
				<br/>Select a username: <input type="text" name="username">
				<br/>Provide a password: <input type="text" name="password">
				<br/>Confirm password: <input type="text" name="password">
				<br/><input type="submit" value="Submit">
			</form>
		</center>
		<jsp:include page="Footer.jsp"></jsp:include>
	</body>
</html>