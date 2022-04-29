<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="./css/menu.css" rel="stylesheet">
<style type="text/css">
	body{
		background-color: #c0c0c0;
	}
	table{
		width: 800px;
		height: 500px;
		border-collapse: collapse;
		text-align: center;
		margin: 0 auto;
	}
	td{
		border-bottom: 1px red solid;
	}
	.btitle{
		text-align: left;
	}
	tr:hover{
		background-color: #e0e0e0;
		font-weight: bolder;
	}
</style>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
		<table>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>조회수</th>
				<th>쓴 날짜</th>
			</tr>
			<c:forEach items="${board}" var="b">
			<tr>
				<td>${b.bno}</td>
				<td class="btitle"><a href="./detail?bno=${b.bno}">${b.btitle}</a></td>
				<td>${b.lname}</td>
				<td>${b.bcount}</td>
				<td>${b.bdate}</td>
			</tr>
			</c:forEach>
		</table>
		
		<c:choose>
			<c:when test="${sessionScope.lname ne null}">
			<button onclick="location.href='./write'">글쓰기</button>
			<button onclick="location.href='./logout'">로그아웃</button></c:when>
			<c:otherwise><button onclick="location.href='./login'">로그인</button></c:otherwise>
		</c:choose>
		

</body>
</html>