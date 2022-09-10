<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Boot day 1</title>
<link rel="stylesheet" href="stylesheet">
</head>
<body>
<h1>The joke site</h1>
<form method="POST" action="/addjoke">
<p>Name: <input type="text" name=name></p>
<p>Joke: <input type="text" name=joke></p>
<button>Add joke!</button>
</form>
</body>
</html>