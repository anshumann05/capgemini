<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>

		<c:if test="${empty listOfEmployees }">
			<h1>No Record Found!</h1>
		</c:if>
		<c:if test="${not empty listOfEmployees}">
			<h1>List of Employee:</h1>
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Salary</th>
					<th>Designation</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="employee" items="${listOfEmployees}">
					<tr>
						<td>${employee.id}</td>
						<td>${employee.name}</td>
						<td>${employee.salary}</td>
						<td>${employee.designation}</td>
					</tr>
				</c:forEach>
			</tbody>
		</c:if>
	</table>
	<button><a href= "/SpringMVC/">HOME</a></button>
</body>
</html>