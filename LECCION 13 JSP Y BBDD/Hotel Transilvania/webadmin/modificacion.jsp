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
      <link href='https://fonts.googleapis.com/css?family=Lobster' rel='stylesheet' type='text/css'>
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
   <tr><th>Numero</th><th>Nombre</th><th>Edad</th><th>Tipo</th><th>Habitación</th><td> <a href="accesoadmin.jsp"> volver </a></td></tr>
       
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
        <form method="get" action="modificaMonstruo.jsp">
					<input type="hidden" name="MonstruoID" value="<%=listado.getString("MonstruoID") %>">
          <input type="hidden" name="Nombre" value="<%=listado.getString("Nombre") %>">
          <input type="hidden" name="Edad" value="<%=listado.getString("Edad") %>">
          <input type="hidden" name="Tipo" value="<%=listado.getString("Tipo") %>">
          <input type="hidden" name="Habitacion" value="<%=listado.getString("Habitacion") %>">
          <button type="submit">Modificar</button>
	</form>
        </td>
    </tr>
        <%
          } // while   

          conexion.close();
        %>

        </table>
      </div>
    </div>
    
   </body>
</html>