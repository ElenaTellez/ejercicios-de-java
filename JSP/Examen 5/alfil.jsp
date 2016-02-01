<%-- 
    Document   : caballo
    Created on : 22-mar-2012, 23:59:05
    Author     : Elena Téllez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Turno 1 - Ejercicio 3</title>
        <link href="estilos.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div id="principal">
        <table id="tablero">
            <tr><td></td><td>a</td><td>b</td><td>c</td><td>d</td><td>e</td><td>f</td><td>g</td><td>h</td><td></td></tr>
        <%
           String letras = "abcdefgh";
           int columnaAlfil = letras.indexOf((request.getParameter("coordenadas")).substring(0, 1)) + 1;
           int filaAlfil = Integer.parseInt((request.getParameter("coordenadas")).substring(1, 2));

           int fila, columna;

          for(fila = 8; fila > 0; fila--) {
               out.print("<tr><td>" + fila + "</td>");
               for (columna = 1; columna < 9; columna++) {
                   if ((fila + columna)%2 != 0)
                           out.print("<td class=\"blanca\">");
                       else
                           out.print("<td class=\"negra\">");

                   if ((columnaAlfil == columna) && (filaAlfil == fila))
                           out.print("<img src=\"alfil_blanco.png\"> </td>");
                       else
                           out.print(" </td>"); 
                }
            
           out.print("<td>" + fila + "</td></tr>");             
           }                
        %>
        <tr><td></td><td>a</td><td>b</td><td>c</td><td>d</td><td>e</td><td>f</td><td>g</td><td>h</td><td></td></tr>

    </body>
</html>