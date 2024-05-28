<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	private int number = 0;
	
	public void _jspInit(){
		System.out.println("_jspInint 호출됨");
	}
	public void _jspDestroy(){
		System.out.println("_jspDestroy 호출됨");
	}

%>
<%
	int localNumber = 0;
	number++;
	localNumber++;
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<ul>
		<li>멤버 변수 number = <%= number %></li>
		<li>지역 변수 localNumber = <%= localNumber %></li>
	</ul>

</body>
</html>