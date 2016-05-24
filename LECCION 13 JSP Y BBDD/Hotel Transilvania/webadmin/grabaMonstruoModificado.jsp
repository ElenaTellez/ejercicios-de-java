<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
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
    <%
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root", "root");
      Statement s = conexion.createStatement();

      request.setCharacterEncoding("UTF-8");
      
      String actualizacion = "UPDATE Monstruo SET "
                           + "Nombre='" + request.getParameter("Nombre")
                           + "', Edad=" + Integer.valueOf(request.getParameter("Edad"))
                           + ", Tipo='" + request.getParameter("Tipo")
                           + "', Habitacion=" + Integer.valueOf(request.getParameter("Habitacion"))
                           + " WHERE MonstruoID=" + Integer.valueOf(request.getParameter("MonstruoID"));
      s.execute(actualizacion);
      out.println("Monstruo actualizado correctamente.");
      
      conexion.close();
      %> 
    <br> <br>  <br>
    <a href="accesoadmin.jsp"> Volver </a> 
   </div>
  </body>
</html>
