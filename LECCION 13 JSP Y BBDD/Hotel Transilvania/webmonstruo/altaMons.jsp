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
		 
			<br><br>			
      <div>
        <div><h1>Hotel Transilvania: Conferencia Monstruosa</h1></div>
        
        <%
          Class.forName("com.mysql.jdbc.Driver");
          Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root", "root");
          Statement s = conexion.createStatement();

          ResultSet listado = s.executeQuery ("SELECT * FROM Monstruo");
        %>

        <table>
        <tr><th>Numero</th><th>Nombre</th><th>Edad</th><th>Tipo</th><th>Habitación</th><td> <a href="../index_1.jsp"> Volver </a></td></tr>
        <form method="get" action="grabaMons.jsp">
          <tr><td><input type="text" name="MonstruoID" size="5"></td>
              <td><input type="text" name="Nombre" size="30"></td>
              <td><input type="text" name="Edad" size="5"></td>
              <td><input type="text" name="Tipo" size="20"></td>
              <td><input type="text" name="Habitacion" size="5"></td>
              <td><button type="submit" value="Añadir">Añadir</button></td></tr>           
        </form>      
        </table>
      </div>
   
    </body>
</html>
