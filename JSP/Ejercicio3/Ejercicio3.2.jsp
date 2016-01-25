<%-- 
    Document   : Ejercicio3.2
    Created on : 25-ene-2016, 8:09:46
    Author     : ubuntu
    Escribe una aplicación que pida tu nombre. A continuación mostrará “Hola” seguido del
    nombre introducido. El nombre se deberá recoger mediante un formulario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio3.2</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); %>
        ¡Hola!
        <% out.print(request.getParameter("nombre"));%>
</body>
</html>
