<%@ page contentType = "text/html; charset=euc-kr" %>
<%
 Cookie cookie = new Cookie("hour", "1time");
 cookie.setMaxAge(60); // 60��(1��)
 response.addCookie(cookie);
%>
<html>
<head><title>��Ű��ȿ�ð�����</title></head>
<body>
��ȿ�ð��� 1�ð��� hour ��Ű ����. </body>
</html>ml>