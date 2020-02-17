<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글보기</title>
</head>
<script type="text/javascript">
	function goInsert() {
		location.href = "./goinsert.do"
	}
</script>
<body>

	<table>
		<tr>
			<th>번호</th>
			<th>작성자</th>
			<th>제목</th>
			<th>작성일</th>
		</tr>
		<c:forEach var="dto" items="${lists}">
		
			<tr>
				<td>${dto.bnp}</td>
				<td>${dto.writer}</td>
				<td><a href="./selectOne.do?bnp=${dto.bnp}">${dto.title}</a></td>
				<td>${dto.regdate}</td>
			</tr>
		
		</c:forEach>
	</table>
	
	<input type="button" value="글작성" onclick="goInsert()">
</body>
</html>