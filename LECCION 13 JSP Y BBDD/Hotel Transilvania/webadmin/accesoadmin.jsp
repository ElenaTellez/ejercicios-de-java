<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" type="text/css" href="../css/estilos.css" />
  </head>
  
  <body>
      <div class="container">
    <h1>Gestión de Administración</h1> 
        <div  class="menu"> 
            <ul>  
               <li><br> <a href="alta.jsp">Alta Monstruo</a></li> 
               <li><br><a href="claveMonstruos.jsp">Claves Monstruo</a></li> 
               <li><br> <a href="baja.jsp">Baja Monstruo</a></li> 
               <li><br> <a href="modificacion.jsp">Modificación Monstruo</a> </li> 
               <li><br> <a href="consulta.jsp">Consultar Listado de Monstruos</a></li>
               <li><br> <a href="../index_1.jsp">Salir</a></li>
            </ul>
        </div> 
      </div>       
  </body>
</html>
