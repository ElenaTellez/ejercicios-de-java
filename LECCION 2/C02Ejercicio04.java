/**
 *Ejercicio 4
  Realiza un conversor de euros a pesetas. Realiza un conversor de euros a pesetas. 
  La cantidad de euros que se quiere convertir debeser introducida por teclado.
 *
 * @author Rubén López Mompeán
 */

public class Ejercicio0203 {
	public static void main(String[] args) {

		double euros;
		int pesetas;
			
		String linea;
		System.out.print("Por favor, introduce un número: ");
		linea = System.console().readLine();
		int primerNumero;
		primerNumero = Integer.parseInt( linea );
		pesetas = (int)(euros * 166.386);
			
		//System.out.println( euros + " euros son " + pesetas + " pesetas ");
		System.out.printf( "%.2f euros son %d pesetas ", 30.456, pesetas);
  
  }
}
