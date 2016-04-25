package funcioneAhorcado;



public class funciones {

/**
 * @param un array de palabras
 * return una palabra al azar
*/
		
public static String elegida(String x) {
	
	String ocultadas[]= {"caballo", "cabra", "vaca", "toro","conejo","gallina"};
			
		//doy posicion al azar a array
		return ocultadas[(int)(Math.random()*5)];	 
	}

/**
 * @param un array de caracteres
 * return relleno array con _
*/
		
public static char[] rellenaArray(char x[]) {
	
	int aumenta = 0;
	int cuenta = x.length;
			
	while (cuenta > 0) { // rellena el array con _

		x[aumenta] = '_';
		aumenta++;
		cuenta--;
	}
		return x;	 
	}
/**
 * @param un array de caracteres con palabra a acertar
 * @param un array de caracteres  a rellenar con letra acertada 
 * return relleno array con array con letras acertadas. 
*/
		
public static int buscaLetra(char guardarPartida[], char guardarPartida2[], String letra) {
	
	int cuenta = guardarPartida.length;
	int original = cuenta;
	int cuentaLetras = 0; 
		
	while (cuenta > 0) {

		if (guardarPartida[original - cuenta] == (letra.charAt(0))) {

			guardarPartida2[original - cuenta] = letra.charAt(0);// mete la letra en array dos junto con _
																	 
			cuentaLetras++; // contador que cuenta las letras encontradas

			 //muestra la letra encontrado 

			System.out.print(guardarPartida2[original - cuenta] + " "); //muestra la letra encontrado 

		} else {

			System.out.print(guardarPartida2[original - cuenta] + " "); //muestra los espacios _ sin letra
		}	

		cuenta--; // contador de bucle buscando letra en array 2
		
		
	}
	
	return cuentaLetras;
		
	}

/**
 * @param un parametro que indica los numeros de fallos
 *
 * return figura de ahorcado
 */

		
public static void pintoAhorcado(int fallo) {
	
			if (fallo == 1) {
				System.out.println(" ______ ");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println("No has acertado. Intentalo de nuevo");

			}

			if (fallo == 2) {
				System.out.println(" ______ ");
				System.out.println(" |      |");
				System.out.println(" |      ");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |");
			}

			if (fallo == 3) {
				System.out.println(" ______ ");
				System.out.println(" |     |");
				System.out.println(" |     O");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println(" |");
				System.out.println("No has acertado. Intentalo de nuevo");
			}

			if (fallo == 4) {

				System.out.println(" |      |");
				System.out.println(" |      O/");
				System.out.println(" |     /| ");
				System.out.println(" |        ");
				System.out.println(" |        ");
				System.out.println(" |        ");
				System.out.println("No has acertado. Intentalo de nuevo");
			}

			if (fallo == 5) {
				System.out.println(" ______ ");
				System.out.println(" |     |");
				System.out.println(" |     O/");
				System.out.println(" |    /| ");
				System.out.println(" |     |  ");
				System.out.println(" |       ");
				System.out.println(" |");
				System.out.println("No has acertado. Intentalo de nuevo");
			}
			if (fallo == 6) {
				System.out.println("¡OOOOH! ¡Has perdido la partida!");
				System.out.println(" ______ ");
				System.out.println(" |     |");
				System.out.println(" |     O/");
				System.out.println(" |    /| ");
				System.out.println(" |     |_ ");
				System.out.println(" |    /  ");
				System.out.println(" |");
			}
		}
/**
 * @param un array de caracteres con palabra a acertar
 * @param un array de caracteres  a rellenar con letra acertada 
 * return relleno array con array con letras acertadas. 
*/
		
public static void ganoPartida(char guardarPartida[], char guardarPartida2[],int contadorAcierto,int acierto,  int aumenta, int cuenta, int fallo) {
	
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

	
}
