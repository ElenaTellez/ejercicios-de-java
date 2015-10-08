/**
* Ejercicio 14 Leccion 4
* Realiza un programa que diga si un número introducido por teclado es par y/o divisible
* entre 5.
*
*
* @author Elena Téllez
*/
public class Ejercicio1404 {
	public static void main(String[] args) {
	
		System.out.println("Vamos a averguar si su número es par y/o divisible entre 5.");
		System.out.println("Por favor, introduzca una número: ");
		int numero = Integer.parseInt(System.console().readLine());
		
		int par = numero %2;
		int divisible = numero %5;
		
		if (par == 0) {
			System.out.println("Su número es par ");
				} else {
				System.out.println("Su número es impar ");
				}
				
		if (divisible == 0) {
			System.out.println("y además es divisible entre 5. ");
				} else {
				System.out.println("y además no es divisible entre 5. ");
				}
	}	
}
