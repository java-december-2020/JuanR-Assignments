<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
<div>
	<h3>Submitted Info</h3>
	<p><span>Name: </span><c:out value="${name}"/></p>
	<p><span>Dojo Location: </span><c:out value="${location}"/></p>
	<p><span>Favorite Language: </span><c:out value="${language}"/></p>
	<p><span>Comment: </span><c:out value="${comment}"/></p>
	
	<form method="POST" action="/redirect">
		<button>Go Back</button>
	</form>
</div>
</body>
</html>