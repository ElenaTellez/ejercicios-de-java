package matematicas;


/**
* 
* Ejercicios 20-28: Crea una biblioteca de funciones para arrays (de una dimensi�n) de n�meros
* enteros que contenga las siguientes funciones:
* 
* 1. generaArrayInt: Genera un array de tama�o n con n�meros aleatorios
* cuyo intervalo (m�nimo y m�ximo) se indica como par�metro.
* 
* @author Elena Tellez
* 
*/


public class funcionesUni {
	
/**
* 
* 1. generaArrayInt: Genera un array de tama�o n con n�meros aleatorios
* cuyo intervalo (m�nimo y m�ximo) se indica como par�metro.
*
* @param n tama�o array
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
	