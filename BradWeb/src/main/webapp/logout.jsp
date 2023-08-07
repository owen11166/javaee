<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	//session.setAttribute("lottery", null);
	session.invalidate();
	response.sendRedirect("brad50.jsp");
%>