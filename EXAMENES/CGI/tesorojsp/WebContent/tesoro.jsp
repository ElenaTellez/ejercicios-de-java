<%-- 
    Document   : probandojuego
    Created on : 04-feb-2016, 17:05:49
    Author     : Elena Téllez
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="tesoro.css" rel="stylesheet" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
    	
    	<div>
        <h1>¿Seras capaz de encontrar el tesoro sin que te muerda el perro?</h1> 
         <form action="tesoro.jsp">
    	
        
    	 
        <%
            int[][] cuadrante = new int[5][5];
            String[]variable = new String[25];  
            int tesorox=0;//variables para recoger coordenadas de minas y tesoros
			int tesoroy=0;
			int minax=0;
			int minay=0;
            String guardar = "hola";            
            int contador=0;//para que vaya aumentado el valor del char
            int coordenadax=0;//pasar el valor recogido a entero
			int coordenaday=0;//pasar el valor recogido a entero
			String encontrado = "";
			
			
	      	if((request.getParameter("x")!=null) && (request.getParameter("y")!=null)){
	      	
				String x=request.getParameter("x");//valor recogido por teclado
				String y=request.getParameter("y");//valor recogido por teclado
				 coordenadax=Integer.valueOf(x);//pasar el valor recogido a entero
				 coordenaday=Integer.valueOf(y);//pasar el valor recogido a entero
				 guardar=request.getParameter("guardar");				
				
				// char[] cambio = guardodatos.toCharArray();//el string lo convierte en array de char   
				
				for(int i=0;i<25;i++){//rellena el array con los datos de la variable
			
						cuadrante[contador/5][contador%5]=Integer.parseInt(String.valueOf(guardar.charAt(contador))); 	
					
						contador++;
          
				}
                
				if(cuadrante[coordenadax][coordenaday] == 0){
					cuadrante[coordenadax][coordenaday] = 3;	
				}else if(cuadrante[coordenadax][coordenaday] == 1){
					encontrado = "mina";
				}else if(cuadrante[coordenadax][coordenaday] == 2){
					encontrado = "tesoro";
				}
					
				
				if(encontrado.equals("mina")){
					out.print("<h1>Has perdido</h1>");
				}else if(encontrado.equals("tesoro")){
					out.print("<h1>Has ganado</h1>");
				}
				
				}else{
				
					minax=(int)(Math.random()*5);//valores aleatorios de la mina y el tesoro
					minay=(int)(Math.random()*5);
				
					do{
						tesorox=(int)(Math.random()*5);
						tesoroy=(int)(Math.random()*5);
					}while ((tesorox == minax) && (tesoroy == minay) && (contador==0));
				
				
				for(int i=0;i<5;i++){//rellena el array de ceros,introduce el tesoro y la mina
					for(int j=0;j<5;j++){
						if ((i==minax) && (j==minay)){
							cuadrante[i][j]=1;
						}else if((i==tesorox) && (j==tesoroy)){
							cuadrante[i][j]=2;
						}else{
							cuadrante[i][j]=0; 
						}
						
					}
				}
			
			}
                
                
	      	out.println("<table>");
			for(int i = 0; i < 5; i++){
				out.println("<tr>");
				for(int j = 0; j < 5; j++){
					if(encontrado.equals("")){
						if(cuadrante[i][j]==0||cuadrante[i][j]==1||cuadrante[i][j]==2){
						out.print("<td><img src=\"img/blanco.jpg\"style=\"width:30px;height:30px\"></td>");
						}else if(cuadrante[i][j]==3){
								out.print("<td><img src=\"img/martillo.jpg\"style=\"width:30px;height:30px\"></td>");
						}
					}else{
						if ((cuadrante[i][j] == 1) || (cuadrante[i][j] == 2)){
							out.print("<td><img src=\"img/" + cuadrante[i][j] + ".jpg\"style=\"width:30px;height:30px\"></td>");
						}else{
							if(cuadrante[i][j]==0){
								out.print("<td><img src=\"img/blanco.jpg\"style=\"width:30px;height:30px\"></td>");
							}else if(cuadrante[i][j]==3){
								out.print("<td><img src=\"img/martillo.jpg\"style=\"width:30px;height:30px\"></td>");
							}
						}
					}
					
				}
				out.println("</tr>");
			}
			out.println("</table>");
			
		
					guardar=" ";
					for(int i=0;i<5;i++){//guarda el array en la variable 
						for(int j=0;j<5;j++){
						
							guardar = guardar + cuadrante[i][j];
						
						}
			 
					}
                
                
     
                
        %>
         <h2>Introduce la coordenada X</h2>
            <input name="x"type="text"size="1" id="x">
         <h2>Introduce la coordenada Y</h2>
            <input name="y"type="text"size="1" id="y"><br>
            <input name="guardar"type="hidden"size="25"value="<%= guardar %>">
            <input name="boton" type="submit" value="Enviar" class="centro">
        </form>
        </div>      
    </body>
</html>
