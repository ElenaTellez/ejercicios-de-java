<%-- 
    Document   : index
    Created on : 26-ene-2016, 11:26:47
    Author     : Elena Tellez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilo.css"/>
        <title>Ejercicio9</title>
    </head>
    <body>
        <div id="Ejercicio9">
            Por favor, introduce la altura de la pirámide 
            <form action="piramide.jsp" method="post">
                <input type="number" name="num" autocomplete="off" min="0" required>
                <input type="submit" name="ok" value="OK">
            </form>
        </div>
    </body>
    </body>
</html>
