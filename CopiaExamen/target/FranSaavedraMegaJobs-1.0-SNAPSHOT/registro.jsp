<%-- 
    Document   : registro
    Created on : 15-jul-2021, 11:43:17
    Author     : Admin
--%>
<%@page session="false"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    </head>
    <body>
        <%
            String errorNick=request.getAttribute("errorNick")==null?"":(String)request.getAttribute("errorNick");
            String errorPass=request.getAttribute("errorPass")==null?"":(String)request.getAttribute("errorPass");
        %>
        <h1>Registro</h1>
        <form action="RegistroServlet" method="GET">
            <label>Nick:
                <input type="text" name="nick" required>
            </label><%=errorNick%><br>
            <label>Password:
                <input type="text" name="password" required>
            </label><%=errorPass%>
            <label>Password Confirmacion:
                <input type="text" name="passwordConfirmed" required>
            </label>
            <input type="submit" name="login" value="Registrarse">
            <input type="reset" name="reset" value="Clear">
        </form>
        <p>
        </p>
    </body>
</html>
