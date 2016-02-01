<%-- 
    Document   : index
    Created on : 19-mar-2012, 22:52:44
    Author     : Elena Téllez



15. Realiza una aplicación que genere 100 números aleatorios del 1 al 200. Los
    primos deberán aparecer en un color diferente al resto.


--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EJERCICIO 1</title>
        <link href="estilos.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <%!
            static boolean esPrimo(int n) {
                for (int i = 2; i < n; i++)
                    if (n%i == 0) return false;
                return true;
            }
            
             static boolean multiplo5(int n) {
                    if (n%5 == 0) return true;
                return false;
            }
        %>
        
        <div id="principal">
        <p>
            Esta aplicación genera 200 números aleatorios del 1 al 100. Los primos aparecen
            en color rojo y los multiplos de 5 en azul.
        </p>
        <p>
            <%
                int n;
                for (int i = 0; i < 200; i++) {
                    n = (int)(Math.random()*100) + 1;
                    if (esPrimo(n)) 
                            out.print("<span class=\"primo\">" + n + "</span> ");
                     
                    if (multiplo5(n)) 
                            out.print("<span class=\"multiplo5\">" + n + "</span> ");
                     else 
                            out.print(n + " ");
                }
            %>
            
        </p>
        <p>
            Pulsa la tecla <b>F5</b> para ejecutar de nuevo la aplicación.
        </p>
        </div>
    </body>
</html>
