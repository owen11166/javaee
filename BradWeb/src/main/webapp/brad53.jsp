<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
out.print((int)(Math.random()*(Integer.parseInt(request.getParameter("max")))+1));

%>