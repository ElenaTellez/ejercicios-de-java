/**
 *Ejercicio 04 Leccion 3
  Escribe un programa que sume, reste, multiplique y divida dos números introducidos por
teclado.
 *
 * @author Elena Téllez
 */

public class Ejercicio0403 {
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
		
		int sum = primerNumero + segundoNumero;
		System.out.println("La suma de mis variables es " + sum);
		int res = primerNumero - segundoNumero;
		System.out.println("La resta de mis variables es " + res);
		int mul = primerNumero * segundoNumero;
		System.out.println("La multiplicación de mis variables es " + mul);
		double div = (double)primerNumero / (double)segundoNumero;
		System.out.printf("La division de mis variable es %.2f", div);
			
  }
}
