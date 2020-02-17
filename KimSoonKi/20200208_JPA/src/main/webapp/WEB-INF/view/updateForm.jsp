<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 수정</title>
</head>
<body>
	<form action="./update.do" method="post">
		<input type="hidden" id="bnp" name="bnp" value="${dto.bnp}">
		<table>
			<tr>
				<th>제목</th>
				<td><input type="text" id="title" name="title" value="${dto.title}"></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="hidden" id="writer" name="writer" value="${dto.writer}">${dto.writer}</td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="5" cols="10" id="content" name="content">${dto.content}</textarea></td>
			</tr>
		</table>
		<input type="submit" value="글 수정">
	</form>
</body>
</html>