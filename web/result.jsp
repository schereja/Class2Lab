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
            List result = (List)request.getAttribute("msg");
        Iterator it = result.iterator();
        while(it.hasNext()) {
            // Notice we're outputting some HTML. Is that a good idea?
            // Also, notice we do not cast the object returned by the
            // iterator to a String. Why?
            out.print(it.next());
        }
    %>
    </body>
</html>
