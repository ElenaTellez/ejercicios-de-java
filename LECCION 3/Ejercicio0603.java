/**
 *Ejercicio 6 Lección 3
 *Escribe un programa que calcule el área de un triángulo.(b*h)/2
 *
 * @author Elena Téllez
 */

public class Ejercicio0603 {
	public static void main(String[] args) {
			
		String linea;
		
		System.out.print("Por favor, introduce el valor de la base del triángulo: ");
		linea = System.console().readLine();
		int base;
		base = Integer.parseInt( linea );
		System.out.print("Por favor, introduce el valor de la altura del triángulo: ");
		linea = System.console().readLine();
		int altura;
		altura = Integer.parseInt( linea );
		
		int mul = base * altura;
		int total = mul / 2;
		System.out.println("El área de mi triángulo es " + total);
		
	}
}
