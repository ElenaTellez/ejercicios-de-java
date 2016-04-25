import java.util.Scanner;


/**
 * Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga 
 * lo que se especifica en los comentarios 
 * (puedes incluirla en tu propia biblioteca de rutinas):
 * int[ ] moda(int x[ ]); 
 * Devuelve un array con dos elementos. El primer elemento indica el número de
 * moda, es decir, el número que más se repite. El segundo elemento indica la
 * frecuencia, o sea, el número de veces que aparece el número de moda en
 * el array.
 * Utiliza estas funciones en un programa para comprobar que funcionan bien.
 * @author Elena Tellez
 */
public class numModa {  
  
	public static void main(String[] args) {
		
   Scanner sc = new Scanner(System.in);
  
             
    int tam = 6;               
    int minimo = 1;               
    int maximo = 5;
    
    int[] a = generaArrayUni(tam, minimo,maximo);
    
    muestraArrayInt(a);
    
    System.out.println("El numero de moda y las veces que se repite es: ");
    
    muestraArrayInt(moda(a));
    
    sc.close();	
}

/**
* 
* moda: array con dos valores
*
* @param un array unidimensional aleatorio
* @return el numero que se repite mas veces y el numero de veces
*/
  
  public static int[] moda(int x[]) {
    
    
    int contador = 0;
    int contadorUno = 0;
    int contadorDos = 0;
    int contadorTres = 0;
    int contadorCuatro = 0;
    int contadorCinco = 0;
    
    for (int i = 0; i < x.length; i++){
      if (x[0] == x[i]){
        contador++;
          }  
      if (x[1]!=x[0]){
        if (x[1] == x[i]){
        contadorUno++;
          }
      }
      if ((x[1]!=x[0])&&(x[1]!=x[2])&&(x[2]!=x[0])){
        if (x[2] == x[i]){
        contadorDos++;
          }
      }
      if ((x[1]!=x[0])&&(x[1]!=x[2])
        &&(x[2]!=x[0])&&(x[2]!=x[3])
        &&(x[1]!=x[3])&& (x[3]!=x[0])){
          if (x[3] == x[i]){
          contadorTres++;
          }
      }
      if ((x[1]!=x[0])&&(x[1]!=x[2])
        &&(x[2]!=x[0])&&(x[2]!=x[3])
        &&(x[1]!=x[3])&& (x[3]!=x[0])
        && (x[3]!=x[4])&& (x[4]!=x[2])&& (x[4]!=x[1])&& (x[4]!=x[0])){
          if (x[4] == x[i]){
        contadorCuatro++;
          }
      }
      if ((x[1]!=x[0])&&(x[1]!=x[2])
        &&(x[2]!=x[0])&&(x[2]!=x[3])
        &&(x[1]!=x[3])&& (x[3]!=x[0])
        && (x[3]!=x[4])&& (x[4]!=x[2])&& (x[4]!=x[1])&& (x[4]!=x[0])
        && (x[4]!=x[5])&& (x[3]!=x[5])&& (x[2]!=x[5])&& (x[1]!=x[5])&& (x[0]!=x[5])){
           if (x[5] == x[i]){
            contadorCinco++;
          }
      }
    }
    
    int repeticion [] = {contador, contadorUno, contadorDos, contadorTres, contadorCuatro, contadorCinco};
        
    int valorUno = maximoArray(repeticion);
    int valorDos = posicionArray(repeticion, valorUno);
    
    switch(valorDos) {
			case 0:
        valorDos = x[0];
        break;
			case 1:
        valorDos = x[1];
        break;
			case 2:
        valorDos = x[2];
        break;
			case 3:
        valorDos = x[3];
        break;
      case 4:
        valorDos = x[4];
        break;
      case 5:
        valorDos = x[5];
        break;  
      default:
		}
    
  int moda [] = {valorDos, valorUno}; 
    
    
    
    return moda;
     
   
  }  	

/**
* 
* generaArrayInt: Genera un array de tama�o n con n�meros aleatorios
* cuyo intervalo (m�nimo y m�ximo) se indica como par�metro.
*
* @param tam array
* @param min de numero aleatorios
* @param max de numero aleatorios
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
* maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
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
* posicionEnArray: Busca un número en un array y devuelve la posición
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
    return  -1;
 }
}
