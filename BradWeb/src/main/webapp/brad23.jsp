<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
	String x=request.getParameter("x");
 	String y=request.getParameter("y");
 	String z=request.getParameter("op");
 	String r="";
 	
 	try{
 		int intx=Integer.parseInt(x);
 		int inty=Integer.parseInt(y);
 		switch(z){
 		case "1" :r+=(intx+inty);break;
 		case "2" :r+=(intx-inty);break;
 		case "3" :r+=(intx*inty);break;
 		case "4" :r+=(intx/inty)+"......"+(intx % inty);break;
 		}
 	}catch(Exception e){
 		x=y=z="";
 	} 	
%>   
   
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="brad23.jsp">
			<input name="x" value="<%=x%>"/>
			<select name=op>
				<option value="1"<%=z.equals("1")?"selected":""%>>+</option>
				<option value="2"<%=z.equals("2")?"selected":""%>>-</option>
				<option value="3"<%=z.equals("3")?"selected":""%> >*</option>
				<option value="4"<%=z.equals("4")?"selected":""%>>/</option>
			</select>
			<input name="y" value="<%=y %>"/>
			<input type="submit" value="="/>
			<span><%=r %></span>		
		</form>
	</body>
</html>