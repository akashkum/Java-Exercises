<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body bgcolor="#FFF8DC">

<table width="500" align="center" bgcolor="#D0D0D0" border="1">
	<tr>
		<td>Consumer Number:</td>
		<td>${sessionScope.cbean.consumer_num}</td>
	</tr>
	<tr>
		<td>Consumer Name:</td>
		<td>${sessionScope.cbean.consumer_name}</td>
	</tr>
	<tr>
		<td>Consumer Address:</td>
		<td>${sessionScope.cbean.address}</td>
	</tr>
	
</table>

<center>
	<br/><br/><a href="Home.obj">Go Back To HomePage</a>
</center>
</body>
</html>