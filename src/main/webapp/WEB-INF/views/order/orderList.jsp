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
<h2>발주내역서</h2>
<ul>
	<c:forEach var="idto" items="${orderDTO.itemdto}">
	<li>상품번호:${idto.idx}/상품명:${idto.name}/개수:${idto.num}/비고:${idto.bigo}</li>
	</c:forEach>
</ul>
<hr>
<h4>매장정보</h4>
<h5>매장명:${orderDTO.marketdto.marketname}</h5>
<h5>매장주소:${orderDTO.marketdto.marketaddr}</h5>
<h5>매장전화번호:${orderDTO.marketdto.markettel}</h5>
</body>
</html>