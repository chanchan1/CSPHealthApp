<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Hello World Test</title>
<link rel="stylesheet" href="style/bootstrap.css">
</head>
<body>
<div class="container-fluid">
<!-- Header -->


<!-- Content -->
<h1>Hello World from a JSP !</h1>
<form action="Test">
First Name: <input type="text" name="firstname"/>
First Name: <input type="text" name="lastname"/>
Age: <input type="text" name="age"/>
<input type="submit" value="ADD" />
</form>
<p>
<c:forEach items="${ps.lPersons}" var="person">
${person}</c:forEach>
</br>
</p>
</br>
</div>

<footer>
<ul class="nav nav-tabs">
  <li role="presentation" class="active"><a href="#">Home</a></li>
  <li role="presentation"><a href="#">Profile</a></li>
  <li role="presentation"><a href="#">Messages</a></li>
</ul>
</footer>
<!-- Footer -->
</body>
</html>