<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:useBean id="dao" class="memberone.StudentDAO" />
<%
String id = request.getParameter("id");
boolean check = dao.idCheck(id);
%>
<html>
<head>
<title>ID중복체크</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="script.js"></script>
</head>
<body bgcolor="#FFFFCC">
	<br>
	<center>
		<b><span id="idCheckResult"><%=id%></span></b>
		<%
		int flag = 1;
		if (check) {
			out.println("<span style='color: red; background-color: yellow;'>는 이미 존재하는 ID입니다.</span><br></br>");
			flag = 1;
		} else {
			out.println("<span style='color: green; background-color: lightgreen;'>는 사용 가능 합니다.</span><br></br>");
			flag = 2;
		}
		%>
		<a href="#" onClick="closeWindow(<%=flag%>)">닫기</a>
	</center>
</body>
</html>
