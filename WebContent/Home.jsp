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
<jsp:include page="Header.jsp"></jsp:include>

	<div class="container">
		<div class="row">
			<div class="col-md-10 col-md-offset-1">
				<img alt="overview" src="img/overview.PNG">
			</div>
		</div>
	</div>
	
	<!-- Footer -->
	<ul class="nav nav-tabs">
	  <li role="presentation" class="active"><a href="Home.jsp">Übersicht</a></li>
	  <li role="presentation"><a href="Health.jsp">Health</a></li>
	  <li role="presentation"><a href="Fitness.jsp">Fitness</a></li>
	</ul>
	<jsp:include page="Footer.jsp"></jsp:include>

	</body>
</html>