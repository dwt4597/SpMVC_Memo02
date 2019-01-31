<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta name="viewport" 
	content="width=device-width, initial-scale=1">
<meta charset="UTF-8">
<title>메모장</title>


<link rel="stylesheet" 
	href=<c:url value="/css/memo_main.css"/> >
	
<link rel="stylesheet" 
	href=<c:url value="/css/memo_input_style.css"/> >
	
</head>
<body>
<%@ include file="/WEB-INF/include/include-header.jspf" %>

	<nav>
		<a href="${pageContext.request.contextPath }/">Home</a>
		<a href=<c:url value="/memo_write"/>   >메모작성</a>
		<a href="#">로그인</a>
		<a href="#">회원가입</a>
		<a href="#">About</a>
		
		
	</nav>
	<section>
		<form action=<c:url value="/memo"/> method="POST">
			<fieldset>
			<legend>dd</legend>
			<label for="m_auth">작성자</label></br>
			<input type="text" id="m_auth" name="m_auth" placeholder="작성자 이름을 입력하세요"><br/>
			
			<label for="m_date">작성일자</label></br>
			<input type="date" id="m_date" name="m_date" placeholder="작성자 이름을 입력하세요"><br/>
			
			<label for="m_subject">제목</label></br>
			<input type="text" id="m_subject" name="m_subject" placeholder="제목을 입력하세요"><br/>
			
			<label for="m_text">메모</label></br>
			<input type="text" id="m_text" name="m_text" placeholder="메모 내용을 입력하세요"><br/>
			<hr/>
			<label></label>
			<button>메모저장</button>
				</fieldset>
			
		</form>
	</section>
	
	<footer>
	<address>CopyRight &copy; ijs9200@naver.com</address>
	</footer>
</body>
</html>