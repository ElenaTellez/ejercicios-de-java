<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" type="text/css" href="css/estilos.css" />
  </head>
  
  <body>
  <%
    Class.forName("com.mysql.jdbc.Driver");
    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/seguridad","root", "root");
    Statement s = conexion.createStatement();

    request.setCharacterEncoding("UTF-8");

    String consulta = "SELECT COUNT(*) FROM acceso WHERE usuario='"
                      + request.getParameter("usuario")
                      + "' AND clave='"
                      + request.getParameter("clave")
                      + "'";

    ResultSet coincidencias = s.executeQuery(consulta);
    coincidencias.next();
    
    String icono;
    String mensaje;
    String enlace;
    
    if (coincidencias.getInt(1) == 0) {
      
      mensaje = "<p>Usuario no registrado. Por favor, regístrese o introduzca los datos"
              + " correctamente. </p>";
      enlace = "index_1.jsp";
    } else if (request.getParameter("usuario").equals("admin")) {
       
      mensaje = "<p>Tiene acceso al área de gestión de Administración.</p>";                     
      enlace = "webadmin/accesoadmin.jsp";
    } else {
      
      mensaje = "<p>Bienvenido nuevamente </p>"+request.getParameter("usuario") 
              + "<p>Pulse en aceptar para continuar.</p>";  
      enlace = "webmonstruo/accesoMons.jsp";
    };
    %>
    <div class="container">       
        <table>
            <tr id="libre"><h2>Control de acceso</h2></tr>     
            <tr id="libre"><%=mensaje %></tr>
            <tr><a href="<%=enlace %>"class="boton">Aceptar</a></tr> 
        </table>  
    </div>
  </body>
</html>
