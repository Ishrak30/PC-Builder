<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>PC Builder</title>
        <link href="<c:url value="/resources/pc-type/pc-type.css" />" rel="stylesheet">
        <link href="<c:url value="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />" rel="stylesheet">
    </head>
    <body background=<c:url value="/resources/pc-type/background.jpg"/>>
     <header>
            <div class="main">
              <ul>
                 <li><a href="login">Logout</a></li>
                 <li><a href="SavedBuilds">Saved Builds</a></li>
              </ul>
            </div>
          </header>
          <form action="Voiceinput">
         <div class="mic">
            <div class="box1">
                <input class="s-txt" id="SpeechtoText" type="text" name="voiceinput" placeholder="Speak Now.. " onclick=record()>
                <div class="btn">
                    <i class="fa fa-microphone" aria-hidden="true"></i>
                </div>   
            </div>
       
         <script>
         	function record(){
         	var recognition = new webkitSpeechRecognition();
         	recognition.lang = "en-GB";
         	recognition.onresult = function(event){
         		console.log(event);
				document.getElementById('SpeechtoText').value=event.results[0][0].transcript;
         	}
         	recognition.start();
         	}  	
         </script>
                
         </div>
         </form>
        <div class="container">
            <div class="PC_types">
                <h1>Please Select What Type Of PC You Want To Build..</h1>
            </div>
            
            <div class="box">   
                <div class="icon"><i class="fa fa-laptop" aria-hidden="true"></i></div>
                <div class="content">
                    <h3>General PC</h3>
                    <p>Desktops offer a lot of computing power and performance for the price,
                       and they're flexible because you can connect whatever monitor, keyboard, 
                       and mouse you want to it, as well as install additional storage drives, 
                       memory, and expansion cards that add new capabilities.</p>
                       <a href="generalpcamountinput">Click Here</a>
                </div>

             </div>  
             <div class="box">
                <div class="icon"><i class="fa fa-laptop" aria-hidden="true"></i></div>
                <div class="content">
                    <h3>Work PC</h3>
                    <p>Desktops offer a lot of computing power and performance for the price,
                       and they're flexible because you can connect whatever monitor, keyboard, 
                       and mouse you want to it, as well as install additional storage drives, 
                       memory, and expansion cards that add new capabilities.</p>
                       <a href="workpcamountinput">Click Here</a>
                </div>
            </div>  
            <div class="box">
                <div class="icon"><i class="fa fa-laptop" aria-hidden="true"></i></div>
                <div class="content">
                    <h3>Gaming PC</h3>
                    <p>Desktops offer a lot of computing power and performance for the price,
                       and they're flexible because you can connect whatever monitor, keyboard, 
                       and mouse you want to it, as well as install additional storage drives, 
                       memory, and expansion cards that add new capabilities.</p>
                       <a href="gamingbuildamountinput">Click Here</a>
                </div>
            </div>   
        </div>
    </body>
</html>