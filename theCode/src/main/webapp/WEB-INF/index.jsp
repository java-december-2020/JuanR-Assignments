<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<div>
	<p><c:out value="${incorrect}" default="" />	</p>
	<h3>What is this code?</h3>
	<form method="POST" action="/success">
	<p><input type="text" name=code></p>
	<button>Try Code!</button>
	</form>
</div>
</body>
</html>