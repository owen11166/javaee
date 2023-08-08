<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<tags:test1></tags:test1>
	<hr />
	<tags:test2></tags:test2>
	<hr />
	<tags:test3></tags:test3>
	<hr />
	<table border="1" width=100%>
		<tr>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<tags:test5 name="Item1" price="100"></tags:test5>
		<tags:test5 name="Item2" price="1000"></tags:test5>
		<tags:test5 name="Item3" price="10000"></tags:test5>
		<tags:test5 name="Item4" price="100000"></tags:test5>
	</table>
</body>
</html>