<%-- 
    Document   : registro
    Created on : 09-jul-2021, 11:49:06
    Author     : Admin
--%>
<%@page import="com.arelance.tiendaweb2.controller.RegistroServlet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro user tienda</title>
    </head>
    <body>
        <h1>Registro de usuario</h1>
        <form action="RegistroServlet" name="registroForm">
            <label>Nick</label>
            <input type="text" name="nick" required>
            <label>Password</label>
            <input type="text" name="pw" required>
            <label>Nombre</label>
            <input type="text" name="nombre" required>
            <label>Apellido</label>
            <input type="text" name="apellido" required>
            <label>Edad</label>
            <input type="text" name="edad">
            <label>Direccion</label>
            <label>CP</label>
            <input type="text" name="cp">
            <label>Calle</label>
            <input type="text" name="calle">
            <label>Nº</label>
            <input type="text" name="num">
            <input type="submit" name="boton" value="registro">
        </form>
    </body>
</html>
