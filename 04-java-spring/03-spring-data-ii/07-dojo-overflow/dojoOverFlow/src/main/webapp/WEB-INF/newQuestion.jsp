<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Question</title>
<link rel= "stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<h1>What is your question?</h1>
<form:form method="POST" action="/addQuestion" modelAttribute="question">
<div class="form-group">
<label for="question">Question</label>
<input type="text" name="question">
</div>
<div class="form-group">
<label for="tag">Tag</label>
<input type="text" name="tag">
</div>
<button>Submit</button>
</form:form>
</body>
</html>