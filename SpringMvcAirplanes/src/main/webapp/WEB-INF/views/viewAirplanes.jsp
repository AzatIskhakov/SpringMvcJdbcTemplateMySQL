<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Airplanes List</title>
</head>
<body>
<h1>Airplanes List</h1>

<table border="2" width="60%" cellpadding="2">
	<tr>
		<th>Id</th>
		<th>Manufacturer</th>
		<th>Model</th>
		<th>City</th>
		<th>Registration Number</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<c:forEach var="airplane" items="${list}">
	<tr>
		<td>${airplane.airplaneId }</td>
		<td>${airplane.manufacturer }</td>
		<td>${airplane.model }</td>
		<td>${airplane.city }</td>
		<td>${airplane.registrationNumber }</td>
		<td><a href="editAirplanes/${airplane.airplaneId }">Edit</a></td>
		<td><a href="deleteAirplanes/${airplane.airplaneId }">Delete</a></td>
	</tr>
	</c:forEach>
</table>
<br/>
<a href="addAirplanes">Add New Airplane</a>
</body>
</html>