<%-- 
    Document   : hello_world
    Created on : Dec 10, 2017, 1:36:41 PM
    Author     : huag1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>
            <%= request.getAttribute("marvenMsg") %>
        </h1>
    </body>
</html>
