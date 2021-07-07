<%-- 
    Document   : Lista
    Created on : 07-jul-2021, 12:59:58
    Author     : Admin
--%>

<%@page import="java.util.Set"%>
<%@page import="com.arelance.crudbasic.main.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista usuarios</title>
    </head>
    <body>
        <h1>Lista usuarios</h1>

        <%
            Set<Usuario> usuarios = (Set<Usuario>) request.getSession().getAttribute("listado");

            for (Usuario usuario : usuarios) {
                out.print("<li name='listado'>");
                out.print(usuario.getNombre() + " " + usuario.getApellido() + " " + usuario.getEdad() + " ");
                out.print("</li>");
            }

        %>
        <form action="Main.jsp">
            <input type="submit" value="volver">
        </form>
    </body>
</html>
