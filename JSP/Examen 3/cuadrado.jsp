<%-- 
    Document   : cuadrado
    Created on : 23-mar-2012, 9:42:30
    Author     : Elena Téllez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Turno 1 - Ejercicio 2</title>
    </head>
    <body>
        <%
        double lado = Double.parseDouble(request.getParameter("lado"));
        out.print("El área es " + (lado * lado) + " metros cuadrados.");
        %>
    </body>
</html>
