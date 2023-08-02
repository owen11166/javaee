 <%@page import="tw.brad.apis.Bike"%>
<%
 	String x=request.getParameter("x");
 	Bike bike1=(Bike)request.getAttribute("bike");
 	
 %>
 I am brad 26<br/>
 <%=x %>
 <%=bike1 %>