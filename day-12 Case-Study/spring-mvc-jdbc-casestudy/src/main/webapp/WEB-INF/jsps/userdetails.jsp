<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table border="1">
	<tr>
		<th>athlete Id</th>
		<th>athlete Name</th>
		<th>athlete Gender</th>
		<th>athlete Category</th>
		<th>athlete Email</th>
		<th>athlete Mobile</th>
	</tr>
	<c:forEach var="user" items="${userList}">
	<tr>
		<td>${user.athleteId}</td>
		<td>${user.athleteName}</td>
		<td>${user.athleteGender}</td>
		<td>${user.category}</td>
		<td>${user.athleteEmail}</td>
		<td>${user.athleteMobile}</td>
	</tr>	

	</c:forEach>
</table>





</body>
</html>