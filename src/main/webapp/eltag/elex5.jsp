<%@ page contentType="text/html;charset=euc-kr"%>
<%
request.setCharacterEncoding("euc-kr");
%>
<HTML>
<HEAD>
<TITLE>ǥ������� ��뿹��</TITLE>
</HEAD>
<BODY>
	<H3>�Ķ���Ͱ� ó��</H3>
	<br></br>
	<FORM action="elex5.jsp" method="post">
		�̸� : <input type="text" name="name" value="${param['name']}">
		<input type="submit" value="Ȯ��">
	</FORM>
	<P>�̸���: ${param.name} �Դϴ�.</P>
</BODY>
</HTML>