<%-- 

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Examen B - Ejercicio 4</title>
    
  </head>
  <body>
           
    
       
    <h1>Tirada de tres dados:</h1>
    
    <%
    int tirada;   
    int contador = 3;    
    
    do {

    for(int i = 0; i < 3; i++) {
      tirada = (int)(Math.random() * 6) + 1;
      if (tirada == 1){              
        out.print(" <img src= dado1.png >");
        }
      if (tirada == 2){  
            
        out.print(" <img src= dado2.png >");
        }
      if (tirada == 3){  
            
        out.print(" <img src= dado3.png >");
        }
      if (tirada == 4){  
            
        out.print(" <img src= dado4.png >");
        }
      if (tirada == 5){  
            
        out.print(" <img src= dado5.png >");
        }
      if (tirada == 6){  
            
        out.print(" <img src= dado6.png >");
        }
      
      
        }
    contador--;
    } while (contador > 0);
   %> 

 
  </body>
</html>
