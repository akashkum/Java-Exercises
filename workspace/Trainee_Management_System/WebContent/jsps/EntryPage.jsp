<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<script src="jsLib/jquery-1.12.3.js" type="text/javascript"></script>
		<script src="jsLib/MyJsLib.js" type="text/javascript"></script>
	</head>
<body>
<h1>Enter Trainee Details</h1><br/>
<sf:form method="post" modelAttribute="trainee" action="submitTraineeDetails.do">
  <label for="id">Trainee Id</label>
  <sf:input path="id" for="id" type="text"/><br/>
  <label for="name">Trainee Name</label>
  <sf:input path="name" for="name" type="text"/><br/>
  <label for="location">Trainee Location</label>
  <sf:radiobutton path="location" for="location" value="Chennai"/>Chennai
  <sf:radiobutton path="location" for="location"  value="Bangalore" />Bangalore
  <sf:radiobutton path="location" for="location"  value="Pune"/>Pune
  <sf:radiobutton path="location" for="location" value="Mumbai"/>Mumbai<br/>
   <label for="domain">Trainee Domain</label>
   <sf:select path="domain">
  <sf:option value="JavaEE" />
  <sf:option  value=".NET" />
  <sf:option value="SAP" />
  <sf:option value="MainFrame" />
  </sf:select>
  <br/>  
  <input type="submit" value="Add Trainee">
</sf:form>

</body>
</html>