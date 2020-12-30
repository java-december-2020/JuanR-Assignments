<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class="container">
<h1>Welcome</h1>
<table class="table table-dark">
<thead>
<tr>
<th>Name</th>
<th>Creator</th>
<th>Version</th>
</tr>
</thead>
<tbody>
<tr>
<c:forEach items="${allLanguages }" var="language">
<td>${language.name }</td>
<td>${language.creator }</td>
<td>${language.version }</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>

<body>
<div class="container">
<form action="/addLanguage" method="POST">

<div class="form-grpup">
<label for="name">Name</label>
<input type="text" name="name">

<div class="form-grpup">
<label for="name">Creator</label>
<input type="text" name="creator">

<div class="form-grpup">
<label for="name">Version</label>
<input type="text" name="version">
</div>
<button>Add Language</button>

</form>



</div>
</body>
</html>