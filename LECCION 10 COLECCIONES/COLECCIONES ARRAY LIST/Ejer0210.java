/**
 * Ejercicio 2
 *  
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 * 
 * @author Elena Tellez
 */

import java.util.ArrayList;

public class Ejer0210{
  public static void main(String[] args) {
	  
	int tam = (int)(Math.random()*(10) + 10);
	int suma = 0;
	int minimo = Integer.MAX_VALUE;
	int maximo = Integer.MIN_VALUE;
	

    ArrayList<Integer> a = new ArrayList<Integer>(tam);

		
		 for(int i = 0; i < tam; i++) {
		      a.add((int)(Math.random()*(100)));
		    }
		    
		 System.out.println("el tamaño del array list es:" + tam);
		 
		 System.out.println();
		 System.out.println("el contenido del array list es: ");   
		    
		 for(int numero : a) {
			System.out.print(numero  + "|");
			}
			
		 for(int i = 0; i < tam; i++) {
			suma += a.get(i);
			}
		
		System.out.println();			
		System.out.println("la suma de los elementos del array list es: " + suma);
		
		System.out.println();		
		System.out.println("la media de los elementos del array list es: " + (suma/tam));	
		
		for(int n : a) {
      
			if (n < minimo){
		    minimo = n;
			}  
		}			
		
		System.out.println();			
		System.out.println("el minimo del array list es: " + minimo);	
		
		for(int n : a) {
      
			if (n > maximo){
		    maximo = n;
			}  
		}			
		
		System.out.println();			
		System.out.println("el maximo del array list es: " + maximo);	
			
 }
}


/**		
* 2.minimoArrayInt: Devuelve el mínimo del array que se pasa como
* parámetro.
*
* @param  array
* @return minimo valor del array
	

	public static int minimoArray(int x[]) {
		
		
    int minimo = Integer.MAX_VALUE;
  
		for(int n:x) {
      
      if (n < minimo){
		    minimo = n;
      }  
    }
		     
		return minimo;
	} 
  
* 3. maximoArrayInt: Devuelve el máximo del array que se pasa como
* parámetro.
* 
* @param  array
* @return maximo valor del array
	

	public static int maximoArray(int x[]) {
		
		
    int maximo = Integer.MIN_VALUE;
  
		for(int n:x) {
      
      if (n > maximo){
		    maximo = n;
      }  
    }
		     
		return maximo;
	}
  
* 4.Devuelve la media aritmética de los números contenidos en el array que se
* pasa como parámetro.
* 
* @param x array unidimiensional de números enteros
* @return  media aritmética de los números contenidos en el array que se pasa
*          como parámetro

public static double mediaArray(int[] x) {

  int suma = 0;
    
    for (int n : x) {
      suma += n;//suma = suma + n
    }
      
    return (double)suma / x.length;
  }


* 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
* 
* @param x array unidimiensional de números enteros
* @param y un número entero a buscar en array
* @return si el numero se encuentra dentro del array devuelve verdadero


public static boolean estaEnArray(int[] x, int y) {
        
    for (int n : x) {
      if (n == y){
        return true;
      }
    }
      
    return false;
  }
 */
