<%-- 
    Document   : Ejercicio3Jsp
    Created on : 25-ene-2016, 7:58:52
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
        <title>Ejercicio7Jsp</title>
    </head>
    <body>
        <form method="post" action="Ejercicio7.2.jsp">
            <b><i>Conversor de euros a pesetas</b></i><br><br>
            Por favor, introduzca una cantidad en €(puede tener decimales):
            <input type="text" name="euros">
            <input type="submit" value="OK"><br>
            <img src= euros.jpg width=\"20%\">
        </form> 
        <form method="post" action="Ejercicio7.3.jsp">
            <b><i>Conversor de euros a pesetas</b></i><br><br>
            Por favor, introduzca una cantidad en pesetas:
            <input type="text" name="euros">
            <input type="submit" value="OK"><br>
            <img src= pesetas.jpg width=\"20%\">
        </form> 
    </body>
</html>
