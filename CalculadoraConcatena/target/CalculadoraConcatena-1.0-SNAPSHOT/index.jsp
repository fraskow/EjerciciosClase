<%-- 
    Document   : index
    Created on : 12-jul-2021, 18:43:16
    Author     : frans
--%>
<%@page import="com.arelance.calculadoraconcatena.controller.CalculadoraServlet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Suma concatenada = <%=session.getAttribute("resultados")%></h1>
        <form action="CalculadoraServlet">
            <input type="number" name="n1">
            <input type="number" name="n2">
            <input type="submit" name="boton" value="sumar">
        </form>
    </body>
</html>
