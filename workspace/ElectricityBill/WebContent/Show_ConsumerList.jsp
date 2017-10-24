<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>::View Donations::</title>
</head>
<body bgcolor="#FFF8DC">

<!-- Display Error Message if not Retrieved -->

<table width="700" align="center" border="1" bgcolor="#CCCCCC">
	<tr>
		<th>User ID</th>
		<th>UserName</th>
		<th>Address</th>
		
	</tr>
	<c:forEach var="cust" items="${sessionScope.clist}">
		<tr>
			<td>${cust.consumer_num}</td>
			<td>${cust.consumer_name}</td>
			<td>${cust.address}</td>
			
		</tr>
	</c:forEach>
</table>

<center><br/>
<a href="Home.obj">Go Back To HomePage</a>
</center>
</body>
</html>