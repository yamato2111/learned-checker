<%@page contentType="text/html; charset=UTF-8" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>word checker</title>
</head>
<body>

<h1>RESULT</h1>
<p>${sentence}</p>
<p>あなたの授業実施日:
初級${userSetting.getLv()} - 
${userSetting.getLesson()}課 - 
${userSetting.getPart()}回目
</p>

<table border=1>
<tr>
<th>単語</th>
<th>状態</th>
<th>レベル</th>
<th>課</th>
<th>パート</th>
</tr>
<tr>
<c:forEach var="result" items="${resultList}">
<td>${result.getName()}</td>  
	<td><c:choose>
		<c:when test="${result.getIsAlreadyLeaned() == true}">既習</c:when>
		<c:when test="${result.getIsAlreadyLeaned() == false}">未習</c:when>
	</c:choose></td>
<td>初級${result.getLv()}</td>
<td>${result.getLesson()}課</td>
<td>${result.getPart()}回目</td>
</tr>
</c:forEach>
</table>
</body>
</html>