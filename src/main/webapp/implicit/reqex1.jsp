<%@ page contentType = "text/html; charset=euc-kr" %>
<html>
<head><title>Ŭ���̾�Ʈ �� ���� ����</title></head>
<body>
Ŭ���̾�ƮIP = <%= request.getRemoteAddr() %> <br></br>
��û�������� = <%= request.getContentLength() %> <br></br>
��û���� ���ڵ� = <%= request.getCharacterEncoding() %> <br></br>
��û���� ����ƮŸ�� = <%= request.getContentType() %> <br></br>
��û���� �������� = <%= request.getProtocol() %> <br></br>
��û���� ���۹�� = <%= request.getMethod() %> <br></br>
��û URL = <%= request.getRequestURL().toString() %> <br></br>
��û URI = <%= request.getRequestURI() %> <br></br>
���ؽ�Ʈ ��� = <%= request.getContextPath() %> <br></br> <%--important --%>
�����̸� = <%= request.getServerName() %> <br></br>
������Ʈ = <%= request.getServerPort() %> <br></br>
</body>
</html>