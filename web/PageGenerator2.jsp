<%-- 
    Document   : PageGenerator2
    Created on : Jan 22, 2014, 6:59:58 PM
    Author     : schereja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% int productid = 1;%>
        <table border="1">
            <tr>
                <td>
                    Product ID
                </td>
                
                <td>
                    Product Name
                </td>
                
                <td>
                    Product Description
                </td>
            </tr>
            <tr>
                <td>
                    <%= productid %>
                </td>
                
                <td>
                    AMD CPU
                </td>
                
                <td>
                    2600+
                </td>
            </tr>
            <tr>
                <td>
                    <%= ++productid %>
                </td>
                
                <td>
                    Intel CPU
                </td>
                
                <td>
                    P4
                </td>
            </tr>
            <tr>
                <td>
                    <%= ++productid %>
                </td>
                
                <td>
                    ARM CPU
                </td>
                
                <td>
                    Snap Dragon
                </td>
            </tr>
        </table>
    </body>
</html>
