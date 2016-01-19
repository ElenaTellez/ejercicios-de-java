<%-- 
    Document   : Ejercicio2
    Created on : 19-ene-2016, 10:47:20
    Author     : Elena Téllez
    
    Mejora el programa anterior de tal forma que la apariencia de la página web que muestra
    el navegador luzca más bonita mediante la utilización de CSS (utiliza siempre ficheros
    independientes para CSS para no mezclarlo con HTML).
--%>

<%-- Ejercicio2.jsp --%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="cssejercicio2.css"/>
  </head>
  <body>
    <% out.println("<h2><i>Nombre:</i> María Elena Téllez Santana<br></h2>"); %>
    <% out.println("<h2><b>Teléfono:</b> 627 77 77 77</h2>"); %>
  </body> 
</html>
