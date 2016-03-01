
package ejercicios.examen;

/**
 * Realiza un programa que, a partir de un array de 4 filas por 6 columnas con números generados al
 * azar entre 10 y 99, muestre a la derecha los máximos de la fila y debajo los mínimos de las columnas.
 * Ejemplo :
 * 
 * @author Elena Téllez 30
 */
public class Ex30mets1 {
  public static void main(String[] args) 
    throws InterruptedException { // Se añade esta línea para poder usar sleep
 
    int[][] num = new int[4][6]; // array de 4 filas por 6 columnas

    int fila;
    int columna;
    
    int minimo;
    int filaMinimo = 0;
    int columnaMinimo = 0;
    
    int maximo;
    int filaMaximo = 0;
    int columnaMaximo = 0;

    
    
    // Introduce valores aleatorios en el array
    for(fila = 0; fila < 4; fila++) {
      for(columna = 0; columna < 6; columna++) {
        num[fila][columna] = (int)(Math.random() * 89) + 10;
      }
    }

   
   for(fila = 0; fila < 4; fila++) {  
      maximo = 10;
      for(columna = 0; columna < 6; columna++) {
        
        System.out.printf("%7d   ", num[fila][columna]);
        
        if (num[fila][columna] > maximo){  
        maximo = num[fila][columna];
        filaMaximo = fila;
        columnaMaximo = columna;
        }
        
      }  
      System.out.printf("|%7d\n", maximo);
      
    }
    
    for(columna = 0; columna < 6; columna++) {
      System.out.print("----------");
    }
    System.out.println("-----------");

     
    for(columna = 0; columna < 6; columna++){
        
        minimo = 99;
        
        for(fila = 0; fila < 4; fila++){
            if (num[fila][columna] < minimo) {
                minimo = num[fila][columna];
                filaMinimo = fila;
                columnaMinimo = columna;   
            }
        }

     System.out.printf("%7d   ", minimo);
    }
       
 
    }
    
}
