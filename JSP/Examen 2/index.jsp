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
        <img src="cubilete_sin_bola.png">
        <img src="cubilete_sin_bola.png">
        <img src="cubilete_sin_bola.png">
         <form method="post" action="resultado.jsp">
            Seleccione cubilete: 
            <select name="elegido">
                <option value="0">izquierda</option>
                <option value="1">centro</option>
                <option value="2">derecha</option>
            </select>
            <input type="submit" value="ok">
        </form>
    </body>
</html>
