<%-- 
    Document   : mid
    Created on : 08-jul-2021, 9:34:15
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
        <h1>Hello World! I'm the middle page</h1>
        <%
            out.println(request.getAttribute("test"));
            //request.getRequestDispatcher("final.jsp");
            //Este ejemplo demuestra que las peticiones tienen un corto tiempo de vida el cual
            //muere cuando se realiza una nueva petición por lo que se pierde el atributo designado.
        %>
        <a href="final.jsp">final</a>
    </body>
</html>
