<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" type="text/css" href="../css/estilos.css" />
  </head>
  <body>
    <% request.setCharacterEncoding("UTF-8"); %>
    <div>
        <br><br>    
        <h1>Modificación de Monstruo</h1>
        <br><br>
        <table>
            <form method="get" action="grabaMonstruoModificado.jsp"> 
            <tr> 
                <td><label>Nº de Monstruo:</td>
                <td><input type="text" size="25" name="MonstruoID" value="<%= request.getParameter("MonstruoID") %>" readonly></td>
            </tr> 
          
            <tr>
                <td><label>Nombre:</label></td>
                <td><input type="text" size="25" name="Nombre" value="<%= request.getParameter("Nombre") %>"></td>        
            </tr> 
            
            <tr> 
                <td><label>Edad:</label></td>  
                <td><input type="text" size="5" name="Edad" value="<%= request.getParameter("Edad") %>"></td>    
            </tr> 
            
            <tr>  
                <td><label>Tipo:</label></td> 
                <td><input type="text" size="25" name="Tipo" value="<%= request.getParameter("Tipo") %>"></td>
            </tr> 
            
            <tr>  
                <td><label>Habitacion:</label></td>
                <td><input type="text" name="Habitacion" size="5" value="<%= request.getParameter("Habitacion") %>"></td>
                
            </tr> 
            
            <tr>  
                <td colspan = "2"><button type="submit">Aceptar</button></td>
            </tr>
            </form>
            <tr> 
                <td colspan ="2"><form method="post" action="accesoadmin.jsp"> <button type="submit">Cancelar</button></form></td>
            </tr>  
            </table>
      </div>
    </div>
    </body>
</html>
