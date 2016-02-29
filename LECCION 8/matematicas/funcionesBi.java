


/**
 * package matematicas;
 * Ejercicio 29-34
 * Crea una biblioteca de funciones para arrays bidimensionales (de dos dimen-
 * siones) de números enteros que contenga las siguientes funciones:
 *
 * @author Elena Tellez
 * 
 */
 
 package funcionesUni;
 
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



/**
* 4. coordenadasEnArrayBiInt: Devuelve la fila y la columna (en un array
* con dos elementos) de la primera ocurrencia de un número dentro de un
* array bidimensional. Si el número no se encuentra en el array, la función
* devuelve el array {-1, -1}.
* 
* @param x un numero entero
* @return Devuelve coordenadas de la primera ocurrencia del mismo o array {-1,-1}
*/
  
  public static int[] estaEnArrayBi(int a[][], int ocurrencia) {     
       
    for (int x = 0; x < a.length; x++){    
      for (int y = 0; y < a[0].length; y++){
        if (a[x][y] == ocurrencia){
          int[] coordenadas = {x, y};
          return (coordenadas);          
        }
      }   
    }  
    int[] coordenadas = {-1, -1};      
    return coordenadas;
  }
/**
* 5. esPuntoDeSilla: Dice si un número es o no punto de silla, es decir,
* mínimo en su fila y máximo en su columna.
* 
* @param numero de fila
* @param numero de columna
* @return Devuelve verdadero si el valor de esa coordenada es minimo en su fila 
*         y maximo en su columna
*/
  
  public static boolean esPuntoSilla(int a[][], int i, int j) {  
    
    int[] fila = filaArrayBi(a, i);
    int[] columna = columnaArrayBi(a, j);
    
    return ((funcionesUni.minimoArray(fila) == a[i][j]) 
		&& (funcionesUni.maximoArray(columna) == a[i][j]));
  
  }
  
/**
* 6. diagonal: Devuelve un array que contiene una de las diagonales del
* array bidimensional que se pasa como parámetro. Se pasan como
* parámetros fila, columna y dirección. La fila y la columna determinan
* el número que marcará las dos posibles diagonales dentro del array. La
* dirección es una cadena de caracteres que puede ser “nose” o “neso”. La
* cadena “nose” indica que se elige la diagonal que va del noroeste hacia
* el sureste, mientras que la cadena “ne
* 
* @param x un numero entero
* @param y un numero entero
* @param z direccion de la diagonal elegida
* @return Devuelve la direccion de la diagonal de la coordenada elegida
*/
  
  public static int[] diagonal(int a[][], int fila, int columna, String direccion) {  
    
    int elementos = 0, i, j;
    int[] diagonalAux = new int [1000];
    
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a[0].length; j++) {
        if ( (((columna - j) == (fila - i)) && (direccion.equals("nose")))
          || (((columna - j) == (i - fila)) && (direccion.equals("neso"))) ) {
          diagonalAux[elementos++] = a[i][j];
        }
      }
    }
            
    int[] diagonal = new int[elementos];
    for (j = 0; j < elementos; j++) {
      diagonal[j] = diagonalAux[j];
    }
      
    return diagonal;
  } 
}  
  
