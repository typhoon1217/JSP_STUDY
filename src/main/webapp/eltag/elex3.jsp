<%@ page contentType="text/html;charset=euc-kr"%>
<%@ page import="actiontag.Customer, java.util.ArrayList"%>
<%
ArrayList<String> singer = new ArrayList<String>();
singer.add("�ҳ�ô�");
singer.add("�����ɽ�");
request.setAttribute("singer", singer);
Customer[] customer = new Customer[2];
customer[0] = new Customer();
customer[0].setName("�տ���");
customer[0].setEmail("son@hamail.net");
customer[0].setPhone("010-1234-5678");
customer[1] = new Customer();
customer[1].setName("ȫ�浿");
customer[1].setEmail("hong@hamail.net");
customer[1].setPhone("010-9876-5432");
request.setAttribute("customer", customer);
%>
<html>
<head>
<title>EL Example</title>
</head>
<body>
	<ul>
		<li>${singer[0]},${singer[1]}</li>
	</ul>
	<ul>
		<li>�̸� : ${customer[0].name}</li>
		<li>���� : ${customer[0].email}</li>
		<li>��ȭ : ${customer[0].phone}</li>
	</ul>
	<ul>
		<li>�̸� : ${customer[1].name}</li>
		<li>���� : ${customer[1].email}</li>
		<li>��ȭ : ${customer[1].phone}</li>
	</ul>
</body>
</html>