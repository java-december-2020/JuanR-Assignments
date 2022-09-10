<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign In</title>
</head>
<body>
<div class="container">
<h2>Register</h2>
<form:form method="POST" action="/register" modelAttribute="user">
	<div class="form-group">
	<form:label path="name">Name</form:label>
	<form:errors path="name"/>
	<form:input class="form-control" path="name"/>
	</div>
	<div class="form-group">
	<form:label path="email">Email</form:label>
	<form:errors path="email"/>
	<form:input class="form-control" path="email"/>
	</div>
	<div class="form-group">
	<form:label path="password">Password</form:label>
	<form:errors path="password"/>
	<form:input class="form-control" type="password" path="password"/>
	</div>
	<div class="form-group">
	<form:label path="confirmPassword">Confirm Password</form:label>
	<form:errors path="confirmPassword"/>
	<form:input class="form-control" type="password" path="confirmPassword"/>
	<button>Register</button>
	</div>
</form:form>

<h2>Log In</h2>
<form method="POST" action="/login">
<div class="form-group">
<label>Email</label>
<input class="form-control" type="email" name="logEmail">
</div>
<div class="form-group">
<label>Password</label>
<input class="form-control" type="password" name="logPassword">
<button>Log In</button>
</div>
</form>
</div>
</body>
</html>