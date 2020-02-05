<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세조회</title>
</head>
<body>
	<table>
		<tr>
			<th>번호</th>
			<td>${dto.board_seq}</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${dto.writer}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${dto.board_title}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea rows="10" cols="10">${dto.board_content}</textarea></td>
		</tr>
		<tr>
			<th>게시일</th>
			<td>${regdate}</td>
		</tr>
	</table>
</body>
</html>