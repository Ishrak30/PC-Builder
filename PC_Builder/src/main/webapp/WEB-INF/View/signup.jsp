<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>welcome to PC Builder</title>
</head>

<link href="<c:url value="/resources/signup/signup.css" />" rel="stylesheet">

<body background=<c:url value="/resources/signup/signup.jpg"/>>
    
    <div class="signup-box">    
    
    <h1>Sign up</h1>
    <form action="signup"  modelAttribute="user" method = "POST">
    
    <div class="textbox">
    
        <i class="fas fa-at" aria-hidden="true"></i>

    <input type="text" name="email" placeholder="Email" required>
    </div>
 


    <div class="textbox">

        <i class="fas fa-lock" aria-hidden="true"></i>

    <input type="password" name="pass" placeholder="Password"required>
   

     <input type="submit" name="save" value="Signup">   
</div>
      </form>    
    </div>
    
    
</body>
</html>