<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>JSTL core ���� - set, out, remove</title>
</head>
<body>
browser������ ����
<c:set var="browser" value="${header['User-Agent']}"/><br>
<c:out value="${browser}"/><p>
browser������ ���� ��
<c:remove var="browser"/>
<c:out value="${browser}"/>
</body>
</html>