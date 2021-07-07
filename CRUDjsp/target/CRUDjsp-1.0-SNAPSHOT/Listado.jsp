<%-- 
    Document   : Listado
    Created on : 06-jul-2021, 20:03:38
    Author     : frans
--%>

<%@page import="com.arelance.crudjsp.test.Usuario"%>
<%@page import="java.util.Set"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado usuarios</title>
    </head>
    <body>
        <h1>Listado usuarios</h1>

        <%
            Set<Usuario> usuarios = (Set<Usuario>) request.getSession().getAttribute("listado");

            for (Usuario usuario : usuarios) {
                out.print("<li name='listado'>");
                out.print(usuario.getNombre() + " " + usuario.getApellidos() + " " + usuario.getEdad() + " ");
                out.print("</li>");
            }

        %>
        <form action="Main.jsp">
            <input type="submit" value="volver">
        </form>
    </body>

</html>
