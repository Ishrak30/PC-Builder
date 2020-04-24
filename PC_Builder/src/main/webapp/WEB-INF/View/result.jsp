<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>PC Builder</title>
        <link href="<c:url value="/resources/result/result.css" />" rel="stylesheet">
        <link href="<c:url value="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />" rel="stylesheet">
</head>
<body background=<c:url value="/resources/result/result.jpg"/>>
   <header>
    <div class="main">
      <ul>
         <li><a href="PC-type">Home</a></li>   
         <li><a href="login">Logout</a></li>
      </ul>
    </div>
    <div class="main1">
      <ul> 
         <form action="savebuild" method="POST">
          <input type="submit" name="save" value="Save Build">
         </form>
      </ul>
    </div>
         
  </header>
  <div class="congs">
    <i class="fa fa-cogs" aria-hidden="true"></i>
  </div>
    <div class="container">
       <table class= "dark-table1">
        <tr>
          <th>The Price You Have Given:</th>
          <td>$ ${budgetentered}</td>
        </tr>
       </table>
        <h3>Personalized Configuration For You Under Your Budget Is:</h3>
         
         <table class="dark-table">
                 <tr>
                    <th>GPU:</th>
                    <td>${pcpart.GPUmodel}</td>
                  </tr>
                
               	 <tr>
                    <th>PROCESSOR:</th>
                    <td>${pcpart.CPU_model}</td>
                  </tr>
                
                
               	 <tr>
                    <th>RAM:</th>
                    <td>${pcpart.RAM_model}</td>
                  </tr>
                 
                  <tr>
                    <th>PSU:</th>
                    <td>${pcpart.PSUmodel}</td>
                  </tr>
                 
                   <tr>
                    <th>MOTHERBOARD:</th>
                    <td>${pcpart.MOBO_model}</td>
                  </tr>
                 
                 <tr>
                    <th>STORAGE:</th>
                    <td>${pcpart.HDD_model}</td>
                  </tr>
 			  
                 
                 
            </table>
       
    </div>
</body>
</html>
