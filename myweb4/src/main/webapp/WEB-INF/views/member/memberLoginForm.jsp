<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>
	alert('${msg}');
	if(parseInt('${result}')>0){
		location.replace('login.do');
		
		alert('${msg}');
	}else{
		self.close();
	}
	
</script>