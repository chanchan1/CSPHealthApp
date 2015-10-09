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
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>yourHealth</title>
		<link rel="stylesheet" href="style/yourHealth.css">
		<link rel="stylesheet" href="style/bootstrap.css">
	</head>
	<body>
	<!-- Header -->
	<div class="container-fluid header">
		<div class="col-xs-1 col-md-1">
			<img alt="yourHealth-Logo" src="logo/base.png">
		</div>
		<div class="col-xs-1 col-xs-offset-2 col-md-2 col-md-offset-3">
			<h1>yourHealth</h1>
		</div>
		<div class="col-xs-1 col-xs-offset-6 col-md-1 col-md-offset-5">
			<%//TODO: eingeloggten User anzeigen
				//String a=session.getAttribute("username").toString();
				//out.println("Hello " + a);
			%>
			user
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-md-10 col-md-offset-1">
				<h2>
					<%
						
						out.println("Hi there!");
					%>
				</h2>
			</div>
		</div>
		<div class="row">
			<div class="col-md-10 col-md-offset-1">
				<img alt="overview" src="img/overview.PNG">
			</div>
		</div>
	</div>
	
	<!-- Footer -->
	<footer>
		<ul class="nav nav-tabs">
		  <li role="presentation" class="active"><a href="#">Home</a></li>
		  <li role="presentation"><a href="#">Profile</a></li>
		  <li role="presentation"><a href="#">Messages</a></li>
		</ul>
	<hr/>	
	<div style="text-align:right">Impressum <a href="Logout.jsp">Logout</a></div>
	
	</footer>

	</body>
</html>