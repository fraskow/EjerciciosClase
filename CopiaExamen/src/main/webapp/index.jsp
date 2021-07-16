<%-- 
    Document   : index
    Created on : 15-jul-2021, 11:42:38
    Author     : Admin
--%>
<%@page import="java.util.Set"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="com.arelance.megajobs.beans.Usuario"%>
<%@page import="java.util.List"%>
<%@page import="com.arelance.megajobs.beans.Oferta"%>
<%@page session="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Index</title>
    </head>
    <body>
        <%
            Map<Oferta, Set<Usuario>> inscritos = (Map<Oferta, Set<Usuario>>) application.getAttribute("inscritos");
            List<Oferta> ofertas = new ArrayList<>(inscritos.keySet());
        %>
        <h1>Inicio</h1>

        <% if (request.getSession(false) != null) {
        %>
        <form action="IndexServlet">
            <% for (Oferta oferta : ofertas) {%>
            <input type="checkbox" name="ofertas" value="<%=ofertas.indexOf(oferta)%>">
            <label><a href="oferta.jsp"><%=oferta.descripcion%></a></label>
            
            <br>
            <%
                }
            %> 
            <input type="submit" name="boton" value="Inscribirse">
            <% } else {
                for (Oferta oferta : ofertas) {
            %>
            <li><a href="oferta.jsp"><%=oferta.descripcion%></a></li>
                <%}%>
            <form>
                <input type="submit" name="login" value="Login" formaction="login.jsp">
                <input type="submit" name="registro" value="Registro" formaction="registro.jsp">
            </form>
            <% }%>
        </form>
    </body>
</html>
