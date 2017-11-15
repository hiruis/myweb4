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
	<p>
	<h4>인기검색어</h4>
	<c:forEach var="key" items="${keyword}">
	${key}&nbsp;&nbsp;&nbsp;
	</c:forEach>
	</p>
	<form name="animeA" action="animeFindB.do">
		<select name="cate">
			<c:forEach var="ca" items="${cate}">
				<option value="${ca}">${ca}</option>
			</c:forEach>
		</select> <input type="text" name="title"> <input type="submit"
			value="검색">
	</form>
	<hr>
	<h1>animeFindA.jsp</h1>
</body>
</html>