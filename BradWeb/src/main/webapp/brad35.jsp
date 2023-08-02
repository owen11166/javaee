<%@page import="tw.brad.apis.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//el可放點 page request session application
	Member member1=new Member(4,"tony","Tony","1999-10-01");
	request.setAttribute("member1", member1);
%>
<jsp:useBean id="member2" class="tw.brad.apis.Member"></jsp:useBean>
<jsp:setProperty property="id" name="member" value="2"/>
<jsp:setProperty property="account" name="member2" value="${param.account}"/>
<jsp:setProperty property="realname" name="member2" value="${param.realname}"/>
<jsp:setProperty property="birthday" name="member2" value="${param.birthday}"/>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		Member2:
		<jsp:getProperty property="id" name="member"/>
		<jsp:getProperty property="account" name="member"/>
		<jsp:getProperty property="realname" name="member"/>
		<jsp:getProperty property="birthday" name="member"/>
		<hr/>
		Member:${member.id}:${member.account}
		<hr/>
		Member1: ${member1.id}: ${member1.account};
	</body>
</html>