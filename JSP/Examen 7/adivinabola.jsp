<%-- 
    Document   : resultado
    Created on : 23-mar-2012, 10:44:25
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
        <%
        //out.println(request.getParameter("elegido"));
        int elegido = Integer.parseInt(request.getParameter("elegido"));
        int bolita = (int)(Math.random()*5);
        
        if (bolita == 0)
                out.print("<img src=\"cubilete_con_1bola.png\">");
        
        if (bolita == 1)
                out.print("<img src=\"cubilete_con_2bola.png\">");
        
        if (bolita == 2)
                out.print("<img src=\"cubilete_con_3bola.png\">");

        if (bolita == 3)
                out.print("<img src=\"cubilete_con_4bola.png\">");
        
        if (bolita == 4)
                out.print("<img src=\"cubilete_con_5bola.png\">");
        %>
        <br>
        <%
        if (elegido == bolita)
                out.println("<h2>¡Enhorabuena, has encontrado la bolita!</h2>");
            else
                out.println("<h2>Lo siento, no has acertado.</h2>");
        %>
    </body>
</html>
