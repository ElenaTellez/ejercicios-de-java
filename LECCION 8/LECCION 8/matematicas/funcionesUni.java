package matematicas;


/**
* 
* Ejercicios 20-28: Crea una biblioteca de funciones para arrays (de una dimensi�n) de n�meros
* enteros que contenga las siguientes funciones:
* 
* @author Elena Tellez
* 
*/


public class funcionesUni {

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
* 1. generaArrayInt: Genera un array de tama�o n con n�meros aleatorios
* cuyo intervalo (m�nimo y m�ximo) se indica como par�metro.
*
* @param tamaño array
* @param minimo de numero aleatorios
* @return maximo de numero aleatorios
* @return genera array unidimensinal e imprime
*/	

	public static int[] generaArrayUni(int tam, int min, int max) {
		
		int arrayUni[] = new int[tam];
		
		 for(int i = 0; i < tam; i++) {
		      arrayUni[i] = (int)(Math.random()*(max - min) + min + 1);
		    }
		     
		return arrayUni;
	}
/**
* 
* 2.minimoArrayInt: Devuelve el mínimo del array que se pasa como
* parámetro.
*
* @param  array
* @return minimo valor del array
*/	

	public static int minimoArray(int x[]) {
		
		
    int minimo = Integer.MAX_VALUE;
  
		for(int n:x) {
      
      if (n < minimo){
		    minimo = n;
      }  
    }
		     
		return minimo;
	} 
  
  /**
* 
* 3. maximoArrayInt: Devuelve el máximo del array que se pasa como
* parámetro.
* 
* @param  array
* @return maximo valor del array
*/	

	public static int maximoArray(int x[]) {
		
		
    int maximo = Integer.MIN_VALUE;
  
		for(int n:x) {
      
      if (n > maximo){
		    maximo = n;
      }  
    }
		     
		return maximo;
	}
  
/**
* 
* 4.Devuelve la media aritmética de los números contenidos en el array que se
* pasa como parámetro.
* 
* @param x array unidimiensional de números enteros
* @return  media aritmética de los números contenidos en el array que se pasa
*          como parámetro
*/

public static double mediaArray(int[] x) {

  int suma = 0;
    
    for (int n : x) {
      suma += n;//suma = suma + n
    }
      
    return (double)suma / x.length;
  }


/**
* 5. estaEnArrayInt: Dice si un número está o no dentro de un array.
* 
* @param x array unidimiensional de números enteros
* @param y un número entero a buscar en array
* @return si el numero se encuentra dentro del array devuelve verdadero
*/

public static boolean estaEnArray(int[] x, int y) {
        
    for (int n : x) {
      if (n == y){
        return true;
      }
    }
      
    return false;
  }

/**
* 6. posicionEnArray: Busca un número en un array y devuelve la posición
* (el índice) en la que se encuentra.
* 
* @param x array unidimiensional de números enteros
* @param y un número entero a buscar en array
* @return la posicion del numero si se encuentra dentro del array o -1
* si el numero no se encuentra
*/

public static int posicionArray(int[] x, int y) {
  
  for(int i = 0; i < x.length; i++) {
      if (x[i] == y) {
        return i;
      }
    }
    return -1;  
}

/**
* 7. volteaArrayInt: Le da la vuelta a un array.
* 
* @param x array unidimiensional de números enteros
* @return  array volteado
* 
*/

public static int[] volteaArray(int[] x) {
  
  int aux[] = new int [x.length];
  
  
  for(int i = 0; i < x.length; i++) {
     aux[x.length -i -1] = x[i]; // a la ultima posicion del array la igualo con la 0
          //del array original
    }  
  return aux; 
  }

/**
*  8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de
* un array.
* 
* @param x array unidimiensional de números enteros
* @return  array rotado a la derecha n posiciones
* 
*/

public static int[] rotaDchaArray(int[]x, int y) {
  
  int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;
    
    while (y-- > 0) {
      aux = a[a.length - 1];
      for(i = a.length - 1; i > 0; i--) {
        a[i] = a[i - 1];
      }
      a[0] = aux;
    }
      
    return a;
  }
 /**
   *9. Devuelve un array rotada <code>n</code> posiciones a la izquierda tomando
   * como referencia el array que se pasa como parámetro. Los números que van
   * saliendo por la izquierda vuelven a entrar por la derecha.
   *
   * @param x array unidimiensional de números enteros
   * @param n número de movimientos (rotaciones hacia la izquierda) a realizar
   * @return  array rotada <code>n</code> posiciones a la izquierda
   */
  public static int[] rotaIzqArray(int[] x, int n) {
    
    int[] a = x.clone(); // clona en a el contenido de x
    int i;
    int aux;
    
    while (n-- > 0) {
      aux = a[0];
      for(i = 0; i < a.length - 1; i++) {
        a[i] = a[i + 1];
      }
      a[a.length - 1] = aux;
    }
      
    return a;
  }
}
            