<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"                    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="registrationform" action="register" method="post">
<p>
Enter your first name: <input type="text" name="fname"><br>
Enter your middle name: <input type="text" name="mname"><br>
Enter your last name: <input type="text" name="lname"><br>
</p><br>
<p>
Enter user name: <input type="text" name="username"><br>
</p><br>
<p>
Enter email id: <input type="text" name="emailid"><br>
Enter mobile number: <input type="text" name="mobno"><br>
Enter address: <textarea rows="5" cols="5" name="address"></textarea><br>
</p><br>
<p>
Enter the password: <input type="password" name="password1"><br>
Reenter the password: <input type="password" name="password2"><br>
</p><br>
<p>
<input type="submit">
</p><br>
</form>
</body>
</html>