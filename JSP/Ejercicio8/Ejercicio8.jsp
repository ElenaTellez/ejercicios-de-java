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
        <h1>Vamos a aprender las tablas de multiplicar</h1> <br><br>
          <form method="post" action="Ejercicio8.2.jsp">           
            Por favor, introduzca un numero y a continuación le mostraremos su tabla de multiplicar de ese número:
            <br><input type="number" name="numero" min ="0" autofocus ="autofocus"><br>
            <input type="submit" value="OK">
        </form> 
        
    </body>
</html>
