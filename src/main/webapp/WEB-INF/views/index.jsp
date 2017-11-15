<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function login() {
		window.open('login.do', 'login', 'width=400,height=400');
	}
</script>

</head>
<body>
<script>
	var filter = "win16|win32|win64|mac|macintel";
	if (navigator.platform) {
		if (filter.indexOf(navigator.platform.toLowerCase()) < 0) {
			alert('mobile 접속');
		} else {
			alert('pc 접속');
		}
	}
</script>
	<c:choose>
		<c:when test="${empty sessionScope.id}">
			<h3>
				<a href="javascript:login()">로그인</a>
			</h3>
		</c:when>
		<c:otherwise>
			<h3>${sessionScope.id}님
				접속중 || <a href="logout.do">로그아웃</a>
			</h3>
		</c:otherwise>
	</c:choose>

	<h1>index.jsp</h1>
	<ul>
		<li><a href="emp.do">마지막 사원관리 프로그램</a></li>
		<li><a href="downloadList.do">다운로드리스트</a></li>
		<li><a href="fileListForm.do">파일리스트</a></li>
		<li><a href="fileUploadForm.do">파일업로드</a></li>
		<li><a href="animeFindA.do">애니메이션 검색</a></li>
		<li><a href="hello.do">spring mvc</a></li>
		<li><a href="memoWrite.do">메모작성</a></li>
		<li><a href="memberJoin.do">회원가입</a></li>
		<li><a href="orderForm.do">편의점발주폼화면</a></li>
		<li><a href="paramTest.do?str=spring&idx=3">파라미터 테스트</a></li>
		<li><a href="cookieView.do">쿠키확인하기</a></li>
		<li><a href="cookieMake.do">쿠키저장하기</a></li>
		<li><a href="sessionView.do">세션확인하기</a></li>
		<li><a href="sessionMake.do">세션저장하기</a></li>
		<li><a href="viewTest1.do">명시적 뷰지정방법</a></li>
		<li><a href="viewTest2.do">명시적 뷰지정방법2</a></li>
		<li><a href="view/viewOk.do">묵시적 뷰 지정방법</a></li>
		<li><a href="viewTest4.do">또 다른 명령어 호출하기</a></li>
		<li><a href="modelTest1.do">모델테스트1(map)</a></li>
		<li><a href="modelTest2.do">모델테스트2(Model)</a></li>
		<li><a href="modelTest3.do">모델테스트3(ModelMap)</a></li>
		<li><a href="model/modelOk.do">모델테스트4(Map을 반환)</a></li>
		<li><a href="model/modelOk.do">모델테스트5(ModelMap)</a></li>
	</ul>
	<hr>
	<ul>
		<li><a href="email.do">발송</a></li>
		<li><a href="maps.do">지도</a></li>
		<li><a href="storeAddForm.do">매장등록</a></li>
	</ul>
</body>
</html>