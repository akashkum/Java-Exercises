<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${pageHead}</h3>

<form action="getIndividualDetails.do" method="post">

Please Enter a Trainee Id : <input type="text" name="id">
<input type="submit" value="Retrieve">
</form>

<br/>
<br/>
<c:if test="${key eq 1}">

<table border="1" align="center">
	<tr>
	  <th>Trainee Id </th>
	  <th>Trainee Name </th>
	  <th>Trainee Location </th>
	  <th>Trainee Domain</th>
	  </tr>
	  
	  
	   <tr>
		   <td>${trainee.id} </td>
		   <td>${trainee.name} </td>
		   <td>${trainee.location} </td>
		   <td>${trainee.domain} </td>
		  
	   </tr> 
  </table>
</c:if>

</body>
</html>