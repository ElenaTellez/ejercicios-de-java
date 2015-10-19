/**
* Bucle for: ejemplo con dos variables i y j
*
* @author Elena Téllez
*/
public class EjemploWhile {
	public static void main(String[] args) {
		
		int base = -555; 
		
		while (base <= 0 ) {
			System.out.println("Introduzca la base del rectangulo"); //solo aparece por pantalla j que es la orden que le doy
			base = Integer.parseInt(System.console().readLine()); 
			if (base <= 0) {
				System.out.println("La base debe ser un numero positivo"); 
			}
		}
	}
}
