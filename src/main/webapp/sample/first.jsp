<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<section>
<c:set var="browser" value="내장객체 출력선언문 입니다."/>
<c:out value="${ browser1}"/><br>
<c:set var="browser2" value="선언문 출력선언문 입니다."/>
<c:out value="${ browser2}"/><br>
<c:set var="browser3" value="메소드 출력선언문 입니다."/>
<c:out value="${ browser3}"/><br>
<c:set var="browser4" value="스크립트릿 출력선언문 입니다."/>
<c:out value="${ browser4}"/><br>
</section>