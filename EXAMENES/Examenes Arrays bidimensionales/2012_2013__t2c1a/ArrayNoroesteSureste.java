/**
 * @author Luis José Sánchez
 *
 * Ejemplo de uso de arrays bidimensionales
 */

public class ArrayNoroesteSureste {
  public static void main(String[] args) 
    throws InterruptedException { // Se añade esta línea para poder usar sleep
       
	  
		int fila;
    int columna;   
    int n = 1;  
    int y = 1;
    int nume = 3;
    int j = 2;
    int numeDos = 6;
    int k = 3;
    int numeTres = 10;
    int l = 4;
    
 
      
       int[][] num = new int[3][5]; // array de 4 filas por 4columnas
    
  
    
    // Lee los datos de teclado
   
     for(fila = 0; fila < 1; fila++) {
      
				for(columna = 0; columna < 4; columna++) {
        
        num[fila][columna] = (n);
        n = n + y++;
          System.out.printf("%5d ", num[fila][columna]);
          
				}
				System.out.printf("%5d ", numeTres);
				System.out.println();
			}
			
			for(fila = 1; fila < 2; fila++) {
      
				for(columna = 0; columna < 3; columna++) {
        
        num[fila][columna] = (nume);
        nume  = nume + j++;
          System.out.printf("%5d ", num[fila][columna]);
          
				}
				System.out.printf("%5d ", n);
				System.out.println();
			}
			for(fila = 1; fila < 2; fila++) {
      
				for(columna = 0; columna < 2; columna++) {
        
        num[fila][columna] = (numeDos);
        numeDos  = numeDos + k++;
          System.out.printf("%5d ", num[fila][columna]);
				}
				System.out.printf("%5d ", nume, numeDos);	
				System.out.printf("%5d ", numeDos);				   
				System.out.println();
			}
			for(fila = 1; fila < 2; fila++) {
      
				for(columna = 0; columna < 3; columna++) {
        
         num[fila][columna] = (numeTres);
					numeTres  = numeTres + l++;
          System.out.printf("%5d ", num[fila][columna], (numeDos  = numeDos + k++), (numeDos  = numeDos + k++));
				}
     
				System.out.println();
			}
    }
}
