<%-- 
    Document   : rectangulo
    Created on : 23-mar-2012, 9:45:31
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
        double altura = Double.parseDouble(request.getParameter("altura"));
        double anchura = Double.parseDouble(request.getParameter("anchura"));
        out.print("El área es " + (altura * anchura) + " metros cuadrados.");
        %>
    </body>
</html>