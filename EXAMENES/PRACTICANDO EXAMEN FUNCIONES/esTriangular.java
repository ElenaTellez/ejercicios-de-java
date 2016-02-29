import java.util.Scanner;

/**
 * Comprueba si un array bidimensional es triangular inferior oo superior
 * Se dice que una matriz cuadrada – tiene el mismo número de filas que de columnas - 
 * es triangular inferior o superior cuando todos los valores que están por debajo o por encima de la 
 * diagonal principal son cero. 
 * Por ejemplo, la siguiente matriz es triangular superior:
 * 6 8 5 1
 * 0 7 5 4 
 * 0 0 8 1
 * 0 0 0 2
 * Ejemplo de matriz triangular inferior:
 * 3 0 0 0 
 * 7 5 0 0 
 * 9 6 8 0 
 * 2 8 4 6 
 * Realiza una función que diga si una matriz dada es o no triangular inferior o superior y
 * pruébala en un  programa. Recuerda que si la matriz no es cuadrada, 
 * se puede concluir directamente que no es  triangular inferior o superior,
 * sin hacer ningún otro tipo de comprobación. La cabecera de la función es la siguiente:
 * public static boolean esTriangularInferior(int[ ][ ] a)
 * public static boolean esTriangularSuperior(int[ ][ ] a)
 *  
 * @author Elena Tellez
 */
 
public class esTriangular {
  
   
  public static void main(String[] args) {
    
  
  Scanner sc = new Scanner(System.in);  
    
  System.out.print("Introduzca el numero de filas del array: ");		
	
	int filas = sc.nextInt();
		
	System.out.print("Introduzca el numero de columnas del array: ");		
		 	
	int columnas = sc.nextInt();
  
  if (filas == columnas){
  
  System.out.print("Introduzca el numero minimo del intervalo del array: ");		
		 	
	int min = sc.nextInt();
		
	System.out.print("Introduzca el numero máximo del intervalo del array: ");		
	 	
	int max = sc.nextInt();	
  
  int arrayBi [][] = generaArrayBi(filas,columnas, min, max);
  
  muestraArrayBi(arrayBi, filas, columnas);
  
  System.out.println("¿Es triangular Inferior? " + esTriangularInferior(arrayBi));
  System.out.println("¿Es triangular Superior? " + esTriangularSuperior(arrayBi));
  
  
  } else {
    
    System.out.println("El numero de filas y columnas debe ser igual");
  }
  
  System.out.println("EJEMPLO DE ARRAY TRIANGULAR INFERIOR:");
  
  int b [][]= {{3,0,0,0},{7,5,0,0},{9,6,8,0},{2,8,4,6}};  
  
  muestraArray(b);
  
  System.out.println("¿Es triangular Inferior? " + esTriangularInferior(b));
  System.out.println("¿Es triangular Superior? " + esTriangularSuperior(b));

  System.out.println("EJEMPLO DE ARRAY TRIANGULAR SUPERIOR:");
  
  int a [][]= {{2,8,4,6},{0,6,8,9},{0,0,7,5}, {0,0,0,3}};  
  
  muestraArray(a);
  
  
  System.out.println("¿Es triangular Inferior? " + esTriangularInferior(a));
  System.out.println("¿Es triangular Superior? " + esTriangularSuperior(a));

  
  }
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
        arrayBi[c][d] = (int)(Math.random()*((max - min) + 1)+ min);        
      } 
    }  

    return arrayBi;  
  }
/**
* comprueba si el array bidimiensional que pasa por parametro es triangular inferior
* 
* @param x array bidimiensional de números enteros
* @return verdadero o false si es o no triangular inferior
*/
  
  public static boolean esTriangularInferior(int[][]a) {
    
    boolean esTriangular = true;
    
        for(int i=0; i<a.length; i++){
            for(int j=0; j<i; j++){
                if(a[j][i] != 0){
                    esTriangular = false;
                    break;
                }                 
                
            }          
        }       
          
        return esTriangular;
    
  }
/**
* comprueba si el array bidimiensional que pasa por parametro es triangular inferior
* 
* @param x array bidimiensional de números enteros
* @return verdadero o false si es o no triangular inferior
*/
  
  public static boolean esTriangularSuperior(int[][]a) {
    
    boolean esTriangular = true;
    
        for(int i=0; i<a.length; i++){
            for(int j=0; j<i; j++){
                if(a[i][j] != 0){
                    esTriangular = false;
                    break;
                }                 
                
            }          
        }       
        return esTriangular;
  }   
}

