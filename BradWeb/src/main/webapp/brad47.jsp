<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Properties"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:catch var="error">
<% 
	Class.forName("com.mysql.cj.jdbc.Driver");
	Properties prop=new Properties();
	prop.put("user","root");
	prop.put("password", "root");
	Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/iii", prop);


	String sql="INSERT INTO cust (cname,tel,birthday)"+"VALUES (?,?,?)";
	PreparedStatement pstmt=conn.prepareStatement(sql);
	
	pstmt.setString(1, "JSP");
	pstmt.setString(2, "333");
	pstmt.setString(3,"1999-10-01");
	int num=pstmt.executeUpdate();
	pageContext.setAttribute("num", num);
	
%>
</c:catch>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<c:if test="${!empty error}">Server Busy.${error}</c:if>
		<c:choose>
			<c:when test="${num>0}">ok</c:when>
			<c:otherwise>xx</c:otherwise>
		</c:choose>
	</body>
</html>