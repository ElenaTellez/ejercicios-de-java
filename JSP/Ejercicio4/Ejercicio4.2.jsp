<%-- 
    Document   : Ejercicio3.2
    Created on : 25-ene-2016, 8:09:46
    Author     : ubuntu
    Realiza una aplicación que calcule la media de tres notas.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio4.2</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); %>
        Su nota media es:
        <% double resultado;
        resultado =  Double.parseDouble(request.getParameter("notaUno")) 
                + Double.parseDouble(request.getParameter("notaDos")) 
                + Double.parseDouble(request.getParameter("notaTres"))/ 3;
        out.print(resultado);%>
</body>
</html>
