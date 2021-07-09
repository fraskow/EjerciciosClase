<%-- 
    Document   : final
    Created on : 08-jul-2021, 9:34:22
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
        <h1>Hello World! I'm the final page</h1>
        <%
            out.println(request.getAttribute("test"));
            //request.getRequestDispatcher("index.jsp");
                
        %>
        <a href="index.jsp">index</a>
    </body>
</html>
