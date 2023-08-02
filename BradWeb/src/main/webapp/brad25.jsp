<%@page import="tw.brad.apis.Bike"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Bike bike=new Bike("brad");
request.setAttribute("bike", bike);
bike.upSpeed();

%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Brad Big Company</h1>
		<hr/>
		<hr/>
		<%@ include file="brad26.jsp"%>
		<hr/>
		<jsp:include page="brad27.jsp">
			<jsp:param value="100" name="x"/>
			<jsp:param value="33" name="y"/>
			
		</jsp:include>
	</body>
</html>