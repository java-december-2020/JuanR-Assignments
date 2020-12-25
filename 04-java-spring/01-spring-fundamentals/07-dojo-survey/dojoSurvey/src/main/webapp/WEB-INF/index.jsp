<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
<form method="POST" action="/result">
	<div class="block">
		<h3>Your name: <input type="text" name=name></h3>
	</div>
	<label>Dojo Location:</label>
	<select name="location">
		<option>San Jose</option>
		<option>Oakland</option>
		<option>Los Angeles</option>
	</select>
	<div class="block">
		<label>Favorite Language:</label>
		<select name="language">
			<option>Python</option>
			<option>Java</option>
			<option>JavaScript</option>
		</select>
	</div>
	<div class="block">
		<label>Comment(optional): 
		<textarea name="comment" rows="4" cols="25"></textarea>
		</label>
		<button>Button</button>
	</div>
</form>
</body>
</html>