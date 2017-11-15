<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>사원관리프로그램</h2>
	<form name="empAdd" action="empAdd.do" method="post">
		<fieldset>
			<legend>사원등록</legend>
			<table>
				<tr>
					<th>사원이름</th>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<th>E-mail</th>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<th>부서명</th>
					<td><input type="text" name="dept"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="사원등록"> <input
						type="reset" value="다시작성"></td>
				</tr>
			</table>
		</fieldset>
	</form>
	<form action="empDel.do">
		<fieldset>
			<legend>사원삭제</legend>
			사원번호 : <input type="text" name="idx"><input type="submit"
				value="삭제">

		</fieldset>
	</form>
	<fieldset>
		<legend>사원목록</legend>
		<table border="1">
			<tr>
				<th>사원번호</th>
				<th>사원이름</th>
				<th>이메일</th>
				<th>부서명</th>
			</tr>
			<c:forEach var="list" items="${emplist}">
				<tr>
					<td>${list.idx}</td>
					<td>${list.name}</td>
					<td>${list.email}</td>
					<td>${list.dept}</td>
				</tr>
			</c:forEach>
		</table>
	</fieldset>
	<form action="empSearch.do">
		<fieldset>
			<legend>사원검색</legend>
			사원이름 : <input type="text" name="name"><input type="submit"
				value="검색">

		</fieldset>
	</form>
	<form action="empUpdateList.do">
		<fieldset>
			<legend>사원수정</legend>
			사원번호 : <input type="text" name="idx"><input type="submit"
				value="수정">

		</fieldset>
	</form>
</body>
</html>