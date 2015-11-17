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
<link rel="icon" type="image/png" href="logo/favicon.ico">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Welcome to yourHealth! - Please login or register</title>
		<link rel="stylesheet" href="style/yourHealth.css">
		<link rel="stylesheet" href="style/bootstrap.css">
	</head>
	<body>
		<center>
			<!-- <h1>Welcome to yourHealth</h1> -->
			<img src="logo/base.png">
			<form action="Home.jsp" method="post">
				<br/><input type="submit" value="Login" style="width: 150px">
			</form>
			<form action="RegisterForm.jsp" method="post">
				<br/><input type="submit" value="Register" style="width: 150px">
			</form>
		</center>
	</body>
</html>
