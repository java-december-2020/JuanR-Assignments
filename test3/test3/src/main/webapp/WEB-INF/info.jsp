<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Courses</title>
</head>
<body>
<form method="POST" action="/courses/edit/${course.id}">
<hr>
<c:if test="${course.creator.id == user.id }">
<h3>Edit</h3>
<form:form action="/courses/edit/${course.id }" method="POST" modelAttribute="course">
<div class="form-group">
<form:label path="name">Course</form:label>
<form:errors path="name"/>
<form:input class="form-control" path="name"/>
</div>
<div class="form-group">
<form:label path="instructor">Instructor</form:label>
<form:errors path="instructor"/>
<form:input class="form-control" path="instructor"/>
</div>
<div class="form-group">
<form:label path="capacity">Capacity</form:label>
<form:errors path="capacity"/>
<form:input class="form-control" path="capacity"/>
</div>
<button>Update</button>
</form:form>
</c:if>
</form>
<div class="container">
<h2>Instructor: ${course.instructor}</h2>
<h2>Sign Ups: ${course.capacity} </h2>
<h1>${course.name}</h1>
<hr>
<table class="table table-dark table-hover">
<thead>
<tr>
<th>Name</th>
<th>Sign Up Date</th>
<th>Action</th>
</tr>
</thead>

<tbody>
<tr>
<td>${course.instructor}</td>
<td>${date}</td>
<td>Remove</td>
</tr>
</tbody>
</table>
</div>
</body>
</html>