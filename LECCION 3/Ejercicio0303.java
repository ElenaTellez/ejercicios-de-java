/**
 *Ejercicio 03 Leccion 3
  Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere convertir
debe ser introducida por teclado.
 *
 * @author Elena Téllez
 */

public class Ejercicio0303 {
	public static void main(String[] args) {

		double pesetas;
		double euros;
			
		String linea;
		System.out.print("Por favor, introduce la cantidad en pesetas: ");
		linea = System.console().readLine();
		pesetas = Integer.parseInt( linea );
		euros = (pesetas / 166.386);		
			
		System.out.print("La cantidad en pesetas es " + euros);
  
  }
}
