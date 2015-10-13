/**
 * Ejercicio 17 Leccion 4
 * 
 * Escribe un programa que diga cuál es la última cifra de un número entero introducido
 * por teclado. Se permiten números de hasta 5 cifras.
 *
 * @author Elena Téllez
 */
public class Ejercicio1704 {

	public static void main(String[] args) {

		System.out.println("Vamos a averiguar cual es la última cifra del número que usted elija."); 
		System.out.println("Por favor, introduzca un número: ");    
		int numero = Integer.parseInt(System.console().readLine());	
	
			if (numero < 0) {
				numero = (numero * -1);
			} //esta variable la pongo para que el ejercicio funcione con numeros negativos
			
			System.out.println("La última cifra de su número es " + (numero%10));
			
	}
}	
