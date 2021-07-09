<%-- 
    Document   : index
    Created on : 08-jul-2021, 9:34:03
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
        <h1>Hello World! I'm the main page</h1>
        <%
            request.setAttribute("test", "prueba de vida");
            out.println(request.getAttribute("test"));
            //request.getRequestDispatcher("mid.jsp");
        %>
        <a href="mid.jsp">mid_page</a>
    </body>
</html>
