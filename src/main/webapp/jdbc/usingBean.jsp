<%@page import="jdbc.TempMemberVO"%>
<%@page import="java.util.Vector"%>
<%@page import="jdbc.DBPoolUtil"%>
<%@page import="jdbc.ConnectionPool"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>JSP에서 데이터베이스 연동</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="#FFFFCC">
	<h2>JSP 스크립틀릿에서 데이터베이스 연동 예제입니다....</h2>
	<br></br>
	<h3>회원정보</h3>
	<table bordercolor="#0000ff" border="1">
		<tr>
			<td><strong>ID</strong></td>
			<td><strong>PASSWD</strong></td>
			<td><strong>NAME</strong></td>
			<td><strong>MEM_NUM1</strong></td>
			<td><strong>MEM_NUM2</strong></td>
			<td><strong>E_MAIL</strong></td>
			<td><strong>PHONE</strong></td>
			<td><strong>ZIPCODE/ADDRESS</strong></td>
			<td><strong>JOB</strong></td>
		</tr>
		<jsp:useBean id="dao" class="jdbc.TempMemberDAO" scope="page" /> 
		<% 
        Vector<TempMemberVO> memberList = dao.getMemberList();
        int counter = 0;

        for (TempMemberVO tvo : memberList) {
        %>
		<tr>
			<td><%= tvo.getId() %></td>
			<td><%= tvo.getPasswd() %></td>
			<td><%= tvo.getName() %></td>
			<td><%= tvo.getMem_num1() %></td>
			<td><%= tvo.getMem_num2() %></td>
			<td><%= tvo.getEmail() %></td>
			<td><%= tvo.getPhone() %></td>
			<td><%= tvo.getZipcode() %>/<%= tvo.getAddress() %></td>
			<td><%= tvo.getJob() %></td>
		</tr>
		<%
            counter++;
        }
        %>
	</table>
	<br></br> total records :
	<%= counter %>
</body>
</html>