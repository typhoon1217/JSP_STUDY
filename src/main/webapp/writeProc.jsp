<%@page import="boardone.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="boardone.BoardDAO"%>
<%@ page import="java.sql.Timestamp"%>
<% request.setCharacterEncoding("urf-8"); %>
<jsp:useBean id="article" scope="page" class="boardone.BoardVO">
	<jsp:setProperty name="article" property="*" />
</jsp:useBean>

<%
	article.setRegdate(new Timestamp(System.currentTimeMillis()));
	article.setIp(request.getRemoteAddr());
	//싱글톤 방식 객체관리
	BoardDAO dpPro = BoardDAO.getInstance();
	boolean flag = dpPro.insertArticle(article);
	if(flag == true){
		response.sendRedirect("list.jsp");
	}else{
		String message = "입력이 성공하지 못했습니다.";
%>
<script>
	alret("<%=message%>");
	history.go(-1);
</script>
<%
}
%>