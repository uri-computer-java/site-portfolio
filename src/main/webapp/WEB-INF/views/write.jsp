<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="./css/menu.css" rel="stylesheet">
<title>입력창</title>
<!-- include libraries(jQuery, bootstrap) -->

<link href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<!-- include summernote css/js -->
<link href="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote.min.js"></script>

<style type="text/css">
#writeform{
	margin: 0 auto;
	height: 700px;
	width: 800px;
	background-color: gray;
	padding: 10px;
}
#writeform input{
	height: 30px;
	width: 100%;
	margin-bottom: 10px;
}

#writeform textarea{
	height: 600px;
	width: 100%;
}

</style>
</head>
<body>
<jsp:include page="menu.jsp"></jsp:include>
<h1>글쓰기</h1>
<div id="writeform">
	<form action="./write" method="post">
		<input type="text" name="title">
		<textarea id="summernote" name="content"></textarea>
		<button type="submit">글쓰기</button>
	</form>
</div>

<script type="text/javascript">
$(document).ready(function() {
	$('#summernote').summernote({
		height: 500,
		lang:'ko-KR'
	});
});
</script>
</body>
</html>