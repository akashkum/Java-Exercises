<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="empModule">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>

<script type="text/javascript" src="script/angular.js"></script>
<script src="script/EmpApp.js" type="text/javascript"></script>
</head>
<body>

  <h1> {{title}}</h1>
  <div ng-controller="empController">
  <h3>{{pageHead}}</h3>
  <table border="1" align="center">
	  <tr>
	  <th>Employee Number </th>
	  <th>Employee Name </th>
	  <th>View Details </th>
	   <th>Delete Employee </th>
	  </tr>
  
	   <tr ng-repeat="e in empList">
		   <td>{{e.empNo}} </td>
		   <td>{{e.empNm}} </td>
		   <td> <button ng-click="empDetails(e.empNo)">View</button></td>
		   <td> <button ng-click="empDelete(e.empNo)">Delete</button></td>
		  
	   </tr>

  </table>
  <table border="1" align="center">
	  <tr>
	  <th>Employee Number </th>
	  <th>Employee Name </th>
	  </tr>
	   <tr>
		   <td>{{emp.empNo}} </td>
		   <td>{{emp.empNm}} </td>
	  
	   </tr>

  </table>
  </div>
  <a href="getHomePage.do"> HomePage </a>
</body>
</html>