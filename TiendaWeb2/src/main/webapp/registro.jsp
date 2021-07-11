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
            <input type="text" name="pwRegistro" required>
            <label>Nombre</label>
            <input type="text" name="nombre" required>
            <label>Apellido</label>
            <input type="text" name="apellido" required>
            <label>Edad</label>
            <input type="text" name="edad" required>
            <br>
            <label>Direccion</label>
            <label>CP</label>
            <input type="text" name="cp" required>
            <label>Calle</label>
            <input type="text" name="calle" required>
            <label>Nº</label>
            <input type="text" name="num" required>
            <input type="submit" name="boton" value="registro">
            <input type="reset" name="boton" value="clear">
        </form>
    </body>
</html>
