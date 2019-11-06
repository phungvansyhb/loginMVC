<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome member</title>
</head>
<body>
	<%;
		String s = (String)session.getAttribute("ssname");
	%>
	<h3>Xin chao <%=s %></h3>
	<form action="LogoutController" method="get">
		<input type="submit" value="logout">
	</form>
	<form action="TestConnController" method="get">
		<input type="submit" value="xem DB">
	</form>
</body>
</html>