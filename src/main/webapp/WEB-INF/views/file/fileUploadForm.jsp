<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>파일 업로드 테스트</h1>
	<h3>@RequestParam 사용</h3>
	<form name="formupload1" action="fileUpload1.do" method="Post"
		enctype="multipart/form-data">
		<fieldset>
			<legend>파일올리기1</legend>
			작성자:<input type="text" name="writer"><br> 파일:<input
				type="file" name="upload"><br> <input type="submit"
				value="전달">
		</fieldset>

	</form>
	<hr>
	<h3>MultipartHttpServletRequest 사용</h3>
	<form name="formupload2" action="fileUpload2.do" method="Post"
		enctype="multipart/form-data">
		<fieldset>
			<legend>파일올리기2</legend>
			작성자:<input type="text" name="writer"><br> 파일:<input
				type="file" name="upload"><br> <input type="submit"
				value="전달">
		</fieldset>

	</form>

	<hr>
	<h3>DTO 사용</h3>
	<form name="formupload3" action="fileUpload3.do" method="Post"
		enctype="multipart/form-data">
		<fieldset>
			<legend>파일올리기3</legend>
			작성자:<input type="text" name="writer"><br> 파일:<input
				type="file" name="upload"><br> <input type="submit"
				value="전달">
		</fieldset>

	</form>
	<hr>
	<h3>다중 업로드</h3>
	<form name="formupload4" action="fileUpload4.do" method="Post"
		enctype="multipart/form-data">
		<fieldset>
			<legend>파일올리기4</legend>
			작성자:<input type="text" name="writer"><br> 파일1:<input
				type="file" name="upload"><br> 파일2:<input type="file"
				name="upload"><br> 파일3:<input type="file" name="upload"><br>
			<input type="submit" value="전달">
		</fieldset>


	</form>
</body>
</html>