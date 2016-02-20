package pruebaFunciones.java;

import matematicas.Funciones;

/**
* Ejercicio 16: Muestra los números capicúa que hay entre 1 y 99999.
*
* @author Elena Tellez
*/

public class ejercicio1608 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 100000; i++) {
			
			if (matematicas.Funciones.esCapicua(i)) {
				System.out.print( " " + i + " ");
				}  

		}

	}

}