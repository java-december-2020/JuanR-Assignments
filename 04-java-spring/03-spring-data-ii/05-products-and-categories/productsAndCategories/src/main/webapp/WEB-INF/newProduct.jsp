<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>New Product</h1>
<div class="container">
<form:form method="POST" action="/addProduct" modelAttribute="product">
<div class="form-group">
<form:label path="name">Name:
<form:errors path="name"/>
<form:input path="name"/></form:label>
</div>
<div class="form-group">
<form:label path="description">Description:
<form:errors path="description"/>
<form:input path="description"/></form:label>
</div>
<div class="form-group">
<form:label path="price">Price:
<form:errors path="price"/>
<form:input path="price"/></form:label>
</div>
<button>Create</button>


</form:form>
</div>
</body>
</html>