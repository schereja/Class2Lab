<%-- 
    Document   : welcome
    Created on : Jan 29, 2014, 5:32:40 PM
    Author     : schereja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <title>Welcome Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
    </head>
    <body>
        <div>
            <form id ="form1" name="form1" method="POST" action="greeter">
                <label>Enter Your Name</label>
                <input type="text" id="name" name="name">
                <br>
                <input type="submit" name="Submit">
            </form>
        </div>
    </body>
</html>
