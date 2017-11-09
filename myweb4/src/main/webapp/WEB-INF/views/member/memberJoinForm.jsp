<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function idchk(obj){
		window.open('memberIdchk.do','id','width=400,height=500');
	}
</script>
</head>
<body>
<h2>회원가입</h2>
<form name="joinform" action="memberJoin.do" method="POST">
<table>
	<tr>
		<th>아이디</th>
		<td><input type="text" name="id" readonly="readonly"><input type="button" value="중복검사" onClick="idchk(this.form)"></td>
	</tr>
	<tr>
		<th>성명</th>
		<td><input type="text" name="name"></td>
	</tr>
	<tr>
		<th>비밀번호</th>
		<td><input type="text" name="pwd"></td>
	</tr>
	<tr>
		<th>주소</th>
		<td><input type="text" name="addr"></td>
	</tr>
	<tr>
		<th>전화번호</th>
		<td><input type="text" name="tel"></td>
	</tr>
	<tr>
		<th colspan="2">
			<input type="submit" value="회원가입">
			<input type="reset" value="다시작성">
		</th>	
	</tr>	
</table>
</form>
</body>
</html>