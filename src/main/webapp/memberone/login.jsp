<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<title>Log in</title>
<link href="style.css" type="text/css" rel="stylesheet" />
</head>
<body>
	<form method="post" action="loginProc.jsp">
		<table width="300" border="1">
			<tr>
				<td colspan="2" align="center">회원 로그인</td>
			</tr>
			<tr>
				<td align="right" width="100">아이디 :</td>
				<td width="200">&nbsp;&nbsp; <input type="text" name="id"
					size="20" /></td>
			</tr>
			<tr>
				<td align="right" width="100">비밀번호 :</td>
				<td width="200">&nbsp;&nbsp; <input type="password" name="pass"
					size="20" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="로그인" />&nbsp;&nbsp;
					<input type="button" value="회원가입"
					onClick="javascript:window.location='regForm.jsp'" /></td>
			</tr>
		</table>
		
	</form>
</body>
</html>