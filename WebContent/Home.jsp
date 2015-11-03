<%-- Health Web Application
		Dozent: Dr. Christoph Peylo
		Teilnehmer: Sarah Schuchardt, Alexander Schmitz, Sebastian Dittrich
		=========================================================================
		created with Eclipse JEE running on ArchLinux, powered by Apache Tomcat 8 --%>

<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>yourHealth</title>
<link rel="stylesheet" href="style/yourHealth.css"></link>
<link rel="stylesheet" href="style/bootstrap.css"></link>
<script language="javascript" type="text/javascript"
	src="scripts/lib/jquery-2.1.4.js"></script>
<script language="javascript" type="text/javascript"
	src="scripts/lib/d3.js"></script>
<script language="javascript" type="text/javascript"
	src="scripts/lib/bootstrap.js"></script>
<script language="javascript" type="text/javascript"
	src="scripts/yourHealth.js"></script>
<script language="javascript" type="text/javascript"
	src="scripts/overview_chart.js"></script>
</head>
<body>
	<!-- Header -->
	<jsp:include page="Header.jsp"></jsp:include>

	<div class="container" id="body-container">
		<div class="row">
			<!-- Nav tabs -->
			<ul id="chart_tab" class="nav nav-tabs" role="tablist">
				<li role="presentation" class="active"><a href="#day"
					aria-controls="day" role="tab" data-toggle="tab">Day</a></li>
				<li role="presentation"><a href="#week" aria-controls="week"
					role="tab" data-toggle="tab">Week</a></li>
				<li role="presentation"><a href="#month" aria-controls="month"
					role="tab" data-toggle="tab">Month</a></li>
			</ul>

			<!-- Tab panes -->
			<div class="tab-content">
				<div role="tabpanel" class="tab-pane active" id="day"></div>
				<div role="tabpanel" class="tab-pane" id="week"></div>
				<div role="tabpanel" class="tab-pane" id="month"></div>
			</div>
		</div>
	</div>

	<!-- Footer -->
	<ul class="nav nav-tabs">
		<li role="presentation" class="active"><a href="Home.jsp">&Uuml;bersicht</a></li>
		<li role="presentation"><a href="Health.jsp">Health</a></li>
		<li role="presentation"><a href="Fitness.jsp">Fitness</a></li>
	</ul>
	<jsp:include page="Footer.jsp"></jsp:include>

	<script type="text/javascript" language="javascript">
		$(document).ready(function() {
			add_event_handler();
			draw_chart("Day");
		})
	</script>

</body>
</html>