<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<script src="jsLib/jquery-1.12.3.js" type="text/javascript"></script>
		<script src="jsLib/MyJsLib.js" type="text/javascript"></script>
	</head>
<body>

<sf:form method="post" modelAttribute="trainee" action="DeleteTraineeDetails.do">
  <label for="id">Trainee Id</label>
  <sf:input path="id" for="id" type="text"/><br/>
  <input type="submit" value="Delete Trainee">
</sf:form>
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
<form method="post" action="delete.do">
<fieldset>
<input type="submit" value="Delete" >
<input type="hidden" name="id" value="${trainee.id}">
</fieldset>
</form>
</c:if>

</body>
</html>