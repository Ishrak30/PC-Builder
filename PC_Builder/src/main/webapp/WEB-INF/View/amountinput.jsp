<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
       
       <link href="<c:url value="/resources/amount-input/amount-input.css" />" rel="stylesheet">
       <link href="<c:url value="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />" rel="stylesheet">


      <title>Budget Box</title>
    </head>
    <body background=<c:url value="/resources/amount-input/background.jpg"/>>

<form name=${PCtype}></form>

       <header>
            <div class="main">
              <ul>
                 <li><a href="#">Home</a></li>
                 <li><a href="#">Budget</a></li>
                 <li><a href="#">Logout</a></li>
              </ul>
            </div>
          </header>
          <div class="title">
            <h2>Please Click The Button Given..</h2>
        </div>

<form action="build" method = "GET">
        <div class="box">
        
            <input class="s-txt" type="text" name="amount" placeholder="Type your budget $">
            <div class="btn">
                <i class="fa fa-usd" aria-hidden="true"></i>
            </div>
              
        </div>
        </form>
    </body>
</html>