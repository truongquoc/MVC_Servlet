<%@ page language="java" contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title> Login Screen </title>
</head>
<body>
<% String temp = "temp"; session.setAttribute("temp", temp); %>
<form action="Login" method="post">
    Username: <input type="text" name="username" />
    Password: <input type="password" name="password" />
    <input type="submit" value="OK" />
    <input type="reset" value="Reset" />
</form>
</body>
</html>