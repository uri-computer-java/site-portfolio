<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메뉴만들기</title>
<script type="text/javascript">
function dele(num) {
	//alert(num "번 + del을 눌렀습니다");
	if(confirm ("글을 삭제하시겠습니까?")){
		alert("글을 삭제합니다");
		location.href="./del?bno="+num;
	}else{
		return false;
	}

}
</script>
<style type="text/css">
table {
	width: 100%;
	min-height: 300px;
	height: auto;
	border-collapse: collapse;
}

th {
	whdth: 100px;
	height: 25px;
	background-color: gray;
}

th, td {
	border-bottom: 1px red solid;
}

#content {
	min-height: 200px;
}
</style>
<link href="./css/menu.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<h1>상세보기</h1>
	<table>
		<tr>
			<th>번호</th>
			<td>${detail.bno }</td>
		</tr>
		<tr>
			<th>작성자</th>
			<td>${detail.lname }(${detail.lid })
			<c:if test="${detail.lid  eq sessionScope.lid}">
			<img alt="del" src="./img/delete.png" height="20px" onclick="dele(${detail.bno })">
			<img alt="edit" src="./img/edit.png" height="20px">
			</c:if>
			</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${detail.btitle }</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${detail.bcontent }</td>
		</tr>
		<tr>
			<th>날짜</th>
			<td>${detail.bdate }</td>
		</tr>
	</table>
	<button onclick="location.href='./board'">게시판으로 돌아가기</button>

</body>
</html>