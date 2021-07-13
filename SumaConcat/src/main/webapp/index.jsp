<%-- 
    Document   : index
    Created on : 12-jul-2021, 13:02:28
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
        <h1>Sumas concatenadas = <%=session.getAttribute("resultados")%></h1>
        <form action="IndexServlet">
            <input type="number" name="num1" value="">
            <input type="number" name="num2" value="">
            <input type="submit" name="boton" value="sumar">
            <input type="number" name="resultado" value="<%=request.getAttribute("resultado")%>">
        </form>
    </body>
</html>
