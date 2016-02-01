<%-- 
    Document   : form
    Created on : 26-ene-2016, 11:29:53
    Author     : Elena Tellez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <title>Piramide</title>
    </head>
    <body>
        <div>
            <%
                int alturaIntroducida = Integer.parseInt(request.getParameter("num"));
                int altura = 1;
                int i = 0;
                int espacios = alturaIntroducida-1;
    
                 while (altura <= alturaIntroducida) {
      
                for (i = 1; i <= espacios; i++) {
                    out.print(" <img src= ./img/blanco.jpg width=60px height=15px\">");
                }

                 
                for (i = 1; i < altura * 2; i++) {
                     out.print(" <img src= ./img/ladrillo.jpg width=60px height=15px\">");
                }

                out.print("<br>");

                altura++;
                espacios--;
                }
            %>
        </div>
    </body>
</html>
    