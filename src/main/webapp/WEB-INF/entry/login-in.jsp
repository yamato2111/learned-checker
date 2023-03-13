<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Sawarabi+Gothic&family=Ubuntu:wght@500&display=swap" rel="stylesheet">
<title>既習 OR DIE</title>
</head>
<body>
<div class="loginwrap">
<div class="logincontent">

<form action="action.Login.action" method="post">
<div class="txtbox">
<p><input type="text" name="name" placeholder="username" required /></p>
<p><input type="password" name="password" placeholder="password" required /></p>
</div>
<input type="submit" value="login" class="loginbtn">
</form>
</div>
</div>
</body>
</html>