<%-- 
    Document   : index
    Created on : 09-jul-2021, 11:48:47
    Author     : Admin
--%>
<%@page session="false"%>
<%@page import="com.arelance.tiendaweb2.controller.IndexServlet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio tienda</title>
    </head>
    <body>
        <h1>Inicio</h1>
        <form action="IndexServlet" name="indexForm">
            <input type="submit" name="boton" value="login">
            <input type="submit" name="boton" value="registro">
        </form>
    </body>
</html>
