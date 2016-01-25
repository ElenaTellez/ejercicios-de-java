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
        <title>Ejercicio8</title>
    </head>
    <body>
        <table border="2">
            <tr>
                <td>
                    Tabla de multiplicar
                </td>
            </tr>
                <%
                    for(int i = 0; i < 11; i++) {
                        out.println("<tr>");                                
                            out.print(request.getParameter("<td>" + i + "</td>"));
                            out.println("<td>");    
                            int numero = Integer.valueOf(request.getParameter("numero"));
                            out.print(numero + " x " + i + " = ");                               
                            int resultado = Integer.valueOf(request.getParameter("numero"));
                            out.println(resultado * (i+1));
                        out.println("</td></tr>");
                    }
                %>
        </table>
    </body>
</html>
