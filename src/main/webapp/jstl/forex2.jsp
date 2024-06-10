<%@ page contentType="text/html;charset=euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.ArrayList, jstl.MemberVO"%>
<%
MemberVO vo1 = new MemberVO("�տ���", "son@hanmail.net", 500);
MemberVO vo2 = new MemberVO("�����", "sao@hanmail.net", 50);
MemberVO vo3 = new MemberVO("���Ȱ�", "pal@hanmail.net", 100);
ArrayList<MemberVO> memberList = new ArrayList<MemberVO>();
memberList.add(vo1);
memberList.add(vo2);
memberList.add(vo3);
request.setAttribute("memberList", memberList);
%>
<html>
<head>
<title>JSTL Example</title>
</head>
<body>
	<h3>ȸ�� ����</h3>
	<table border="1" width="450">
		<tr>
			<th width="50">��ȣ</th>
			<th width="100">�̸�</th>
			<th width="200">����</th>
			<th width="100">����</th>
		</tr>
		<c:forEach var="member" items="${memberList}" varStatus="num">
			<tr>
				<td align="center">${num.count}</td>
				<td align="center">${member.name}</td>
				<td align="center">${member.email}</td>
				<td align="center">${member.age}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>