/**
* Ejercicio 01 Lección 3
* Realiza un programa que pida dos números y que luego muestre el resultado de su
multiplicación.
*
* @author Elena Téllez
*/
public class Ejercicio0103 {
	public static void main(String[] args) {
		
		String linea;
		System.out.print("Por favor, introduce un número: ");
		linea = System.console().readLine();
		int primerNumero;
		primerNumero = Integer.parseInt( linea );
		System.out.print("introduce otro, por favor: ");
		linea = System.console().readLine();
		int segundoNumero;
		segundoNumero = Integer.parseInt( linea );
		
		int total;
		total = primerNumero * segundoNumero;
		
		System.out.print("La multiplicacion del primer número y el segundo es ");
		System.out.print(total);
	}
}
