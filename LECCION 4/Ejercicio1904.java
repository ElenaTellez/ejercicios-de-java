/**
* Ejercicio 19 Leccion 4
* Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser
* positivo o negativo. Se permiten números de hasta 5 dígitos.
*
*
* @author Elena Téllez
*/
public class Ejercicio1904 {
	public static void main(String[] args) {
	
		System.out.println("Vamos a averguar cuantos dígitos tiene el número que usted elija.\nSe permiten números de hasta 5 dígitos");
		System.out.println("Por favor, introduzca una número: ");
		int numero = Integer.parseInt(System.console().readLine());
		
		if (numero < 0) {
				numero = (numero * -1);
		}  //esta variable la pongo para que el ejercicio funcione con numeros negativos
				
		if ((numero >= 0) && (numero <=9)) {
			System.out.println("El número que usted ha elegido tiene un sólo dígito. ");
		}
		
		if ((numero >= 10) && (numero <=99)) {
			System.out.println("El número que usted ha elegido tiene dos dígitos. ");
		}
			
		if ((numero >= 100) && (numero <=999)) {
			System.out.println("El número que usted ha elegido tiene tres dígitos. ");
		}		 
			
		if ((numero >= 1000) && (numero <=9999)) {
			System.out.println("El número que usted ha elegido tiene cuatro dígitos. ");
		}
			
		if ((numero >= 10000) && (numero <=99999)) {
			System.out.println("El número que usted ha elegido tiene cinco dígitos. ");
		} else if (numero >= 100000) {
				System.out.println("El número introducido no es válido ");
			}
	}	
}
