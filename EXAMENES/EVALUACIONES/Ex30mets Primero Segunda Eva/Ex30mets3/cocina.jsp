<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Examen B - Ejercicio 3</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>La cocina que usted ha elegido y su precio es:</h1>
    <%
      String acabado = request.getParameter("acabado");
      String asa = request.getParameter("asa");
      String imagen = acabado + asa + ".jpg";
      String elec = request.getParameter("elec");
      
      
    
    %>
    <p><img src="<%= imagen %>"></p>   
    <%          
    String precioUno = "El precio de su cocina con electrodomésticos incluidos es: 9.000€ del precio de los muebles + 4.500€ del precio de los electrodomesticos + 2.835€ del 21% de IVA = 16.335€";
    String precioDos = "El precio de su cocina sin electrodomésticos es: 9.000€ del precio de los muebles + 1.890€ del 21% de IVA = 10.890€";
    String precioTres = "El precio de su cocina con electrodomésticos incluidos es: 8.000€ del precio de los muebles + 4.500€ del precio de los electrodomesticos + 2.625€ del 21% de IVA = 15.125€";
    String precioCuatro = "El precio de su cocina sin electrodomésticos  es: 8.000€ del precio de los muebles +1.680 € del 21% de IVA = 9.680€";
    if ((acabado.equals("madera")) && (elec.equals("si"))){  
            
        out.print(precioUno );
        }
    if (acabado.equals("madera")){  
            
        out.print(precioDos);
        }
    if (((acabado.equals("naranja")) || (acabado.equals("verde"))) && (elec.equals("si"))){  
            
        out.print(precioTres );
        }
    if ((acabado.equals("naranja")) || (acabado.equals("verde")))  {  
            
        out.print(precioCuatro);
        }
       %>    
      
        
  </body>
</html>
