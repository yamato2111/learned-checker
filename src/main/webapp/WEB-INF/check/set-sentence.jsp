<%@page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/setpage.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Kiwi+Maru&display=swap" rel="stylesheet"></head>
<body>

<div class="container">
<div class="title">
<h1>授業実施時のレベルを選択</h1>
</div>
<div class="container">
<form action="action.SetUserInput.action" method="post">

<div class="level">
初級1<input type="radio" name="level" value="1" required><br>
初級2<input type="radio" name="level" value="2"  required>
</div>

<div class="lesson-part">
<input type="number" min="1" max="18" placeholder="半角" name="lesson" required>課
&nbsp;<input type="number" min="1" max="5" placeholder="半角" name="part" required>回目
</div>
<br>
<div class="title">
<h1>チェックする文を入力</h1>
</div>

<div class="sentence">
<p><input type="text" maxlength="30" placeholder="※30字を超えると切り捨てられます" name="sentence" method="post" required></p>
<input class="submitbtn" type="submit" value="確定">
</div>
</form>
</div>

</div>
</body>
</html>
