<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Saved Builds</title>
     <link href="<c:url value="/resources/SavedBuilds//saved-builds.css" />" rel="stylesheet">
        <link href="<c:url value="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />" rel="stylesheet">
    
</head>
<body background=<c:url value="/resources/SavedBuilds/saved-builds.jpg"/>>
  <header>
    <div class="main">
      <ul>
         <li><a href="PC-type">Home</a></li>
         <li><a href="login">Logout</a></li>
      </ul>
    </div>
  </header>

  <div class="congs">
    <i class="fa fa-cogs" aria-hidden="true"></i>
  </div>
    <div class="container">
        <h3>Your Previous Saved Builds Using PC Builder are:</h3>
         <table class="dark-table">
            <tr>
                <th>CPU</th>
                <th>GPU</th>
                <th>Motherboard</th>
                <th>RAM</th>
                <th>PSU</th>
                <th>HDD</th>
            </tr>

            <!-- loop over and print our customers -->
				<c:forEach var="pcparts" items="${SavedBuilds}">
				
					<tr>
						<td>${pcparts.CPU}</td>
						<td>${pcparts.GPU}</td>	
						<td>${pcparts.MOBO}</td>
						<td>${pcparts.RAM}</td>
						<td>${pcparts.PSU}</td>
						<td>${pcparts.HDD}</td>
					</tr>
				
				</c:forEach>
                  

            </table>
          
    </div>
</body>
</html>