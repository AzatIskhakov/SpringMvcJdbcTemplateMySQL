<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Airplane</title>
</head>
<body>
<h1>Edit Airplane</h1>
<form:form method="post" action="/SpringMvcAirplanes/editAndSave">
<table>
	<tr>
		<td>Airpalne ID:</td>
		<td><form:input path="airplaneId" readonly="true"/></td>
	</tr>
	<tr>
		<td>Manufacturer</td>
		<td><form:input path="manufacturer"/></td>
	</tr>
	<tr>
		<td>Model</td>
		<td><form:input path="model"/></td>
	</tr>
	<tr>
		<td>City Name</td>
		<td><form:input path="city"/></td>
	</tr>
	<tr>
		<td>Registration Number</td>
		<td><form:input path="registrationNumber"/></td>
	</tr>
	<tr>
		<td></td>
		<td><input type="submit" value="Save"/></td>
	</tr>
</table>
</form:form>

</body>
</html>
