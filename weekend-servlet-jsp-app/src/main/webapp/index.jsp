<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" isELIgnored= "false"%>
<html>
	<head>
		<title> My jsp page </title>
	</head>
	<body>
		
		<form action="user" method="get">
			<label>Enter user id:-</label>
			<input type="text" name="userid">
			<input type="submit">
		</form>
	
		<h2>${data}</h2>
	</body>
</html>
