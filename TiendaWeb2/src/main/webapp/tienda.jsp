<%-- 
    Document   : tienda
    Created on : 10-jul-2021, 17:24:26
    Author     : frans
--%>
<%@page import="com.arelance.tiendaweb2.controller.TiendaServlet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tienda</title>
    </head>
    <body>
        <h1>Tienda</h1>
        <form action="TiendaServlet" name="tiendaForm">
            <label>Deportes - pelota futbol</label>
            <input type="checkbox" name="articulos"  value="pelota">
            <label>Deportes - botas baloncesto</label>
            <input type="checkbox" name="articulos" value="botas">
            <label>Hogar - mesita de noche</label>
            <input type="checkbox" name="articulos" value="mesita">
            <label>Hogar - lampara</label>
            <input type="checkbox" name="articulos" value="lampara">
            <label>Textil - camiseta</label>
            <input type="checkbox" name="articulos" value="camiseta">
            <label>Textil - vestido</label>
            <input type="checkbox" name="articulos" value="vestido">
            <input type="submit" name="boton" value="comprar">
            <input type="reset" name="boton" value="limpiar">
        </form>
    </body>
</html>
