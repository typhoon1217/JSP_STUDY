<%@ page contentType="text/html;charset=euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String[] movieList = { "������극��ũ", "���ĸ�Ÿ��", "�������" };
request.setAttribute("movieList", movieList);
%>
<html>
<head>
<title>JSTL Example</title>
</head>
<body>
	�α� �̱� ��� :
	<ul>
		<c:forEach var="movie" items="${movieList}">
			<li>${movie}</li>
		</c:forEach>
	</ul>
</body>
</html>