<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>
${param.Name}<br>
${param.Age}<br>
${param.Company}<br>
${paramValues.tech[0]}<br>
${paramValues.tech[1]}<br>
${paramValues.tech[2]}<br>
${param["tech"]}<br>  <!-- This is the alternative of param.Name and param.Age -->

 
<%-- <%= request.getParameter("Name").trim()--%>
<%--<%= request.getParameter("Age").trim()--%>
<%--<%= request.getParameter("Company").trim()--%> 




</body>
</html>