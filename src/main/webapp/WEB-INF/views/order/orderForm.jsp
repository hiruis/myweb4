<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>편의점 발주 시스템</h2>
<form name="order" action="order.do">
	상품1:상품번호-<input type="text" name="itemdto[0].idx"><br>
		 상품명-<input type="text" name="itemdto[0].name"><br>
		 개수-<input type="text" name="itemdto[0].num"><br>
		 비고-<input type="text" name="itemdto[0].bigo"><br>
	상품2:상품번호-<input type="text" name="itemdto[1].idx"><br>
		 상품명-<input type="text" name="itemdto[1].name"><br>
		 개수-<input type="text" name="itemdto[1].num"><br>
		 비고-<input type="text" name="itemdto[1].bigo"><br>
	상품3:상품번호-<input type="text" name="itemdto[2].idx"><br>
		 상품명-<input type="text" name="itemdto[2].name"><br>
		 개수-<input type="text" name="itemdto[2].num"><br>
		 비고-<input type="text" name="itemdto[2].bigo"><br>		 	
		 <hr>
<fieldset>
	<legend>매장정보</legend>
	매장명:<input type="text" name="marketdto.marketname" value="매장이름이 매장"><br>
	매장주소:<input type="text" name="marketdto.marketaddr" value="매장주소가 주소"><br>
	매장전화번호:<input type="text" name="marketdto.markettel" value="111-1111-1111"><br>
	
</fieldset>
<input type="submit" value="발주"	>	 	 
</form>
</body>
</html>