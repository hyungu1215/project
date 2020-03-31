<%@page import="service.MemberService"%>
<%@page import="domain.Member"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	request.setCharacterEncoding("UTF-8");
	MemberService memberService = new MemberService();
	ArrayList<Member> memberList = memberService.selectAll();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		for (Member member : memberList) {
	%>
	<div align="center">
		<ol>
			<li><%=member.getmNo()%></li>
			<li><%=member.getmId()%></li>
			<li><%=member.getmName()%></li>
			<hr>
		</ol>
	</div>
	<%
		}
	%>
</body>
</html>