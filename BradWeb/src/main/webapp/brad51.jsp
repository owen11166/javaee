<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	Object obj=session.getAttribute("lottery");
	if(obj==null){
		response.sendRedirect("brad50.jsp");	
		//
	}else{
	int lottery=(Integer)session.getAttribute("lottery");   
	pageContext.setAttribute("lottery", lottery);
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	I am Brad51
	<hr />
	${lottery}
	<hr/>
	<a href="logout.jsp">logout</a>
</body>
</html>