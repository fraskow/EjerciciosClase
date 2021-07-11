<%-- 
    Document   : login
    Created on : 09-jul-2021, 11:48:57
    Author     : Admin
--%>
<%@page import="com.arelance.tiendaweb2.controller.LoginServlet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login tienda</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="LoginServlet" name="loginForm">
            <label>Nick</label>
            <input type="text" name="nick" required>
            <label>Password</label>
            <input type="text" name="pw" required>
            <label>Password confimacion</label>
            <input type="text" name="pwConfirmed" required>
            <input type="submit" name="boton" value="login">
            <input type="reset" name="boton" value="clear">
        </form>
    </body>
</html>
