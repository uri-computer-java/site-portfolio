<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
<style>
	#loginform{
		margin: 0 auto;
		width: 300px;
		height: 150px;
		background-color: gray;
		padding: 30px;
		box-sizing: boder-box;
		border-radius: 15px;
	}
	#loginform input{
		width: 100%;
		height: 30px;
		margin-bottom: 10px;
	}
	#loginform button{
		width: 48%;
		height: 30px;
	}
</style>
</head>
<link href="./css/menu.css" rel="stylesheet">
<body>
<jsp:include page="menu.jsp"></jsp:include>
	<h1>로그인 화면</h1>
	<div id="loginform">
		<form action="./login" method="post">
		<input type="text" name="id" placeholder="아이디를 입력해주세요">
		<br>
		<input type="password" name="passwd" placeholder="암호를 입력해주세요">
		<br>
		<button type="submit"> L O G I N </button>
		<button type="reset"> R E S E T </button>
		</form>
	</div>
	
	
	<c:if test="${param.error ne null}">
		<script type="text/javascript">
			alert("아이디 혹은 비밀번호가 잘못되었습니다. 다시 시도하세요.");
		</script>
	</c:if>
</body>
</html>