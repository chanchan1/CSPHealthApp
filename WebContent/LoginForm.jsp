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
		<title>yourHealth</title>
	</head>
	<body>
		<center>
			<h1>Login Page</h1>
			<h2>Signup Details</h2>
			<form action="LoginCheck.jsp" method="post">
				<br/>Username: <input type="text" name="username">
				<br/>Password: <input type="password" name="password">
				<br/><input type="submit" value="Submit">
			</form>
		</center>
	</body>
</html>