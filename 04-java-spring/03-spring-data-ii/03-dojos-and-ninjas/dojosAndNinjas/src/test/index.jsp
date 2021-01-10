<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>New Dojo</h1>

<div class="conatiner">
	<form action="/newNinja" method="post">
	<label for="name">Name</label>
	<input type="text" name="name">
	<button>Create</button>
	
	</form>
	
</div>
</body>
</html>