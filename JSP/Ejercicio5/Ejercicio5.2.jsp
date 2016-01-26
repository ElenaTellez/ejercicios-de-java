<%-- 
    Document   : Ejercicio3.2
    Created on : 25-ene-2016, 8:09:46
    Author     : ElenaTellez
    Realiza un conversor de euros a pesetas.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css"/>
        <title>Ejercicio5.2</title>
    </head>
    <body>
        <% request.setCharacterEncoding("UTF-8"); %>
        Su candidad de euros en pesetas es:
        <% double resultado;
        resultado =  Double.parseDouble(request.getParameter("euros")) * 166.386; 
                
        out.print((int)resultado + " pesetas");%>
    </body>
</html>
