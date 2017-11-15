<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="empUpdate.do">
		<table>
			<tr>
				<th>사원번호</th>
				<td>${emplist.idx}</td>
			</tr>
			<tr>
				<th>사원이름</th>
				<td><input type="text" name="name" value="${emplist.idx}">
				</td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="text" name="email" value="${emplist.email}">
				</td>
			</tr>
			<tr>
				<th>부서명</th>
				<td><input type="text" name="dept" value="${emplist.email}">
				</td>
			</tr>
			<tr>
			<td colspan="2">
				<input tpye="submit" value="수정">
			</td>
			</tr>
		</table>
		
	</form>
</body>
</html>