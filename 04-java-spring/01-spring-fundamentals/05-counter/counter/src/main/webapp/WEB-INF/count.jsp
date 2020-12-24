<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>You have visited <c:out value="${ count }"/> Times</h1>
	<a href="/">Test another visit?</a>
	<a href="/reset"><button>Reset Session</button></a>
</body>
</html>