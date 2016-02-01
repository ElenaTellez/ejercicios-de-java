<%-- 
    Document   : Ejercicio10.2
    Created on : 27-ene-2016, 20:20:29
    Author     : Elena

    En el bucle sumo uno cuando value suma 1, o 0 si vale 0, puntos suma el valor de value
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css"/>
        <title>Ejercicio 10.2</title>
    </head>
    <body>
        <h1>Puntuacion</h1>
        
        <p>
        Ha obtenido
        <%
            int puntos = 0;

            for (Integer i = 1; i < 11; i++) {
                puntos += Integer.parseInt(request.getParameter("p" + i.toString()));
            }

            out.print(puntos);
        %>
        puntos, haga clic <a href="Ejercicio10.jsp">aquí</a> para repetir el cuestionario.
        </p>
    </body>
</html>
