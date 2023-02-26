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

<h1>FUCK</h1>
<p>レベル：${userSentence.level}</p>
<p>課：${userSentence.lesson}</p>
<p>回：${userSentence.part}</p>
<p>文：${userSentence.sentence}</p>

<c:forEach var="word" items="${resultList}">
<c:out value="${word}" />
</c:forEach>
</body>
</html>