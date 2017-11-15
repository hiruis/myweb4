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
<h2>검색 결과</h2>
	<table border="1">
		<tr>
			<th>사원번호</th>
			<th>사원이름</th>
			<th>이메일</th>
			<th>부서명</th>
		</tr>
		<c:forEach var="list" items="${empsearchlist}">
			<tr>
				<td>${list.idx}</td>
				<td>${list.name}</td>
				<td>${list.email}</td>
				<td>${list.dept}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>