/**
* Ejercicio 13 Leccion 4
* Escribe un programa que ordene tres números enteros introducidos por teclado.
*
*
* @author Elena Téllez
*/
public class Ejercicio1304 {
	public static void main(String[] args) {
	
		System.out.println("Este programa ordena los tres número que usted elija de mayor a menor.");
		System.out.println("Por favor, introduzca su primer número elegido: ");
		int a = Integer.parseInt(System.console().readLine());
		System.out.println("Por favor, introduzca su segundo número elegido: ");
		int b = Integer.parseInt(System.console().readLine());
		System.out.println("Por favor, introduzca tercer número elegido: ");
		int c = Integer.parseInt(System.console().readLine());
		
		if ((a > b) && (b > c)) {
			System.out.println("El orden de sus números es: " + a + "," + b + "," + c);
				} else if ((a > c) && (c > b )) {
				System.out.println("El orden de sus números es: " + a + "," + c + "," + b);
				}
		
		if ((c > a) && (a > b)) {
			System.out.println("El orden de sus números es: " + c + "," + a + "," + b);
				} else if ((c > b) && (b > a )) {
				System.out.println("El orden de sus números es: " + c + "," + b + "," + a);
				}
				
		if ((b > a) && (a > c)) {
			System.out.println("El orden de sus números es: " + b + "," + a + "," + c);
				} else if ((b > c) && (c > a )) {
				System.out.println("El orden de sus números es: " + b + "," + c + "," + a);
				}		
	}	
}
