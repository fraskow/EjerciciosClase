<%-- 
    Document   : Seguridad
    Created on : 07-jul-2021, 19:51:19
    Author     : frans
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seguridad</title>
    </head>
    <body>
        <h1>¿Estás seguro?</h1>
        <form action="PostDeleteServlet" name="seguridad" method="GET">
            <input type="submit" name="decision" value="si">
            <input type="submit" name="decision" value="no">
        </form>
    </body>
</html>
