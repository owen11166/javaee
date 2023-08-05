<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<sql:setDataSource
    driver="com.mysql.cj.jdbc.Driver"
    url="jdbc:mysql://Localhost/iii"
    user="root"
    password="root" />
<sql:query var="rs" dataSource="${ds}">
    SELECT * FROM foods
</sql:query>

<c:set var="rpp" value="10" />

<%
    int currentPage = 1; // 預設為第一頁
    if (request.getParameter("page") != null) {
        currentPage = Integer.parseInt(request.getParameter("page"));
    }

    int totalRows = ((ResultSet) pageContext.getAttribute("rs")).last()?((ResultSet) pageContext.getAttribute("rs")).getRow() : 0;
 
    int totalPages = (int) Math.ceil((double) totalRows / Integer.parseInt((String) pageContext.getAttribute("rpp")));

    int startRow = (currentPage - 1) * Integer.parseInt((String) pageContext.getAttribute("rpp")) + 1;
    int endRow = currentPage * Integer.parseInt((String) pageContext.getAttribute("rpp"));
    String query = "SELECT * FROM (SELECT *, ROW_NUMBER() OVER () AS rn FROM foods) AS temp WHERE rn BETWEEN " + startRow + " AND " + endRow;
%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
    <a href="?page=<%= currentPage - 1 %>">上頁</a> | <a href="?page=<%= currentPage + 1 %>">下頁</a>
    <table border="1" width="100%">
        <tr>
            <th>#</th>
            <th>Name</th>
        </tr>
        <%-- 在這裡執行新的查詢，僅顯示該頁面的資料 --%>
        <sql:query var="pagedRs" dataSource="${ds}">
            <%= query %>
        </sql:query>
        <c:forEach items="${pagedRs.rows}" var="row">
            <tr>
                <td>${row.id}</td>
                <td>${row.name}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
