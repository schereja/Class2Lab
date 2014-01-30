<%-- 
    Document   : result
    Created on : Jan 22, 2014, 9:25:43 PM
    Author     : schereja
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.Iterator"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        
        String msg = "No msg returned, input invalid.";
        Object objMsg = request.getAttribute("msg");
        msg = objMsg == null ? msg :objMsg.toString();
       
    %>
    <%= msg%>
    </body>
</html>
