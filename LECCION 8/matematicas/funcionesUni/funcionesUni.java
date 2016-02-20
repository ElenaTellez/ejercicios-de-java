package matematicas;


/**
* 
* Ejercicios 20-28: Crea una biblioteca de funciones para arrays (de una dimensión) de números
* enteros que contenga las siguientes funciones:
* 
* 1. generaArrayInt: Genera un array de tamaño n con números aleatorios
* cuyo intervalo (mínimo y máximo) se indica como parámetro.
* 
* @author Elena Tellez
* 
*/


public class funcionesUni {
	
/**
* 
* 1. generaArrayInt: Genera un array de tamaño n con números aleatorios
* cuyo intervalo (mínimo y máximo) se indica como parámetro.
*
* @param n tamaño array
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
}
	