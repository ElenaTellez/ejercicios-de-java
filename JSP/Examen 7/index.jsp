<%-- 
    Document   : index
    Created on : 23-mar-2012, 10:34:04
    Author     : Elena Téllez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Turno 1 - Ejercicio 4</title>
    </head>
    <body>
        <img src="cubilete_tapando_bolas.png">
         <form method="post" action="adivinabola.jsp">
            ¿Cuantas bolitas crees que contiene el cubilete?: 
            <select name="elegido">
                <option value="0">1</option>
                <option value="1">2</option>
                <option value="2">3</option>
                <option value="3">4</option>
                <option value="4">5</option>
            </select>
            <input type="submit" value="ok">
        </form>
    </body>
</html>
