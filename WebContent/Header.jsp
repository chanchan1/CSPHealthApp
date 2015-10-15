<%-- Health Web Application
		Dozent: Dr. Christoph Peylo
		Teilnehmer: Sarah Schuchardt, Alexander Schmitz, Sebastian Dittrich
		=========================================================================
		created with Eclipse JEE running on ArchLinux, powered by Apache Tomcat 8 --%>
		
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<div class="container-fluid header">
	<div class="col-xs-1 col-md-1">
		<img alt="yourHealth-Logo" src="logo/base.png">
	</div>
	<div class="col-xs-1 col-xs-offset-2 col-md-2 col-md-offset-3">
		<h1>yourHealth</h1>
	</div>
	<div class="col-xs-1 col-xs-offset-6 col-md-1 col-md-offset-5">
		<h3>
			${username}  
			<a href="Help.jsp">?</a>
		</h3>
	</div>
</div>