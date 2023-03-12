<%@page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/setpage.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Sawarabi+Gothic&family=Ubuntu:wght@500&display=swap" rel="stylesheet">
<title>word checker</title>
</head>
<body>

<h2>授業実施時のレベルを選択</h2>
<div class="container">
<form action="action.SetUserInput.action" method="post">
<p>初級1<input type="radio" name="level" value="1" required>
初級2<input type="radio" name="level" value="2"  required></p>
<input type="number" min="1" max="18" placeholder="半角" name="lesson" required>課<br>
<input type="number" min="1" max="5" placeholder="半角" name="part" required>回目
<h2>チェックする文を入力</h2>
<p><textarea cols="30" rows="3" maxlength="30" placeholder="※30字超えると切り捨てられます。" name="sentence" method="post" required></textarea></p>
<input class="submitbtn" type="submit" value="確定">
</form>
</div>
</body>
</html>
