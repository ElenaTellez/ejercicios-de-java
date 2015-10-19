/**
* Bucle while: calcula el área de un rectangulo
*
* @author Elena Téllez
*/
public class EjemploWhile {
	public static void main(String[] args) {
		
		int base = -555; 
		int altura = - 555;  //es necesario introducir una variable para que la primera vez compruebe Verdadero o Falso entre en el bucle
		
		
		while (base <= 0 ) {
			System.out.println("Introduzca la base del rectangulo"); 
			base = Integer.parseInt(System.console().readLine()); 
			if (base <= 0) {
				System.out.println("La base debe ser un numero positivo mayor que 0"); 
			}
		}
		
		while (altura <= 0 ) {
			System.out.println("Introduzca la altura del rectangulo"); 
			altura = Integer.parseInt(System.console().readLine()); 
			if (base <= 0) {
				System.out.println("La altura debe ser un numero positivo mayor que 0"); 
			}
		}
		
		System.out.println("El área de su rectángulo es " + (base * altura) + " metros cuadrados. ");
	}
}
