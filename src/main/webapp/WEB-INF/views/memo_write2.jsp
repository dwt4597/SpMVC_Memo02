<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scal=1">

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
	<a href="${pageContext.request.contextPath }/">home</a>
	<a href=<c:url value-"/memo_write"/> >  메모작성</a>

</nav>
</body>
</html>