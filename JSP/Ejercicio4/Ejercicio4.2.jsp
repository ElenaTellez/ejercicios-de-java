<%-- 
    Document   : Ejercicio3.2
    Created on : 25-ene-2016, 8:09:46
    Author     : ubuntu
    Realiza una aplicación que calcule la media de tres notas.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css"/>
        <title>Ejercicio4.2</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); %>
        Su nota media es:
        <% double suma;
        suma =  (Double.parseDouble(request.getParameter("notaUno")) 
                + Double.parseDouble(request.getParameter("notaDos")) 
                + Double.parseDouble(request.getParameter("notaTres")));
        out.print(suma/3);%>
</body>
</html>
