<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글작성</title>
</head>
<body>
	<form action="./insert.do" method="post">
		<table>
			<tr>
				<th>제목</th>
				<td><input type="text" id="title" name="title" required="required"></td> 
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" id="writer" name="writer" required="required"></td> 
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea rows="5" cols="10" id="content" name="content">${dto.content}</textarea></td> 
			</tr>
			<tr>
				<td><input type="submit" value="작성"></td>
				<td><input type="reset" value="다시작성"></td>
			</tr>
		</table>
	</form>
</body>
</html>