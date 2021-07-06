<%-- 
    Document   : Main
    Created on : 06-jul-2021, 20:01:31
    Author     : frans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Main</title>
    </head>
    <body>
        <h1>CRUD Web Application project</h1>
        <main>
            <form action="CRUDServlet" name="CRUD" method="get">
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
