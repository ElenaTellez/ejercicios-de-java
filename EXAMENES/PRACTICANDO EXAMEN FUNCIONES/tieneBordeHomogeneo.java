
/**
 * Se dice que una matriz (un array bidimensional) tiene el borde homogéneo cuando todos los dígitos
 * que se encuentran en el borde son iguales.
 * Realiza una función que diga si una matriz dada tiene o no el borde homogéneo y pruébala en un
 * programa. Los valores de los arrays de prueba deben estar asignados en el programa, no se piden por
 * teclado. La cabecera de la función es la siguiente:
 * public static boolean tieneBordeHomogeneo(int[ ][ ] a)
 * @author Elena Tellez
 */
public class tieneBordeHomogeneo {

  public static void main(String[] args) {
	  
  int arrayBi[][] = generaArrayBi(4,4,0,3);
  //genero ArrayBi dando filas columnas minimo y maximo de valores aleatorios 
  
  muestraArray(arrayBi);
  
  
  System.out.println("¿Tiene borde homogeneo? " + tieneBordeHomogeneo(arrayBi));
  System.out.println();   
  System.out.println("EJEMPLO DE ARRAY CON BORDE HOMOGENEO:");
  
  int b [][]= {{3,3,3,3},{3,5,0,3},{3,6,8,3},{3,3,3,3}};  
  
  muestraArray(b);
  
  System.out.println("¿Tiene borde homogeneo? " + tieneBordeHomogeneo(b));
  
  System.out.println("EJEMPLO DE ARRAY CON SOLO DOS LADOS HOMOGENEOS:");
  
  int c [][]= {{3,3,3,3},{1,5,0,1},{0,6,8,0},{3,3,3,3}};  
  
  muestraArray(c);
  
  System.out.println("¿Tiene borde homogeneo? " + tieneBordeHomogeneo(c));
  
  // este ejemplo es para verificar que la funcion tambien recorre los lados
  
  
  }
  /**
* Muestra por pantalla todos los elementos de un array de números enteros
* separados por un espacio.
* 
* @param x array bidimiensional de números enteros
*/
  
  public static void muestraArray(int a[][]) {
    
 
    for (int x = 0; x < a.length; x++) {
      for (int y = 0; y < a[0].length; y++) {
        System.out.print(a[x][y] + " ");
   
      } 
      System.out.println();
    }  
  }

/**
* generaArrayBiInt: Genera un array de tamaño n x m con números
* aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro. 
* 
* @param x array bidimiensional de números enteros
* @return array bidimensional con parametros elegidos y numeros aleatorios
*/
  
  public static int[][] generaArrayBi(int filas, int columnas, int min, int max) {
    
    int arrayBi[][] = new int[filas][columnas];
 
    for (int c = 0; c < filas; c++) {
      for (int d = 0; d < columnas; d++) {        
        arrayBi[c][d] = (int)(Math.random()*((max - min)+1) + min);        
      } 
    }  

    return arrayBi;  
  }
/**
* comprueba si el array bidimiensional que pasa por parametro tiene el borde
* homogeneo
* 
* @param x array bidimiensional de números enteros
* @return verdadero o false si el borde es o no homogeneo
*/
  
  public static boolean tieneBordeHomogeneo(int[][]a) {
     
    boolean esHomogeneo = true;
    int valor = a[0][0];
    int columna = a[0].length-1;
    int fila = a.length-1;
      
        
    for(int j=0; j< a[0].length; j++){
      if((a[0][j] != valor)||(a[fila][j]!= valor))  {
        esHomogeneo = false;
        break;
      }//compruebo que todos los valores son iguales en fila superior e inferior
    }
    
    for(int j=0; j<a.length; j++){
      if((a[j][0] != valor)||(a[j][columna] != valor)){
        esHomogeneo = false;
        break;
      } //compruebo que todos los valores son iguales en lado izquierdo y derecho                         
    }
    return esHomogeneo;    
  }
}
