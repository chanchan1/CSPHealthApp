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
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>Health Data</title>
		<link rel="stylesheet" href="style/yourHealth.css">
		<link rel="stylesheet" href="style/bootstrap.css">
	</head>
	<body>
	<!-- Header -->
	<jsp:include page="Header.jsp"></jsp:include>

	<div class="container" id="body-container">
		<h1>NOT IMPLEMENTED YET!</h1>
	</div>
	
	

	<!-- Footer -->
	<ul class="nav nav-tabs">
	  <li role="presentation"><a href="Home.jsp">&Uuml;bersicht</a></li>
	  <li role="presentation" ><a href="Health.jsp">Health</a></li>
	  <li role="presentation" class="active"><a href="Fitness.jsp">Fitness</a></li>
	</ul>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>
