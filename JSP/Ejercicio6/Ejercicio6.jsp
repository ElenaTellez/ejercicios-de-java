<%-- 
    Document   : Ejercicio3Jsp
    Created on : 25-ene-2016, 7:58:52
    Author     : ElenaTellez
    Realiza un conversor de pesetas a €.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css"/>
        <title>Ejercicio6Jsp</title>
    </head>
    <body>
        <form method="post" action="Ejercicio6.2.jsp">
            <b><i>Conversor de euros a pesetas</b></i><br><br>
            Por favor, introduzca una cantidad en pesetas:
            <input type="number" name="pesetas" step="0.01" autofocus="autofocus"><br>
            <input type="submit" value="OK">
        </form> 
    </body>
</html>
