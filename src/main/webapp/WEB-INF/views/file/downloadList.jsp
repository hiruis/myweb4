<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>다운로드 목록</h2>
<c:if test="${empty fileList}">
<h4>등록된 파일이 없습니다.</h4>
</c:if>
<ul>
<c:forEach var="f" items="${fileList}">
	<c:url var="downUrl" value="down.do">
		<c:param name="filename">${f.name}</c:param>
	</c:url>
	<li><a href="${downUrl}">${f.name}</a></li>
</c:forEach>
</ul>
</body>
</html>