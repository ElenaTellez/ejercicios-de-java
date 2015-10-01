/**
 *Ejercicio 02 Leccion 3
  Realiza un conversor de euros a pesetas. Realiza un conversor de euros a pesetas. 
  La cantidad de euros que se quiere convertir debeser introducida por teclado.
 *
 * @author Elena Téllez
 */

public class Ejercicio0203 {
	public static void main(String[] args) {

		double euros;
		int pesetas;
			
		String linea;
		System.out.print("Por favor, introduce la cantidad en euros: ");
		linea = System.console().readLine();
		euros = Double.parseDouble( linea );
		pesetas = (int)(euros * 166.386);
			
		System.out.print("La cantidad en pesetas es " + pesetas);
  
  }
}
