/**
 *Ejercicio 5 Leccion 3
 *Escribe un programa que calcule el área de un rectángulo.
 *
 * @author Elena Téllez
 */

public class Ejercicio0503 {
	public static void main(String[] args) {
			
		String linea;
		
		System.out.print("Por favor, introduce el valor de la base del rectángulo: ");
		linea = System.console().readLine();
		int base;
		base = Integer.parseInt( linea );
		System.out.print("Por favor, introduce el valor de la altura del rectángulo: ");
		linea = System.console().readLine();
		int altura;
		altura = Integer.parseInt( linea );
		
		int mul = base * altura;
		System.out.println("El área de mi rectángulo es " + mul);
		
	}
}
		
