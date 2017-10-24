<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="modify.do" method="post">
Please Enter Trainee Id :<input type="text" name="id">
<input type="submit" value="Modify">
</form>

<br/>
<br/>
<c:if test="${key eq 1}">
<table>
 <sf:form method="post" modelAttribute="trainee" action="finalmodify.do">
  <tr><td>Trainee Id</td>
  <td><sf:input path="id" type="text" placeholder="${trainee.id}"/></td></tr>
  <tr><td>Trainee Name</td>
  <td><sf:input path="name"  type="text" placeholder="${trainee.name}"/></td></tr>
  <tr><td>Trainee Location</td>
  <td><sf:input path="location"  type="text" placeholder="${trainee.location}"/></td></tr>
  <tr><td>Trainee Domain</td>
  <td><sf:input path="domain" type="text" placeholder="${trainee.domain}"/></td></tr>
  <tr><td><input type="submit" value="Modify Trainee"/></td></tr>
 
</sf:form>
 </table>
</c:if>






</body>
</html>