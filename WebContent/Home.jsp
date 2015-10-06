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
		<title>youHealth</title>
	</head>
	<body>
		<br/><br/><br/><br/><br/>
		<center>
			<h2>
				<%
					String a=session.getAttribute("username").toString();
					out.println("Hello " + a);
				%>
			</h2>
			<br/>
			<br/>
			<br/><br/><br/><br/><br/>
			<a href="Logout.jsp">Logout</a>
		</center>
	</body>
</html>