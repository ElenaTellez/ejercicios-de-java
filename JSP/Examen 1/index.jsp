<%-- 
    Document   : index
    Created on : 23-mar-2012, 8:36:41
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
           int fila, columna;
           
           for(fila = 8; fila > 0; fila--) {
               out.print("<tr><td>" + fila + "</td>");
               for (columna = 1; columna < 9; columna++) {
                   if ((fila + columna)%2 != 0)
                           out.print("<td class=\"blanca\"> </td>");
                       else
                           out.print("<td class=\"negra\"> </td>");
                                

               }
               out.print("<td>" + fila + "</td></tr>");             
           }      
            
        %>
           <tr><td></td><td>a</td><td>b</td><td>c</td><td>d</td><td>e</td><td>f</td><td>g</td><td>h</td><td></td></tr>
        </table>
           <br><br>
           <form method="post" action="caballo.jsp">
            Introduzca las coordenadas del caballo  <input type="text" name="coordenadas" size="4"> 
            &nbsp;<input type="submit" value="Aceptar">
        </form>
        </div>
    </body>
</html>
