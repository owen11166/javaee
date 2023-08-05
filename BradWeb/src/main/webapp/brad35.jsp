<%@page import="tw.brad.apis.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String account = request.getParameter("account");
	String realName = request.getParameter("realName");
	String birthday = request.getParameter("birthday");


	Member member1 = new Member(4,"tony","Tony","1999-08-09");
	request.setAttribute("member1", member1);
	/*
在 JSP 中，param 是一個隱含物件（implicit object），用於獲取 HTTP 請求中的參數值。當使用者從前端頁面提交表單或發送 HTTP GET 或 POST 請求時，可以使用 param 隱含物件來獲取這些請求中包含的參數。
param 隱含物件的使用方法是 ${param.xxx}，其中 xxx 是 HTTP 請求中的參數名。例如，如果表單中有一個名為 username 的輸入欄位，那麼在接收該表單的 JSP 頁面中，可以使用 ${param.username} 來獲取使用者輸入的值。
*/
%>    
<jsp:useBean id="member" class="tw.brad.apis.Member"></jsp:useBean>    
<jsp:setProperty property="id" name="member" value="3" />
<jsp:setProperty property="account" name="member" value="<%= account %>" />
<jsp:setProperty property="realName" name="member" value="${param.realName }" />
<jsp:setProperty property="birthday" name="member" value="${param.birthday }" />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		Member:
		<jsp:getProperty property="id" name="member"/> :
		<jsp:getProperty property="account" name="member"/>
		<jsp:getProperty property="realName" name="member"/>
		<jsp:getProperty property="birthday" name="member"/>
		<hr />
		Member: ${member.id } : ${member.account }
		<hr />
		Member1: ${member1.id } : ${member1.account }
		<hr />
		${haha }
		<hr />
	</body>
</html>