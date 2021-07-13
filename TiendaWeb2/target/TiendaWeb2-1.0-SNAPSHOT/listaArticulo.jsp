<%-- 
    Document   : listaArticulo
    Created on : 13-jul-2021, 13:14:05
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de la compra</h1>
        <p>
            <%=request.getSession().getAttribute("compras")%>
        </p>
        <form action="CarritoServlet">
            <label>¿Desea salir de la sesesion?</label>
            <input type="submit" name="boton" value="si">
            <input type="submit" name="boton" value="no">
        </form>
        
    </body>
</html>
