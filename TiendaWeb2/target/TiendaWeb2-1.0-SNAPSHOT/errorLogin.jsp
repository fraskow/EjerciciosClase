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
            <input type="text" name="errores" value="<% int contador = (int)request.getSession().getAttribute("contador");
                                                        out.print(contador++); %>">
            <input type="submit" name="boton" value="volver">
        </form>
    </body>
</html>
