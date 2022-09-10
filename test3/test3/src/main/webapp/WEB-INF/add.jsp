<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add New Course</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
<form:form action="/courses/new" method="POST" modelAttribute="course">
<form:input type="hidden" value="${user_id}" path="creator"/>
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
<button>Create</button>
</form:form>
</div>
</body>
</html>