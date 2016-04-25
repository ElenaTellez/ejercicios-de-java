
import java.util.Scanner;

import funcioneAhorcado.funciones;

public class ahorcadofx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cuenta = 0;
		int original = 0;
		String letra = "";
		int cuentaLetras = 0;
		int aumenta = 0;
		int acierto = 0;
		int fallo = 0;
		int contadorAcierto = 0;
		String x = "";

		String palabra = (funcioneAhorcado.funciones.elegida(x));// genera la palabra de forma aleatoria
																	
		System.out.println(palabra); // veo la palabra para comprobar juego.

		cuenta = (palabra.length()); // le da valor segun el numero de caracteres de la palabra guarda el valor original 
										// segun el numero de caracteres de la palabra
		original = cuenta;   

		char guardarPartida[] = palabra.toCharArray();// guarda cada caracter de la palabra elegida en una posicion de array
														 

		char guardarPartida2[] = new char[original];// guarda cada caracter de la palabra elegida en una posicion de array							  

		funcioneAhorcado.funciones.rellenaArray(guardarPartida2);// rellena array con _
		
		aumenta = 0;
		
		cuenta = original; //le devuelvo valor a cuenta. 
		

		// bucle general donde tienes 6 fallos hasta que pierdas---------------------------------

		while (fallo < 6) {

			System.out.println("\n¿Que letra crees que esta en la palabra?");
			letra = sc.nextLine();

			cuenta = original;
			aumenta = 0;
			cuentaLetras = 0;

			System.out.println();

			// lee las letras y las mete en el array 2 y lo muestra

			cuentaLetras = funciones.buscaLetra(guardarPartida, guardarPartida2, letra);
											
			if (cuentaLetras == 0) {
				fallo++;//cuenta los fallos para continuar en bucle general
			}

			System.out.println();

			// se compara los arrays para ver si son iguales y ganas la partida

			aumenta = 0;
			acierto = original;
			cuenta = original;

			while (cuenta > 0) {

				//funcioneAhorcado.funciones.ganoPartida( guardarPartida,guardarPartida2,contadorAcierto,acierto,aumenta,cuenta,fallo);
				
				if (guardarPartida2[aumenta] == guardarPartida[aumenta]) {

					contadorAcierto++;
					aumenta++;

					if (contadorAcierto == acierto) {

						fallo = 6; // para salir de bucle general
						cuenta = 0;
					}

				} else {

					cuenta = 0; // para salir de este bucle y volver a buscar mas letras
					contadorAcierto = 0; // lo pongo en 0 para que no me entre en el if final 
				}
			} 
			
			
			// doy grafico a los fallos
			
			if (cuentaLetras == 0){
			
			funcioneAhorcado.funciones.pintoAhorcado(fallo);
			}

		}
		
		
		//Termina bucle general--------------------------------------------------------

		if (contadorAcierto == acierto) {
			System.out.println("Has ganado la partida");
		} 		
	
		

		sc.close();
	}

}
