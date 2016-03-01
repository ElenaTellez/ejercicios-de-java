
/**
 *
 * @author Elena Tellez
 */
public class Ex30mets4 { public static void main(String[] args) {
  
  int arrayBi[][] = generaArrayBi(4,4,0,3);
  //genero ArrayBi dando filas columnas minimo y maximo de valores aleatorios
  
  muestraArray(arrayBi);
  
   System.out.println();
    System.out.println();
  
  muestraArrayInt(desenrolla(arrayBi));
    
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
   * Muestra por pantalla todos los elementos de un array de números enteros
   * separados por un espacio.
   * 
   * @param x array unidimiensional de números enteros
   */
  public static void muestraArrayInt(int x[]) {
    for (int n : x) {
      System.out.print(n + " ");
    }
    System.out.println();
  }
/**
* 
* 
* @param array bidimiensional de números enteros
* @return array unidimensional con numeros desenrollados
*/
  
  public static int[] desenrolla(int[][] n) {
     
    int arrayUni[] = new int [16];
    int valores = 0;
      
        
    for(int j=0; j< 4; j++){
        arrayUni[valores++] = n [0][j];
      }  
    for(int j=1; j< 4; j++){
        arrayUni[valores++] = n [j][3];
      } 
    for(int j=2; j>=0; j--){
        arrayUni[valores++] = n [3][j];
      } 
    for(int j=2; j>0; j--){
        arrayUni[valores++] = n [j][0];
      } 
    
   for(int j=1; j< 3; j++){
        arrayUni[valores++] = n [1][j];
      } 
   for(int j=2; j>0; j--){
        arrayUni[valores++] = n [2][j];
      } 
       
        
         return arrayUni;    
  }
}
