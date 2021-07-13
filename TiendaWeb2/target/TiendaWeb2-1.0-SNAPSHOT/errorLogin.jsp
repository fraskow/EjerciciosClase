<%-- 
    Document   : errorLogin
    Created on : 10-jul-2021, 17:35:40
    Author     : frans
--%>
<%@page import="com.arelance.tiendaweb2.controller.LoginServlet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error page</title>
    </head>
    <body>
        <h1>Error de login</h1>
        <p>¿Desa volver al login?</p>
        <form action="login.jsp">
            <p> Contraseña no confirmada </p>
            <input type="submit" name="boton" value="volver">
        </form>
    </body>
</html>
