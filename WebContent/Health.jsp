<%-- Health Web Application
		Dozent: Dr. Christoph Peylo
		Teilnehmer: Sarah Schuchardt, Alexander Schmitz, Sebastian Dittrich
		=========================================================================
		created with Eclipse JEE running on ArchLinux, powered by Apache Tomcat 8 --%>
		
<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<html>
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

	<div class="container">
		<div class="panel panel-default">
  			<div class="panel-heading">Add Health Data</div>
  			<form action="AddHealthData" method="post">
				Height: <input type="text" name="height">
				Weight: <input type="text" name="weight">
				Allergies: <input type="text" name="allergies">
				Blood Sugar: <input type="text" name="bloodSugar">
				Cholesterol Level: <input type="text" name="cholesterolLevel">
				Blood Type: <input type="text" name="bloodType">
				<input type="submit" value="Add">
			</form>
  			<!-- <div class="panel-body">	
  			
  			<form action="AddHealthData" method="post">
				<div class="input-group">
	  				<span class="input-group-addon" id="basic-addon1">Height</span>
	  					<input type="text" class="form-control" placeholder="1,60" aria-describedby="basic-addon1">
					<span class="input-group-addon">m</span>
				</div>
	  			<div class="input-group">
	  				<span class="input-group-addon" id="basic-addon1">Weight</span>
	  					<input type="text" class="form-control" placeholder="60" aria-describedby="basic-addon1">
					<span class="input-group-addon">kg</span>
					</div>
	  			<div class="input-group">
	  				<span class="input-group-addon" id="basic-addon1">Allergies</span>
	  					<input type="text" class="form-control" placeholder="" aria-describedby="basic-addon1">
					</div>
				<div class="input-group">
	  				<span class="input-group-addon" id="basic-addon1">Blood Sugar</span>
	  					<input type="text" class="form-control" placeholder="" aria-describedby="basic-addon1">
					</div>
				<div class="input-group">
	  				<span class="input-group-addon" id="basic-addon1">Cholesterol Level</span>
	  					<input type="text" class="form-control" placeholder="" aria-describedby="basic-addon1">
					</div>
				<div class="input-group">
	  				<span class="input-group-addon" id="basic-addon1">Blood Type</span>
	  					<input type="text" class="form-control" placeholder="A,B,AB,0" aria-describedby="basic-addon1">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
	  			</div>
			</form>  -->
			</div>
		<h2>Health Data</h2>
		<table class="table table-striped">
			<thead>
				<tr>
					<td>Height</td>
					<td>Weight</td>
					<td>Allergies</td>
					<td>Blood Sugar</td>
					<td>Cholesterol Level</td>
					<td>Blood Type</td>
				</tr>
			</thead>
			<c:forEach items="${healthData.entries}" var="entry">
				<tr>
					<td>${entry.height}</td>
					<td>${entry.weight}</td>
					<td>${entry.allergies}</td>
					<td>${entry.bloodSugar}</td>
					<td>${entry.cholesterolLevel}</td>
					<td>${entry.bloodType}</td>
				</tr>
			</c:forEach>
		</table>
		
	</div>
	
	

	<!-- Footer -->
	<ul class="nav nav-tabs">
	  <li role="presentation"><a href="Home.jsp">&Uuml;bersicht</a></li>
	  <li role="presentation" class="active"><a href="Health.jsp">Health</a></li>
	  <li role="presentation"><a href="Fitness.jsp">Fitness</a></li>
	</ul>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>
