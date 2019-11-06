<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Login</title>
</head>
<body>
	<form action="LoginController" method="post">
		Ten dang nhap :<input type="text" name="name">
		mat khau  : <input type="password" name="pass">
		<input type="submit" name="submit">	
	</form>
	<form action="RegisController" method="get">
		<input type="submit" value="dang ki">
	</form>
</body>
</html>