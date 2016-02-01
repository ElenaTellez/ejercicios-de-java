<%-- 
    Document   : index
    Created on : 23-mar-2012, 9:19:19
    Author     : Elena Téllez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Turno 1 - Ejercicio 2</title>
    </head>
    <body>
        <h2>Cálculo de áreas</h2>
        <form method="post" action="recogedatos.jsp">
            Seleccione figura: 
            <select name="figura">
                <option>cuadrado</option>
                <option>rectángulo</option>
                <option>triángulo</option>
            </select>
            <input type="submit" value="ok">
        </form>
    </body>
</html>
