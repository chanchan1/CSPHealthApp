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
		<title>yourHealth Login</title>
		<link rel="stylesheet" href="style/yourHealth.css">
		<link rel="stylesheet" href="style/bootstrap.css">
	</head>
	<body>
		<!-- Header -->

		<center>
			<h1>Login Page</h1>
			<h2>Signup Details</h2>
			<form action="j_security_check" method="post">
				<br/>Username: <input type="text" name="j_username">
				<br/>Password: <input type="password" name="j_password">
				<br/><input type="submit" value="Submit">
			</form>
		</center>
	</body>
</html>