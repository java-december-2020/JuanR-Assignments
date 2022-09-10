<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Course</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<form method="POST" action="/edit/${course.id}">
<h2>${course.name}</h2>
<h2>${course.instructor}</h2>
<h2>${course.capacity}</h2>
<form:form method="POST" action="/edit/${course.id}" modelAttribute="course">
<div class="form-group">
<form:label path="name">
<form:errors path="name"/>
<form:input path="name"/></form:label>
</div>
<button>Update</button>
</form:form>
</form>
</body>
</html>