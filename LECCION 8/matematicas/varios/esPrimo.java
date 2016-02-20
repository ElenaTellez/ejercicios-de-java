/**
* Funciones matemáticas de propósito general
* 
* Ejercicios 1 - 14: 2. esPrimo: Devuelve verdadero si el número que se pasa como parámetro es primo y
* falso en caso contrario.
*
* @author Elena Tellez
*/
package matematicas;

public class esPrimo {

/**
* Comprueba si un número entero positivo es primo o no.
* Un número es primo cuando únicamente es divisible entre
* él mismo y la unidad.
*
* @param x un número entero positivo
* @return <code>true</code> si el número es primo
* @return <code>false</code> en caso contrario
*/

public static boolean esPrimo(int x) {
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
			return false;
			}
		}
	return true;
	}
}
