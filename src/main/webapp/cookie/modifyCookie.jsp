<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import = "java.net.URLEncoder" %>
<%
 Cookie[] cookies = request.getCookies();
 if (cookies != null && cookies.length > 0) {
 for (int i = 0 ; i < cookies.length ; i++) {
 if (cookies[i].getName().equals("name")) {
 cookies[i].setValue(URLEncoder.encode("�ڹٿ� JSP",
 "UTF-8"));
 response.addCookie(cookies[i]);
 }
 }
 }
%>
<html>
<head><title>�� ����</title></head>
<body>
name ��Ű�� ���� �����մϴ�. </body>
</html>