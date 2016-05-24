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
      
      String consultaNumMonstruo = "SELECT * FROM Monstruo WHERE MonstruoID="
                                + Integer.valueOf(request.getParameter("MonstruoID"));      
      ResultSet numeroDeMonstruo = s.executeQuery (consultaNumMonstruo);
      numeroDeMonstruo.last();
      
      if (numeroDeMonstruo.getRow() != 0) {
        out.println("Lo siento, no se ha podido dar de alta, ya existe un monstruo con el número "
                    + request.getParameter("MonstruoID") + ".");
      } else {
        String insercion = "INSERT INTO Monstruo VALUES ("+ Integer.valueOf(request.getParameter("MonstruoID"))
                           +",'" + request.getParameter("Nombre")
                           +"'," + Integer.valueOf(request.getParameter("Edad"))
                           +",'" + request.getParameter("Tipo")
                           +"'," + Integer.valueOf(request.getParameter("Habitacion"))+")";
        s.execute(insercion);
        out.println("Monstruo dado de alta correctamente.");
      }
      conexion.close();
      %>
    <br>
    <a href="accesoadmin.jsp"> Página principal</a>
   
    </div>
  </body>
</html>
