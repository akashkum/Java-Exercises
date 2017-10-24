<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
         <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <script src="jsLib/jquery-1.12.3.js" type="text/javascript"></script>
  <script src="jsLib/MyJsLib.js" type="text/javascript"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>   
<center>                                     <!-- Message for Printing Error Message  -->
<h1> Welcome to Leave Management System</h1>
  <c:if test="${message ne null}">
 <h3>${message}</h3>
</c:if>
  
                                          <!-- Form for taking input of Employee Id -->
 <form action="viewleavedetails.do" method="post">
 <b>Enter Employee Id :</b> <input type="text" name="id" pattern="[0-9]*" required><br/>
 <input type="submit" value="View Leave History">    <!-- Submit Button for Submitting Employee Id -->
                                                       
 </form>
   
 </center>
</body>
</html>




