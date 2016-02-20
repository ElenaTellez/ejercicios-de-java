
package matematicas;

/**
 * 
 * Ejercicio 29-34
 * Crea una biblioteca de funciones para arrays bidimensionales (de dos dimen-
 * siones) de números enteros que contenga las siguientes funciones:
 *
 * @author Elena Tellez
 * 
 */
public class funcionesBi {
  
/**
* Muestra por pantalla todos los elementos de un array de números enteros
* separados por un espacio.
* 
* @param x array bidimiensional de números enteros
*/
  
  public static void muestraArrayBi(int a[][], int filas, int columnas) {
    
 
    for (int x = 0; x < filas; x++) {
      for (int y = 0; y < columnas; y++) {
        System.out.print(a[x][y] + " ");
   
      } 
      System.out.println();
    }  
  }
/**
* 1. generaArrayBiInt: Genera un array de tamaño n x m con números
* aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro. 
* 
* @param x array bidimiensional de números enteros
* @return array bidimensional con parametros elegidos y numeros aleatorios
*/
  
  public static int[][] generaArrayBi(int filas, int columnas, int min, int max) {
    
    int arrayBi[][] = new int[filas][columnas];
 
    for (int c = 0; c < filas; c++) {
      for (int d = 0; d < columnas; d++) {        
        arrayBi[c][d] = (int)(Math.random()*(max - min) + min + 1);        
      } 
    }  

    return arrayBi;  
  }
  /**
* 2. filaDeArrayBiInt: Devuelve la fila i-ésima del array que se pasa como
* parámetro.
* 
* @param x array bidimiensional de números enteros
* @return Devuelve la fila i-ésima del array que se pasa como
* parámetro.
*/
  
  public static int[] filaArrayBi(int a[][], int fila) {
    
    int filaElegida[] = new int [a[0].length];

    //a[0].length asi tengo el maximo generico de la columna
    
        
      for (int d = 0; d < a[0].length; d++) {        
         filaElegida[d] = a[fila][d];        
      } 
      

    return filaElegida;  
  }
    /**
* 3. columnaDeArrayBiInt: Devuelve la columna i-ésima del array que se pasa como
* parámetro.
* 
* @param x array bidimiensional de números enteros
* @return Devuelve la columna i-ésima del array que se pasa como
* parámetro.
*/
  
  public static int[] columnaArrayBi(int a[][], int columna) {
    
    int columnaElegida[] = new int [a.length];

    //a[0].length asi tengo el maximo generico de la columna
    
        
      for (int d = 0; d < a.length; d++) {   
        columnaElegida[d] = a[d][columna];          
      } 
      

    return columnaElegida;  
  }
}  
  