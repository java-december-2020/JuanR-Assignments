<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
<h1>Welcome ${user.name}</h1>
<h3><a href="/logout">Logout</a></h3>
<hr>
<table class="table table-dark table-hover">
<thead>
<tr>
<th>Course</th>
<th>Instructor</th>
<th>Capacity</th>
<th>Action</th>
</tr>
</thead>

<tbody>
<c:forEach items="${allCourses}" var="course">
<tr>
<td><a href="/courses/${course.id}">${course.name}</a></td>
<td>${course.instructor}</td>
<td>${course.capacity}</td>
<td><a href="/add/${course.id}">Add</a></td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
<a href="/courses/new">Add a course</a>
</body>
</html>