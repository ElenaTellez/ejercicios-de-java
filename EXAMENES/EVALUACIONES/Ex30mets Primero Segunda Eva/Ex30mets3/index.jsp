<%-- 
Un fabricante de cocinas nos ha pedido hacer un configurador. El usuario podrá elegir el acabado:
madera, naranja o verde lima; así como el tipo de asa que pondrá a los muebles: larga o corta. El
usuario también podrá marcar una casilla (por ej. un checkbox, una lista desplegable o un radio-
button) en la que indicará si quiere comprar también los electrodomésticos. Según los datos
introducidos, el programa mostrará la imagen de la cocina (en la imagen siempre salen los
electrodomésticos aunque no se hayan pedido) y el precio bien desglosado. Los muebles de madera
cuestan 9000 euros, los muebles con acabado naranja o verde lima cuestan 8000 y los
electrodomésticos cuestan 4500 euros (recuerda que el usuario puede elegir si quiere o no quiere
electrodomésticos). Al precio de la cocina hay que sumarle el 21% de IVA.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Examen B - Ejercicio 3</title>
    <link href="estilos.css" rel="stylesheet" type="text/css" />
  </head>
  <body>
    <h1>Configurador de cocina</h1>
    <form method="get" action="cocina.jsp">
      Tapicería:
      <select name="acabado">
        <option value="madera" selected="selected">Madera</option>
        <option value="naranja">Naranja</option>
        <option value="verde">Verde Lima</option>
      </select>
      <br>
      <br>
      Tipo de tirador:
      <select name="asa">
        <option value="largo" selected="selected">Largo</option>
        <option value="corto">Corto</option>
      </select>
      <br>
      <br>
       <h3>Marque si desea electrodomésticos en la cocina?</h3>
       <input type="radio" name="elec" value="elec">si<br>
       <input type="radio" name="elec" value="elec">no<br>
       <input type="submit" value="Aceptar">
    </form>
  </body>
</html>
