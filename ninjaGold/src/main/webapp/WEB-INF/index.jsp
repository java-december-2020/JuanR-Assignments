<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ninja Gold</title>
<link rel="stylesheet" href="css/style/css">
</head>
<body>
<div id="wrapper">
<p>Your gold: <c:out value="${totalGold}"/></p>

<div class= "box">
<form method="POST" action="/addGold">
<h3>Farm</h3>
<p>Finds 10-20 Gold</p>
<input type="hidden" name="building" value="farm">
<button>Find Gold</button>
</form>
</div>

<div class= "box">
<form method="POST" action="/addGold">
<h3>Cave</h3>
<p>Finds 5-10 Gold</p>
<input type="hidden" name="building" value="cave">
<button>Find Gold</button>
</form>
</div>

<div class= "box">
<form method="POST" action="/addGold">
<h3>House</h3>
<p>Finds 2-5 Gold</p>
<input type="hidden" name="building" value="house">
<button>Find Gold</button>
</form>
</div>

<div class= "box">
<form method="POST" action="/addGold">
<h3>Casino</h3>
<p>Find / lose up to 50 Gold</p>
<input type="hidden" name="building" value="casino">
<button>Find Gold</button>
</form>
</div>

<h2>Activities</h2>
<c:forEach items="${activityLog }" var="act"/>
<p><c:out value = "${act }"/></p>
</div>
</body>

</html>