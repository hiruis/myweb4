<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function login(){
		window.open('login.do','login','width=400,height=400');
	}
</script>
</head>
<body>
<h3><a href="javascript:login()">로그인</a></h3>
<h1>index.jsp</h1>
<ul>
	<li><a href="hello.do">spring mvc</a></li>
	<li><a href="memoWrite.do">메모작성</a></li>
	<li><a href="email.do">발송</a></li>
	<li><a href="memberJoin.do">회원가입</a></li>
</ul>
</body>
</html>