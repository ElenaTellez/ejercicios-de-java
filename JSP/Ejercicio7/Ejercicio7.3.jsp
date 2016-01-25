<%-- 
    Document   : Ejercicio3.2
    Created on : 25-ene-2016, 8:09:46
    Author     : ElenaTellez
    Combina las dos aplicaciones anteriores en una sola de tal forma que en la página principal
    se pueda elegir pasar de euros a pesetas o de pesetas a euros. Adorna la página con alguna
    foto o dibujo.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio7.3</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); %>
        Su candidad de euros en pesestas es:
        <% double resultado;
        resultado =  Double.parseDouble(request.getParameter("euros")) / 166.386;                 
        out.print(resultado + " €");%>
        <br><img src= euros.jpg width=\"20%\">
    </body>
</html>
