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
		<div>
			<br><br>			
      <div>
        
        <%
          Class.forName("com.mysql.jdbc.Driver");
          Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root", "root");
          Statement s = conexion.createStatement();

          ResultSet listado = s.executeQuery ("SELECT * FROM Monstruo");
        %>

        <table>
        <tr><th>Numero</th><th>Nombre</th><th>Edad</th><th>Tipo</th><th>Habitación</th><td> <a href="accesoadmin.jsp"> Volver </a></td></tr>
       
        <%
          while (listado.next()) {
            out.println("<tr><td>");
            out.println(listado.getString("MonstruoID") + "</td>");
            out.println("<td>" + listado.getString("Nombre") + "</td>");
            out.println("<td>" + listado.getString("Edad") + "</td>");
            out.println("<td>" + listado.getString("Tipo") + "</td>");
            out.println("<td>" + listado.getString("Habitacion") + "</td>");
        %>
         
				<td>
        <form method="get" action="confirmacion.jsp">
          <input type="hidden" name="MonstruoID" value="<%=listado.getString("MonstruoID") %>"/>
          <button type="submit"> Eliminar</button>
        </form>
        </td></tr>
        <%
          } // while   

          conexion.close();
        %>

        </table>
      </div>
    </div>
    
   </body>
</html>
