<%@page contentType="text/html; charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/result.css">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Kiwi+Maru&display=swap" rel="stylesheet"></head>
<title>既習 OR DIE</title>
</head>
<body>

<div class="wrap">
<h1>結果</h1>
<p>あなたの授業実施日:
初級${userSetting.getLv()} -
${userSetting.getLesson()}課  
${userSetting.getPart()}回目
</p>
<p>調査対象：${sentence}</p>

<table border=1>
<div class="tabletop">
<tr>
<th>単語</th>
<th>状態</th>
<th>レベル</th>
</tr>
</div>
<tr>
<c:forEach var="result" items="${resultList}">
	<td>${result.getName()}</td>  
	<td><c:choose>
		<c:when test="${result.getIsExistsInDB() == false}"><font color="orangered">未習</font></c:when>
		<c:when test="${result.getIsAlreadyLeaned() == true}">既習</c:when>
		<c:when test="${result.getIsAlreadyLeaned() == false}"><font color="orangered">未習</font></c:when>
	</c:choose></td>
	
	<td><c:choose>
	<c:when test="${result.getIsExistsInDB() == false}">教科書に無い語彙です。	</c:when>
	<c:when test="${result.getIsExistsInDB() == true}">初級${result.getLv()}-${result.getLesson()}課&nbsp;${result.getPart()}回目</c:when>
	
	</c:choose></td>
</tr>
</c:forEach>
</table>
<br>
<form></form>
<a href="action.Set.action">入力ページに戻る</a>
</div>
</body>
</html>