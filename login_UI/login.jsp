<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to PC Builder</title>
</head>
<body>
       <%
       
       String username = request.getParameter("username");
       String password = request.getParameter("pasword");
       
       if(username.equals("Nobin")&&password.equals("1234"))
       {
    	   
    	   response.sendRedirect("LoginSuccess.html");
       }
       else
       {
    	   
    	   response.sendRedirect("LoginSuccess.html");
    	   
       }
       
       
       %>
</body>
</html>