/**
 * Ejercicio 7
 * Escribe un programa que calcule el total de una factura a partir de la base imponible.
 *
 * @author Elena Téllez
 */

public class Ejercicio0703 {
	public static void main(String[] args) {
			
		String linea;
				
		System.out.print("Por favor, introduce el valor de la Base Imponible: ");
		linea = System.console().readLine();
		double baseImponible;
		baseImponible = Double.parseDouble( linea );		
		
		double iva = baseImponible * 0.21;

		double totalFactura = baseImponible + iva;
		    
		System.out.println("El Iva de mi factura es " + iva);
		System.out.println("El Total de mi factura es " + totalFactura);
		
	}
}
				
