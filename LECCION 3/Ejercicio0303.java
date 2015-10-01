/**
 *Ejercicio 03 Leccion 3
  Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir
debe ser introducida por teclado.
 *
 * @author Elena Téllez
 */

public class Ejercicio0303 {
	public static void main(String[] args) {

		double euros;
		int pesetas;
			
		String linea;
		System.out.print("Por favor, introduce la cantidad en pesetas: ");
		linea = System.console().readLine();
		pesetas = Integer.parseInt( linea );
		euros = (int)(pesetas / 166.386);
			
		System.out.print("La cantidad en pesetas es " + euros);
  
  }
}
