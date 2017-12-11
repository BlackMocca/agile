<%-- 
    Document   : cardCodeTopup
    Created on : Dec 11, 2017, 2:09:23 PM
    Author     : huag1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter Card Code | GuPay</title>
    </head>
    <body>
        <h1>Enter Card Code!</h1>
        
        <form method="POST" action="/cardTopup">
            <input type="text" placeholder="your code here..." name="cardCode">
            
            <button type="submit">Submit</button>
        </form>
    </body>
</html>
