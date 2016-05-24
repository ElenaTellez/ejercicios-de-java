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
      
      // Comprueba si el usuario ya existe
      String consulta = "SELECT COUNT(*) FROM acceso WHERE usuario='"
                        + request.getParameter("usuario")
                        + "'";
      
      ResultSet coincidencias = s.executeQuery(consulta);
      coincidencias.next();
      
      if (coincidencias.getInt(1) != 0) {
        out.println("Lo siento, no se ha podido dar de alta, ya existe un monstruo con ese usuario");
         out.println("<br><br><a href=altaClave.jsp><img src=../img/volver.JPG width=40px></a>");
      } else {
        // Inserta los datos en la base de datos
        String insercion = "INSERT INTO acceso VALUES ('"
                            + request.getParameter("usuario")
                            + "', '" + request.getParameter("clave") + "')";
        out.println("<p>Usuario grabado correctamente.</p> ");
        out.println("<br><br><a href=altaMons.jsp>Alta Monstruosa</a>");
            
        s.execute(insercion);         
        conexion.close();
      }
    %>    
   </div>
  </body>
</html>
