<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
<meta charset="UTF-8">
<title>Form Login</title>
</head>
<body>
	<form action="LoginController" method="post">
		<p>Name:</p><input type="text" name="name">
		<p>Password:</p> <input type="password" name="pass">
		<p><input type="submit" name="submit" value="Login">	</p>
	</form>
	<form action="RegisController" method="get">
		<input type="submit" value="Regis">
	</form>
</body>
</html>