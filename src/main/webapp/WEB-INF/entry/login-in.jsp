<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css">
<title>word checker</title>
</head>
<body>
<form action="check.Login.action" method="post">
<p>user name:<input type="text" name="name"></p>
<p>password:<input type="password" name="password"></p>
<p><input type="submit" value="login"></p>

</form>

</body>
</html>