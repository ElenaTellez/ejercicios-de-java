<%-- 
    Document   : probandojuego
    Created on : 04-feb-2016, 17:05:49
    Author     : Elena Téllez
--%>

<%@page import="java.util.Arrays"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Busca el Tesoro</h1>
        <%
            int[][] cuadrante = new int[5][5];
            int[]variable = new int[25];
             
             
            int x;
            int y = 0;
            int filaTesoro = 0;
            int columnaTesoro = 0;
            int filaMina = 0;
            int columnaMina = 0;
            String guardodatos = " ";
            int j = 0;
          
            
                
                
                
                
                for(x = 0; x < 5; x++) { // inicializa el array y lo muestro                    
                    for(y = 0; y < 5; y++){                          
                        cuadrante[x][y] = 0;
                        out.print (cuadrante[x][y] + " ");                       
                    }                     
                    out.print ("<br>");
                }
                
                out.print ("<br>");
              
                filaTesoro = (int)(Math.random()*5);
                columnaTesoro = (int)(Math.random()*5);          
                cuadrante [filaTesoro][columnaTesoro] = 1;         
                
                
                do {
                    filaMina = (int)(Math.random()*5);
                    columnaMina = (int)(Math.random()*5);
                    } while ((filaTesoro ==  filaMina) && (columnaTesoro == columnaMina));
                
                cuadrante[filaMina][columnaMina] = 2;
                    
                    
                
                out.print ("<br>");    
                int filaIntento = 3;
                int columnaIntento = 3;
                
                cuadrante[filaIntento][columnaIntento] = 3;
                
                
                for(x = 0; x < 5; x++) {        // comparo coordenadas introducidas con array          
                        for(y = 0; y < 5; y++){ 
                         
                        variable[j]  = cuadrante[x][y];    //guarda datos de array bidimensional 
                        
                        if ((cuadrante[x][y] != cuadrante[filaTesoro][columnaTesoro]) && (cuadrante[x][y] != cuadrante[filaMina][columnaMina]) && (cuadrante[x][y] != cuadrante[filaIntento][columnaIntento])){
                        out.print (cuadrante[x][y] + " "); 
                        } else if (cuadrante[x][y] == cuadrante[filaTesoro][columnaTesoro]) {
                            out.print (cuadrante[filaTesoro][columnaTesoro] + " ");
                        } else if (cuadrante[x][y] == cuadrante[filaMina][columnaMina]){
                            out.print (cuadrante[filaMina][columnaMina] + " ");
                        } else if (cuadrante[x][y] == cuadrante[filaIntento][columnaIntento]){
                            out.print (cuadrante[filaIntento][columnaIntento] + " ");
                        }
                        
                        j++;
                        
                    }                     
                    out.print ("<br>");
                    
                }  
                
                out.print ("<br>");
                
                for(x = 0; x < 25; x++) {
               
                out.print (variable[x] + " ");
                
                }
                
                out.print ("<br>");
                
                guardodatos = Arrays.toString(variable);
                out.print (guardodatos + " "); // Ahora tengo una variable tipo String con los datos
                
                out.print ("<br>");
                
                int filaIntentoDos = 4;
                int columnaIntentoDos = 4;
                cuadrante[filaIntentoDos][columnaIntentoDos] = 3;
                
                
                
                
                    
                char[]variableDos = guardodatos.toCharArray(); // Array para comparar con segundo intento
                for(x = 0; x < variableDos.length; x++) {
                out.print (variableDos[x] + " ");
                
                } 
                
                
                
        %>        
    </body>
</html>
