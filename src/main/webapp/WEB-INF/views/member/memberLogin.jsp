<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="loginfm" action="login.do" method="POST">
		<fieldset>
			<legend>로그인</legend>
			아이디: <input type="text" name="id" value="${cookie.idsave.value}"><br>
			비밀번호: <input type="password" name="pwd"><br>
			<input type="checkbox" id="idsave" name="idsave" value="on" ${ cookie.idsave.value==''?'':'checked'}><label for="idsave" >아이디 기억하기</label><br>
			<input type="submit" value="로그인">
		</fieldset>
	</form>
</body>
</html>