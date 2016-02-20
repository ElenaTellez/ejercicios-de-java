/**
* Funciones matemáticas de propósito general
* 
* Ejercicios 1 - 14: 5. digitos: Cuenta el número de dígitos de un número entero.
*
* @author Elena Tellez
*/
package matematicas;

public class numeroDigitos {

/**
* Devuelve el número de dígitos que contiene un número entero
*
* @param x un número entero
* @return la cantidad de dígitos que contiene el número
*/
public static int digitos(int x) {
		
		if (x == 0) {
			return 1;
			} else {
	
		int n = 0;
	
		while (x > 0) {
			x = x / 10;
			n++;
		}
	
		return n;
		}
	}
}
