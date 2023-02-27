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
<p>あなたの授業実施日
初級${userSetting.getLv()}
${userSetting.getLesson()}課
${userSetting.getPart()}回目
</p>

<c:forEach var="result" items="${resultList}">
単語：${result.getName()}
初級${result.getLv()}
${result.getLesson()}課
${result.getPart()}回目
	<c:choose>
		<c:when test="${result.getIsAlreadyLeaned() == true}">既習</c:when>
		<c:when test="${result.getIsAlreadyLeaned() == false}">未習</c:when>
	</c:choose>
	<br>
</c:forEach>
</body>
</html>