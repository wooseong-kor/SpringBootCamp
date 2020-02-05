<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체조회</title>
</head>
<body>
	<table>
		<tr>
			<th>번   호</th>
			<th>작성자</th>
			<th>제   목</th>
			<th>조회수</th>
			<th>게시일</th>
		</tr>
		<c:forEach var="L" items="${lists}">
		<tr>
			<td>${L.board_seq}</td>
			<td>${L.writer}</td>
			<td><a href="./selectOne.do?board_seq=${L.board_seq}">${L.board_title}</a></td>
			<td>${L.readcount}</td>
			<td>${L.regdate}</td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>