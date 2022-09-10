<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Funniest Jokes on the Internet</title>
</head>
<body>
<h3>Joke results</h3>
<p>Name: <c:out value="${name }"/></p>
<p>Joke: <c:out value="${joke }"/></p>

</body>
</html>