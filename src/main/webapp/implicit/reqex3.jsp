<%@ page contentType="text/html; charset=euc-kr"%>
<%@ page import="java.util.Enumeration"%>
<html>
<head>
<title>��� ��� ���</title>
</head>
<body>
	<%
	Enumeration enumData = request.getHeaderNames();
	while (enumData.hasMoreElements()) {
		String headerName = (String) enumData.nextElement();
		String headerValue = request.getHeader(headerName);
	%>
	<%=headerName%>
	=
	<%=headerValue%>
	<br></br>
	<%
	}
	%>
</body>
</html>