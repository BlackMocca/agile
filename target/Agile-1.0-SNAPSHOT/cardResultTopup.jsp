<%-- 
    Document   : cardResultTopup
    Created on : Dec 11, 2017, 2:10:03 PM
    Author     : huag1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Topup Result | GuPay</title>
    </head>
    <body>
        <h1>Card Result Topup</h1>
        
        <p>Username</p>
        <p>Card Code</p>
        <p>Point</p>
        
        <form method="POST" action="/cardTopupConfirm">
            <input type="hidden" value="" name="cardCode">
            <input type="hidden" value="" name="point">
            <input type="hidden" value="" name="userId">
            <button type="submit">Confirm</button>
        </form>
    </body>
</html>
