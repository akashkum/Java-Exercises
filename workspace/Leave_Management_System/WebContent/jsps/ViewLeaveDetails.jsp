<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Leave Details List</title>
</head>
<script src="jsLib/jquery-1.12.3.js" type="text/javascript"></script>
<script src="jsLib/MyJsLib.js" type="text/javascript"></script>
<body>
  <center>
  <h3>Leave History Details...</h3>
 <b>Employee ID : ${emp.empid}   &nbsp; Employee Name : ${emp.ename} </b>
  <c:if test="${key eq 1}">    <!--  For LeaveList Not Empty -->
  <table border="1" align="center">
	  <tr>
	  <th>Start Date </th>
	  <th>End Date </th>
	  <th>Description </th>
	  <th>No of Days </th>
	  </tr>
	  <c:forEach items="${LeaveList}" var="leave">   <!-- Iterating the List using ForEach -->
	  
	   <tr>
		   <td>${leave.start_date} </td>
		   <td>${leave.end_date} </td>
		   <td>${leave.description} </td>
		   <td>${leave.leaves_applied} </td>
		   
	   </tr>
	 
	  </c:forEach>
 
  </table>
  </c:if>
  
  <br/> <c:if test="${key eq 0}">   <!-- Printing message in case of no Leave Record -->
   <h3>${message}</h3>
    </c:if>
  <b> <a href="getHomePage.do" >HomePage</a> </b>
  </center>
</body>
</html>