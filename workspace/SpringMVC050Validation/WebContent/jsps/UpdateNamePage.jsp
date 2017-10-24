<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://w
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="jsLib/jquery-1.12.3.js" type="text/javascript"></script>
<script src="jsLib/MyJsLib.js" type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Name</title>
</head>
<body>
 <h1> Capgemini India pvt. ltd.</h1>
  <h3>${pageHead}</h3>
  
  <form action="submitNewEmployee.do">
  <label for="empNo"></label>
  <select name="empNo" >
  <c:forEach items="${idList}" var="empNo">
  <option value="${empNo}">${empNo}</option>
  </c:forEach>
  </select><br/>
   <label for="empNo"></label>
  <input type="text" name="newName" id="newName">
  <input type="submit" value="Submit">
  </form>
  
  
 
  
</body>
</html>