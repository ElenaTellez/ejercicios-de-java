
/**
 * Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con
 * números aleatorios entre 200 y 300. A continuación, el programa debe mostrar los números de la
 * diagonal que va desde la esquina superior izquierda a la esquina inferior derecha, así como el
 * máximo, el mínimo y la media de los números que hay en esa diagonal.
 *
 * @author Elena Téllez
 */
 
import java.util.Scanner;

public class DiagonalArrayIzqDcha {
	
		public static void main(String[] args) {
		
            try (Scanner sc = new Scanner(System.in)) {
                
                              
                
                int x;
                int y;
                int num = (int)((Math.random()*300) + 200);
                
                
                
                int[][] cuadrante = new int[10][10]; 
                
                // inicializa el array
                
                for(x = 0; x <= 9; x++) { 
                    
                    for(y = 0; y <= 9; y++){  
                        
                        cuadrante[x][y] = num;
                        System.out.print(cuadrante[x][y]+ " ");
                        
                    }
                    
               }
                
                for(y = 9; y >= 0; y--){
                    
                    for (x = 0; x <= 9 ; x++){
                        System.out.print(cuadrante[x][y]+ " ");
                        
                    }
                    
                    System.out.println();
                    
                }
                
                
               
     
	}

}
