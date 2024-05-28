<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!//선언문
	int no = 10; //멤버변수. 멤버함수도 동일하게 선언%>
<%
//수행문
String name = "suk jin"; //지역변수
%>
<%-- 주석문 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Hello jsp</h2>
	<h3>
		현재 날짜와 시간은
		<%=new Date()%></h3>
		<h3>
		당신의 이름은
		<%= name %></h3>
</body>
</html>