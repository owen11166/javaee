<%@page import="tw.brad.apis.Bike"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Bike bike=new Bike("brad");
request.setAttribute("bike", bike);
bike.upSpeed();
/*
include file="brad26.jsp"
是一個指令，它在編譯時期（也就是JSP轉換成Servlet的階段）將另一個JSP頁面的內容直接包含進來，就好像兩個頁面被合併為一個。
編譯器會將兩個JSP頁面合併，可能會導致較大的頁面，但性能較佳，適合用於包含公共的樣式、函式庫等。
jsp:include page="brad27.jsp"
是一個標籤，它在運行時期（在JSP頁面被載入到瀏覽器時）動態載入另一個JSP頁面，然後將其內容插入到當前頁面。
會在每次頁面被載入時動態載入新的JSP頁面，可能會產生較多的HTTP請求，但更適合用於動態地根據不同情況包含不同的內容。
*/
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

