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
			����� ������ A�Դϴ�. </c:when>
		<c:when test="${score ge 80}">
			����� ������ B�Դϴ�. </c:when>
		<c:when test="${score ge 70}">
			����� ������ C�Դϴ�. </c:when>
		<c:when test="${score ge 60}">
			����� ������ D�Դϴ�. </c:when>
		<c:otherwise>
			����� ������ F�Դϴ�.
</c:otherwise>
	</c:choose>
</body>
</html>