<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1> Register New User</h1>
<h2>On Submission, you will receive a verification code for activation</h2>

<form action="register.do" method="post">
<table>
<tr><th></th><th> First Name </th> <th> Middle Name </th><th> Last Name </th></tr>
<tr><td>First Name :</td><td><input type="text" name="firstname"></td><td><input type="text" name="middlename"></td><td><input type="text" name="lastname"></td></tr>
<tr><td>Business Name :</td><td><input type="text" name="businessname" ></td></tr>
<tr><td>Email Id :</td><td><input type="text" name="emailid" ></td></tr>
<tr><td>Mobile No.:</td><td><input type="text" name="mobileno" ></td></tr>
<tr><td></td><td></td><td></td><td><input type="submit" name="register" value="Register" ><input type="reset" name="reset" value="Reset" ></td></tr>
</table>


</form>
</center>
</body>
</html>