<%-- 
    Document   : Ejercicio3Jsp
    Created on : 25-ene-2016, 7:58:52
    Author     : ElenaTellez
    Realiza una aplicación que calcule la media de tres notas.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css"/>
        <title>Ejercicio4Jsp</title>
    </head>
    <body>
        <form method="post" action="Ejercicio4.2.jsp">
            Vamos a calcular su nota media.<br>
            Por favor, introduzca su nota(puede tener decimales):
            <input type="number" name="notaUno" step ="0.01" min ="0" max ="10"><br>
             Por favor, introduzca su nota(puede tener decimales):
            <input type="number" name="notaDos" step ="0.01" min ="0" max ="10"><br>
             Por favor, introduzca su nota(puede tener decimales):
            <input type="number" name="notaTres" step ="0.01" min ="0" max ="10"><br>
            <input type="submit" value="OK">
            </form> 
    </body>
</html>
