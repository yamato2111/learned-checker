<%@page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>word checker</title>
</head>
<body>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/style.css">

<div class="top">
<h1>授業実施時のレベルを選択</h1>
<form action="check.SetUserInput.action" method="post">
初級1<input type="radio" name="level" value="1" >
初級2<input type="radio" name="level" value="2" ><br>
<p><input type="text" size="1" name="lesson">課</p>
<p><input type="text" size="1" name="part">回目</p>
<p>チェックする文を入力</p>
<p><textarea cols="30" rows="5" name="sentence" method="post"></textarea></p>
<input type="submit" value="確定">
</form>
</div>
</body>
</html>

