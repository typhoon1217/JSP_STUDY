<%@ page contentType="text/html; charset=euc-kr"%>
<%@ page session="true"%>
<%
request.setAttribute("name", "�̽���");
%>
<html>
<head>
<title>EL Object</title>
</head>
<body>
	��û URI: ${pageContext.request.requestURI}
	<br></br> request�� name �Ӽ�: ${requestScope.name}
	<br></br> code �Ķ����: ${param.code}
	<br></br>
</body>
</html>