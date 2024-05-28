<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<% response.setStatus(HttpServletResponse.SC_OK); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예외 발생</title>
</head>
<body>
	<h2>요청 처리 과정에서 예외가 발생하였습니다.</h2>
	빨리 조치 할게요. <br>
	에러타입 <%= exception.getClass().getName() %><br>
	message <%= exception.getMessage() %>
</body>
</html>