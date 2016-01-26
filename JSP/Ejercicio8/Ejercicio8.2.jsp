<%-- 
    Document   : Ejercicio3.2
    Created on : 25-ene-2016, 8:09:46
    Author     : ElenaTellez
    Realiza una aplicación que pida un número y que luego muestre la tabla de multiplicar de
    ese número. El resultado se debe mostrar en una tabla ( <table> en HTML).
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="estilos.css"/>
        <title>Ejercicio8</title>
    </head>
    <body>
        
        <h1>Tabla de multiplicar</h1>
        
        <table border="2">
          
            <%  
                for(int i = 0; i < 11; i++) {
                    out.print("<tr><td>");    
                    int numero = Integer.valueOf(request.getParameter("numero"));
                    out.print(numero + "</td><td> x </td><td> " + i + " </td><td> = </td><td>");                               
                    out.print(numero * i);
                    out.print("</td></tr>");
                }
            %>
        </table>
    </body>
</html>
