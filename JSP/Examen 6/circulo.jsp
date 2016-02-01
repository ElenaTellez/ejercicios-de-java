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
        double radio = Double.parseDouble(request.getParameter("radio"));
        out.print("El área es " + (Math.PI * radio * radio) + " metros cuadrados.");
        %>
    </body>
</html>
