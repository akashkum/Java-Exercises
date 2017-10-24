<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trainee List</title>
</head>
<script src="jsLib/jquery-1.12.3.js" type="text/javascript"></script>
<script src="jsLib/MyJsLib.js" type="text/javascript"></script>
<body>
  <center><h2>${pageHead}</h2></center>
  <table border="1" align="center">
	  <tr>
	  <th>Trainee Id </th>
	  <th>Trainee Name </th>
	  <th>Trainee Location </th>
	  <th>Trainee Domain </th>
	  </tr>
	  <c:forEach items="${tlist}" var="tl">
	  
	   <tr>
		   <td>${tl.id} </td>
		   <td>${tl.name} </td>
		    <td>${tl.location} </td>
		   <td>${tl.domain} </td>
		   
	   </tr>
	 
	  </c:forEach>
 
  </table>
</body>
</html>