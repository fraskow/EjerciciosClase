<%-- 
    Document   : index
    Created on : 08-jul-2021, 18:32:47
    Author     : frans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calculadora Mapas</h1>
        <form action="CalcuMapaServlet" name="calcu" method="GET">
            <label>Dato 1</label>
            <input type="number" name="op1" placeholder="0">
            <label>Dato 2</label>
            <input type="number" name="op2" placeholder="0">
            <label>Resultado</label>
            <input type="text" name="resultado" placeholder="0">
            <input type="submit" name="boton" value="suma">
            <input type="submit" name="boton" value="resta">
            <input type="submit" name="boton" value="mult">
            <input type="submit" name="boton" value="div">
        </form>
    </body>
</html>
