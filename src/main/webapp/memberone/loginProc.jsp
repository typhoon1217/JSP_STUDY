<%@ page contentType="text/html;charset=EUC-KR"%>
<jsp:useBean id="dao" class="memberone.StudentDAO" />
<%
String id = request.getParameter("id");
String pass = request.getParameter("pass");
int check = dao.loginCheck(id, pass);
%>
<%
if (check == 1) {//�α��� ����
	session.setAttribute("loginID", id);
	response.sendRedirect("login.jsp");
} else if (check == 0) {//���̵�� �ִµ� ��й�ȣ ����
%>
<script>
	alert("��й�ȣ�� Ʋ�Ƚ��ϴ�");
	history.go(-1);
</script>
<%
} else {//���̵� ��ü�� �������� �ʴ� ���
%>
<script>
	alert("���̵� �������� �ʽ��ϴ�");
	history.go(-1);
</script>
<%
}
%>