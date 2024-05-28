<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Date date = new Date();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>여기는 전체 페이지 top page 내용 입니다.</h1>
	<h3>현재 날짜는 <%= date.toString() %></h3>
	<hr color='red'>
</body>
</html>