<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="menu">
	<div id="navi">
		<ul>
			<li>
				<a a href="./">
					<img alt="apple" src="./img/apple.png" height="20px">
				</a>
			</li>
			<li><a href="./freeboard">자유</a></li>
			<li><a href="./anonboard">익명</a></li>
			<li><a href="./photoboard">찰칵</a></li>
			<c:choose>
				<c:when test="${sessionScope.lname eq null}">
					<li><a href="./login">로그인</a></li>
					<li><a href="./signin">회원가입</a></li>
				</c:when>
				<c:otherwise>
					<li><b>${sessionScope.lname }</b>님 반갑습니다.</li>
					<li><a href="./logout">로그아웃</a></li>
				</c:otherwise>
			</c:choose>
		</ul>
	</div>
</div>