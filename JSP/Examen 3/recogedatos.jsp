<%-- 
    Document   : recogedatos
    Created on : 23-mar-2012, 9:24:28
    Author     : Elena Téllez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Turno 1 - Ejercicio 2</title>
    </head>
    <body>
         <% request.setCharacterEncoding("UTF-8");
         String figura = request.getParameter("figura");
         %>
         <form method="post" action="
        <%     
        if (figura.equals("cuadrado")) {
            out.print("cuadrado.jsp\">");
            out.print("introduzca la longitud del lado en metros: <input type=\"text\" name=\"lado\" size=\"4\">");
        }

        if (figura.equals("rectángulo")) {
            out.print("rectangulo.jsp\">");
            out.print("introduzca la altura en metros: <input type=\"text\" name=\"altura\" size=\"4\"><br>");
            out.print("introduzca la anchura en metros: <input type=\"text\" name=\"anchura\" size=\"4\"><br>");
        }
            
        if (figura.equals("triángulo")) {
            out.print("triangulo.jsp\">");
            out.print("introduzca la altura en metros: <input type=\"text\" name=\"altura\" size=\"4\"><br>");
            out.print("introduzca la anchura en metros: <input type=\"text\" name=\"anchura\" size=\"4\"><br>");
        }
        %>
        <br>
        <input type="submit" value="ok">
        </form>
    </body>
</html>
