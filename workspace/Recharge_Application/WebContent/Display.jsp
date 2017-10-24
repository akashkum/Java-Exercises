<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body bgcolor="#FFF8DC">
<center>
<h3>*** RECHARGE DETAILS ***</h3>
</center>

<table width="700" align="center" border="1" bgcolor="#CCCCCC">
	<tr>
		<th>Recharge ID</th>
		<th>Operator</th>
		<th>Amount</th>
		<th>validity</th>
		<th>Click to Recharge </th>
	</tr>
	
	 <c:forEach var="recharge" items="${sessionScope.R}">
		<tr>
			<td>${recharge.rechargeId}</td>
			<td>${recharge.operator}</td>
			<td>${"Rs."}${recharge.amount}</td>
			<td>${recharge.validity}${"  Days" }</td>
			<td> <a href="a.jsp" >Click Here</a></td>
		<%-- <c:out value="<h1>hello</h1>" escapeXML="false">	 --%>
		</tr>
	</c:forEach> 
</table>
</body>
</html>