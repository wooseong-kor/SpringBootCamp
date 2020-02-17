<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 상세보기</title>
</head>
<script type="text/javascript">	
	function deleteOne() {
		var ftag = document.getElementById("form");
		ftag.action = "./delete.do";
		ftag.submit();
	}
	
	function goUpdate() {
		var ftag = document.getElementById("form");
		ftag.action = "./updateform.do";
		ftag.submit();
	}
</script>
<body>
	<form action="#" method="post" id="form">
	<input type="hidden" id="bnp" name="bnp" value="${dto.bnp}">
	<table>
		<tr>
			<th>제목</th>
			<td><input type="text" id="title" name="title" readonly="readonly" value="${dto.title}"></td>
		</tr>
		<tr>
			<th>작성자</th>
			<td><input type="text" id="writer" name="writer" readonly="readonly" value="${dto.writer}"></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><textarea rows="5" cols="10" id="content" name="content" readonly="readonly">${dto.content}</textarea></td>
		</tr>
		<tr>
			<td><input type="button" value="삭제" onclick="deleteOne()"></td>
			<td><input type="button" value="수정" onclick="goUpdate()"></td>
		</tr>
	</table>
	</form>
</body>
</html>