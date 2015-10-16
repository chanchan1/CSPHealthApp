<%-- Health Web Application
		Dozent: Dr. Christoph Peylo
		Teilnehmer: Sarah Schuchardt, Alexander Schmitz, Sebastian Dittrich
		=========================================================================
		created with Eclipse JEE running on ArchLinux, powered by Apache Tomcat 8 --%>
		
<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="container-fluid header">
	<div class="row">
		<div class="col-xs-1 col-md-1">
			<a href="Home.jsp"><img alt="yourHealth-Logo" src="logo/base.png"></a>
		</div>
		<div class="col-xs-1 col-xs-offset-2 col-md-2 col-md-offset-3">
			<h1>yourHealth</h1>
		</div>
		<div class="col-xs-1 col-xs-offset-6 col-md-1 col-md-offset-5">
			<h3>
				<%= request.getUserPrincipal().getName() %>
				<a href="Help.jsp">?</a>
			</h3>
		</div>
	</div>
	<div class="row">
		<c:if test="${not empty error}">
			<div class="alert alert-danger" role="alert">
			${error}<br /></div>
		</c:if>
	</div>
</div>