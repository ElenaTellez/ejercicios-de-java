package pruebaFunciones.java;

import matematicas.funciones;

/**
* Ejercicio 15: Muestra los números primos que hay entre 1 y 1000.
*
* @author Elena Tellez
*/
 

public class digitoN {

	public static void main(String[] args) {
		
				
		for (int i = 1; i < 1001; i++) {
			
			if (matematicas.funciones.esPrimo(i)) {
				System.out.print( " " + i + " ");
				}  

		}
	}
}
