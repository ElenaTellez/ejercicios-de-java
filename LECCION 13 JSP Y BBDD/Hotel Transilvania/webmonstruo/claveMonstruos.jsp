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
    <%  
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root", "root");
      Statement s = conexion.createStatement();
      request.setCharacterEncoding("UTF-8");

      ResultSet listado = s.executeQuery ("SELECT * FROM acceso");
    %>
    
    <div class="container">
      
        <h1>Nuevo Usuario <a href=../index_1.jsp><img src=../img/volver.JPG width=40px></a></h1> 
        <form method="post" action="altaClave.jsp">
          <tr>
            <td>
                <label for="usuario">Usuario</label>
                <input type="text" name="usuario" id="usuario" required>    
              
            </td>
            <td>
               <label for="clave">Contraseña</label>
               <input type="password" name="clave" id="clave" required>   
              
            </td>
          </tr>
          <tr>
                       
            <td colspan="2">
              <p>
                <button type="submit" name="aceptar">Añadir usuario monstruoso</button>
              </p>
            </td>
          </tr>
          </form>
        </table>  
         
       
              
    <%
      conexion.close();
    %>
   
    </body>
</html>
