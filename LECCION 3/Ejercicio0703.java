/**
 * Ejercicio 7
 * Escribe un programa que calcule el total de una factura a partir de la base imponible.
 *
 * @author Elena Téllez
 */

public class Ejercicio0703 {
	public static void main(String[] args) {
			
		String linea;
		
		System.out.print("Por favor, introduce el valor de la base de la base imponible: ");
		linea = System.console().readLine();
		int base;
		base = Integer.parseInt( linea );
				
		double total = base * 0,21;
		System.out.println("El importe de la factura es " + total);
		
	}
}
