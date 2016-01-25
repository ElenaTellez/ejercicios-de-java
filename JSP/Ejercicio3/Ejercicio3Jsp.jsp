<%-- 
    Document   : Ejercicio3Jsp
    Created on : 25-ene-2016, 7:58:52
    Author     : ElenaTellez
    Escribe una aplicación que pida tu nombre. A continuación mostrará “Hola” seguido del
    nombre introducido. El nombre se deberá recoger mediante un formulario.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio3Jsp</title>
    </head>
    <body>
        <form method="post" action="Ejercicio3.2.jsp">
        Introduzca su nombre:
        <input type="text" name="nombre">
        <input type="submit" value="OK">
        </form> 
    </body>
</html>
