<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<sql:setDataSource
    driver="com.mysql.cj.jdbc.Driver"
    url="jdbc:mysql://localhost/iii"
    user="root"
    password="root"
/>

<sql:query var="totalRows" sql="SELECT COUNT(*) AS count FROM foods" />

<c:set var="rpp" value="10" /> <!-- Rows Per Page -->

<c:set var="currentPage" value="${empty param.page ? 1 : param.page}" />
<c:set var="totalPages" value="${(totalRows.rows[0].count + rpp - 1) / rpp}" />

<sql:query var="pagedRs" sql="SELECT * FROM foods LIMIT ${rpp} OFFSET ${(currentPage - 1) * rpp}" />

<c:if test="${currentPage > 1}">
    <c:set var="prevPage" value="${currentPage - 1}" />
</c:if>

<c:set var="nextPage" value="${currentPage + 1}" />
<c:if test="${currentPage >= totalPages}">
    <c:set var="nextPage" value="${null}" />
</c:if>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>
<c:if test="${currentPage > 1}">
    <a href="?page=${prevPage}">上頁</a> |
</c:if>
<c:if test="${not empty nextPage}">
    <a href="?page=${nextPage}">下頁</a>
</c:if>
<hr />
<table border="1" width="100%">
    <tr>
        <th>#</th>
        <th>Name</th>
    </tr>
    <c:forEach items="${pagedRs.rows}" var="row">
        <tr>
            <td>${row.id}</td>
            <td>${row.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
