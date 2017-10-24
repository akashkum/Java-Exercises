<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body bgcolor="#FFF8DC">
<h1>Account Summary On</h1>
${sessionScope.date}
<table width="500" align="center" bgcolor="#D0D0D0" border="1">
	<tr>
		<td>Subscriber Id:</td>
		<td>${sessionScope.sbean.subscriber_id}</td>
	</tr>
	<tr>
		<td>Account Balance:</td>
		<td>${sessionScope.sbean.account_balance}</td>
	</tr>
	<tr>
		<td>Recharge Due Date: </td>
		<td>${sessionScope.sbean.rechargedate}</td>
	</tr>
	<tr>
		<td>Recommended Recharge: </td>
		<td>${sessionScope.rr}</td>
	</tr>
	
</table>

<center>
	Click Here to<br/><br/><a href="Recharge.jsp">Recharge Amount</a>
</center>
</body>
</html>



