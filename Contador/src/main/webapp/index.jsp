<%-- 
    Document   : index
    Created on : 12-jul-2021, 9:46:25
    Author     : Admin
--%>
<%@page import="com.arelance.contador.controlador.ContadorServlet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% int contador;
            if(request.getAttribute("contador")==null){
                contador = 0;
            }else {
                contador = (int) request.getAttribute("contador");
            }
        %>
        <h1>Contador</h1>
        <form action="ContadorServlet">
            <input type="number" name="num" value="<%=contador%>">
            <input type="submit" name="boton" value="sumar 1">
        </form>
    </body>
</html>
