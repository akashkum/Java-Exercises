<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script src="jsLib/jquery-1.12.3.js" type="text/javascript"></script>
<script src="jsLib/MyJsLib.js" type="text/javascript"></script>
<body>
<h1> Trainee Details</h1>
  <h3>${pageHead}</h3>
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
  <a href="InsertTrainee.do"> Add New Trainee </a><br/>
  <a href="getHomePage.do">Go Back to Main Menu </a>
</body>
</html>





 