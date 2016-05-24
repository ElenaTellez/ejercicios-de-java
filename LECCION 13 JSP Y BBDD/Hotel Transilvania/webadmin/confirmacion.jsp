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
          <p>Confirmar borrado</p>  
       
            <table>
            <tr>
               <td id="libre" ><a class="boton" href="borraMonstruo.jsp?MonstruoID=<%=request.getParameter("MonstruoID")%>">SI</a></td>	
               <td id="libre" ><a class="boton" href="accesoadmin.jsp">NO</a></td>
            </tr> 
            </table>    
       
      </div>    
  </body>
</html>    
