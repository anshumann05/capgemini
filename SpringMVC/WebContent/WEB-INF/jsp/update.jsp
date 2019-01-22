<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- for the first time this will be called with model attribute name empData and if the response will have no record for the search then,-->
	<c:if test="${ not empty empData}">
		<form:form action="/SpringMVC/search" modelAttribute="empData" method="POST">
			<form:label path="id">Enter The Id:</form:label>
			<form:input path="id"></form:input>
			<form:button value="submit">Search</form:button>
		</form:form>
	</c:if>
	<!-- this will be called with model attribute name noRecord -->
	<c:if test="${not empty noRecord}">
		<form:form action="/SpringMVC/search" method="POST" modelAttribute="noRecord">
			<form:label path="id">Enter The Id:</form:label>
			<form:input path="id"></form:input>
			<form:button value="submit">Search</form:button>
		</form:form>
		<h1>No Record Found!</h1>
	</c:if>
	<c:if test="${not empty empData.id && not empty empData}">
		<form:form action="/SpringMVC/updateEmployee" modelAttribute="empData" method="POST">
			<table>

				<tr>
					<th><form:label path="id">Id:</form:label></th>
					<td><form:input path="id" readonly="true"></form:input></td>
				</tr>
				<tr>
					<th><form:label path="name">Name:</form:label></th>
					<td><form:input path="name"></form:input></td>
				</tr>
				<tr>
					<th><form:label path="salary">Salary:</form:label></th>
					<td><form:input path="salary"></form:input></td>
				</tr>
				<tr>
					<th><form:label path="designation">Designation:</form:label></th>
					<td><form:input path="designation"></form:input></td>
				</tr>
				<tr>

					<td colspan="2"><form:button value="submit">Update</form:button></td>
				</tr>

			</table>
		</form:form>
	</c:if>
</body>
</html>