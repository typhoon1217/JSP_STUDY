<%@ page contentType="text/html;charset=euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
int score = 85;
request.setAttribute("score", score);
%>
<html>
<head>
<title>JSTL Example</title>
</head>
<body>
	<c:choose>
		<c:when test="${score ge 90}">
			당신의 성적은 A입니다. </c:when>
		<c:when test="${score ge 80}">
			당신의 성적은 B입니다. </c:when>
		<c:when test="${score ge 70}">
			당신의 성적은 C입니다. </c:when>
		<c:when test="${score ge 60}">
			당신의 성적은 D입니다. </c:when>
		<c:otherwise>
			당신의 성적은 F입니다.
</c:otherwise>
	</c:choose>
</body>
</html>