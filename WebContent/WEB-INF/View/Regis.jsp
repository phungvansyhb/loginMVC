<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
<head>
<meta charset="UTF-8">
<title>Regis Page</title>
<style type="text/css">
p{
	color:red;
	font-style: italic;
	font-size: 10px;
}

</style>
<script type="text/javascript">
	function validate(){
		var name = document.form.name.value;
		var pass = document.form.password.value;
		var repass =  document.form.repassword.value;
		if(name==""){
			document.getElementById("message1").innerHTML="*không được để trống trường này!";
			return false;
		}else{
			document.getElementById("message1").innerHTML="";
			if(name.length<6)
				document.getElementById("message1").innerHTML="*tên phải chứa ít nhất 6 ký tự";
		}
		if(pass==""){
			document.getElementById("message2").innerHTML="*không được để trống trường này!";
			return false;
		}else{
			document.getElementById("message2").innerHTML="";
			if(pass.length<6)
				document.getElementById("message2").innerHTML="*mật khẩu chứa ít nhất 6 ký tự";
		}
		if(repass != pass){
			document.getElementById("message3").innerHTML="*mật khẩu không khớp!";
		}else{
			document.getElementById("message3").innerHTML="";
		}
		
	}
</script>
</head>
<body>
	<form action="RegisController" method="post" name = "form" onsubmit="return validate()">
		<h3>Name:</h3> <input type="text" name="name" onkeyup="validate()">
		<p id="message1"></p>
		<h3>Password:</h3><input type="password" name="password" onkeyup="validate()">
		<p id="message2"></p>
		
		<h3>Rewrite password:</h3><input type="password" name="repassword" onkeyup="validate()">
		<p id="message3"></p>
		
		<input type="submit" name="submit" value="Regis">
		
	</form>
</body>
</html>