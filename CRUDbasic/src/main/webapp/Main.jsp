<%-- 
    Document   : Main
    Created on : 07-jul-2021, 12:58:12
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>
        <h1>Usuarios</h1>
        <form action="ServletCRUD" name="CRUD" method="get">
            <label for="name">Nombre:</label>
            <input type="text" name="name" id="name">
            <label for="apellidos">Apellidos:</label>
            <input type="text" name="apellidos" id="apellidos">
            <label for="edad">Edad:</label>
            <input type="number" name="edad" id="edad">
            <input type="submit" name="boton" value="save">
            <input type="submit" name="boton" value="delete">
        </form>
    </body>
</html>
