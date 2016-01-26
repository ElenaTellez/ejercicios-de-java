<%-- 
    Document   : Ejercicio3Jsp
    Created on : 25-ene-2016, 7:58:52
    Author     : ElenaTellez
    Realiza un conversor de euros a pesetas.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css"/>
        <title>Ejercicio5Jsp</title>
    </head>
    <body>
        <form method="post" action="Ejercicio5.2.jsp">
            <b><i>Conversor de euros a pesetas</b></i><br><br>
            Por favor, introduzca una cantidad en €(puede tener decimales):
            <input type="number" name="euros" step="0.01" autofocus="autofocus"><br>
            <input type="submit" value="OK">
            </form> 
    </body>
</html>
