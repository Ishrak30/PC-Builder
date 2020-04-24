<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<style>


</style>
<meta charset="ISO-8859-1">
<title>Welcome to PC Builder</title>

<link rel="stylesheet" type="text/css" href="${page.Context.request.contextPath}resources/login/style.css">
<body background=<c:url value="/resources/login/images/background.jpg.jpg"/>>
    <div class="loginbox">
<img class="icon" alt="logo" src="<c:url value="/resources/login/icon.png"/>" />
<h1>Login here</h1>
<form action="loginprocess" method = "GET">
    <p>Email</p>
    <input type="text" name="mailid" placeholder="Enter Email" required>
    <p>Password</p>
    <input type="password" name="password" placeholder="Enter Password" required>
    <input type="submit" value="Login">
    <br>
    <br>
    <input type="button" value="Signup" 
     onclick="window.location.href='showsignup'">
    
 </form>
    
</head>    
</div>
</html>