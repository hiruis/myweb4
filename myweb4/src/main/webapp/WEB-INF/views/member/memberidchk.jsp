<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	function gopage(value){
		if(value=='0'){
			opener.joinform.id.value='${memberDTO.id}';
			opener.joinform.name.focus(); 
			self.close();
		}else{
			self.close();
		}
	}
</script>
</head>
<body>
	<table>

		<c:choose>
			<c:when test="${result =='0'}">
			<tr>
				<th>
					${memberDTO.id}는 사용가능한 아이디입니다.
				</th>
			</tr>		
			<tr>
				<td>
					<input type="button" value="확인" onClick="gopage('0')">
				</td>
			</tr>
				
			</c:when>
			<c:otherwise>
			<tr>
				<th>
					${memberDTO.id}는 중복된 아이디가 있습니다.
				</th>
			</tr>		
			<tr>
				<td>
					<input type="button" value="확인" onClick="gopage('1')">
				</td>
			</tr>				
			</c:otherwise>
		</c:choose>
		</tr>

	</table>
</body>
</html>