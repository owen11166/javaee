<%@page import="java.util.LinkedList"%>
<%@page import="java.util.concurrent.LinkedBlockingDeque"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String[] var1={"Brad","OK","III"};
	pageContext.setAttribute("var1",var1);
	String[] var2={"Brad2","ok2","iii2"};
	request.setAttribute("var1", var2);
	String[] var3={"Brad3","ok3","iii3"};
	session.setAttribute("var1", var3);
	String[] var4={"Brad4","ok4","iii4"};
	session.setAttribute("var1", var4);
	LinkedList<String> list=new LinkedList<>();
	list.add("brad5");list.add("ok5");list.add("III5");
	pageContext.setAttribute("list", list);
	

%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		var1[0]:${var1[0]}<br/>
		var1[0]:${pageScope.var1[0]}<br/>
		var1[0]:${requestScope.var1[0]}<br/>
		var1[0]:$(sessionScope.var1[0])<br/>
		var1[0]:$(applicationScope.var1[0])<br/>
		list.get(0): ${list[0]}<br/>	
	</body>
</html>