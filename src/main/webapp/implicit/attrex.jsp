<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=EUC-KR"%>
<%
//pageContext Scope에 속성 저장하기
pageContext.setAttribute("pageAttribute", "홍길동");
//pageContext.setAttribute(
// "pageAttribute", "홍길동", PageContext.PAGE_SCOPE);
//request Scope에 속성 저장하기
request.setAttribute("requestAttribute", "010-9531-0114");
//pageContext.setAttribute("requestAttribute",
// "010-9531-0114", PageContext.REQUEST_SCOPE);
//session Scope에 속성 저장하기
session.setAttribute("sessionAttribute", "stdio@hanmail.net");
//pageContext.setAttribute("sessionAttribute",
// "stdio@hanmail.net", PageContext.SESSION_SCOPE);
//application Scope에 속성 저장하기
application.setAttribute("applicationAttribute", "MIRE Information");
//pageContext.setAttribute("applicaionAttribute",
// "MIRE Information", PageContext.APPLICATION_SCOPE);
%>
<html>
<head>
<title>Scope Example</title>
</head>
<body>
<ul>
<li>이름 : <%=pageContext.getAttribute("pageAttribute") %></li>
<li>전화 : <%=request.getAttribute("requestAttribute") %></li>
<li>메일 : <%=session.getAttribute("sessionAttribute") %></li>
<li>회사 :
 <%=application.getAttribute("applicationAttribute") %></li>
</ul>
</body>
</html>
