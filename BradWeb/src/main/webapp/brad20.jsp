<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>	
	<body>
		hello world
		<hr/>
		<% 
			out.println("1");
		%>
		<hr/>
		<%
			int lottery=(int)(Math.random()*49+1);
			out.println(lottery);
		%>
		<hr/>
		<%
		out.println(lottery);
		%>
		<hr/>
		<%=lottery%>
	</body>
</html>