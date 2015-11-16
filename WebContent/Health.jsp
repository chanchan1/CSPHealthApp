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
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>CSPHealthApp Health Data</title>
		<link rel="stylesheet" href="style/yourHealth.css">
		<link rel="stylesheet" href="style/bootstrap.css">
		<script language="javascript" type="text/javascript"
			src="scripts/lib/jquery-2.1.4.js"></script>
		<script language="javascript" type="text/javascript"
			src="scripts/lib/d3.js"></script>
		<script language="javascript" type="text/javascript"
			src="scripts/lib/bootstrap.js"></script>
		<script language="javascript" type="text/javascript"
			src="scripts/yourHealth.js"></script>
	</head>
	<body>
	<!-- Header -->
	<jsp:include page="Header.jsp"></jsp:include>

	<div class="container" id="body-container">
	<div class="row">
		<div class="col-md-6">
			<h2>Health Data</h2>
			<table id="HealthDataTable" class="table table-striped">
				<thead>
					<tr>
						<td>Date</td>
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
						<td>${entry.creationDate}</td>
						<td class="decimal"></td>
						<td class="decimal">${entry.weight}</td>
						<td>${entry.allergies}</td>
						<td class="decimal">${entry.bloodSugar}</td>
						<td class="decimal">${entry.cholesterolLevel}</td>
						<td>${entry.bloodType}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
		<div class="col-md-6">
		<h2>Add Health Data</h2>
			<div class="panel panel-default">
  			<div class="panel-body">	
  			
  			<form action="AddHealthData" method="post">
					<div class="row">
						<div class="col-md-6">
							<div class="input-group">
								<span class="input-group-addon" id="basic-addon1">Height</span>
				  					<input type="text" class="form-control" placeholder="1,60" name="height" aria-describedby="basic-addon1">
								<span class="input-group-addon">m</span>
							</div>
						</div>
						<div class="col-md-6">
							<div class="input-group">
				  				<span class="input-group-addon" id="basic-addon1">Weight</span>
				  					<input type="text" class="form-control" placeholder="60" name="weight" aria-describedby="basic-addon1">
								<span class="input-group-addon">kg</span>
							</div>
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="input-group">
	  							<span class="input-group-addon" id="basic-addon1">Allergies</span>
	  								<input type="text" class="form-control" placeholder="Staub, Pollen, ..." name="allergies" aria-describedby="basic-addon1">
							</div>		
						</div>
						<div class="col-md-6">
							<div class="input-group">
	  							<span class="input-group-addon" id="basic-addon1">Blood Sugar</span>
	  								<input type="text" class="form-control" placeholder="5,0" name="bloodSugar" aria-describedby="basic-addon1">
							</div>		
						</div>
					</div>
					<div class="row">
						<div class="col-md-6">
							<div class="input-group">
	  							<span class="input-group-addon" id="basic-addon1">Cholesterol Level</span>
	  								<input type="text" class="form-control" placeholder="1,0" name="cholesterolLevel" aria-describedby="basic-addon1">
							</div>
						</div>
						<div class="col-md-6">
							<div class="input-group">
	  							<span class="input-group-addon" id="basic-addon1">Blood Type</span>
	  								<select name="bloodType" class="form-control" aria-describedby="basic-addon1">
	  									<option>A</option>
	  									<option>B</option>
	  									<option>AB</option>
	  									<option>0</option>
	  								</select>
							</div>
						</div>
					</div>
					<div class="row">
					<button type="submit" class="btn btn-default center-block">Submit</button>
					</div>
					
	  			</div>
			</form> 
			</div>
		</div>
	</div>
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
