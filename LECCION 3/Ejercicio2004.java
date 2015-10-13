/**
* Ejercicio 20 Leccion 4
* Realiza un programa que diga si un número entero positivo introducido por teclado es
* capicúa. Se permiten números de hasta 5 cifras.
*
*
* @author Elena Téllez
*/
public class Ejercicio2004 {
	public static void main(String[] args) {
	
		System.out.println("Vamos a averguar un número entero positivo que usted es capicúa.");
		System.out.println("Por favor, introduzca una número entero y positivo: ");
		int numero = Integer.parseInt(System.console().readLine());
				
		int a = (numero/10);
		int b = (numero%10);
		int d = (numero/10)%10; 
		int c = (numero/100)%10;
		int e = (numero/1000)%10;
		
		if ((numero >= 0) && (numero <=9)) {
			System.out.println("El número que usted ha elegido es capicúa. ");
			}
		
		if ((numero >= 10) && (numero <=99)) {
			if (a == b) {
			System.out.println("El número que usted ha elegido es capicúa. ");
			} else {
				System.out.println("El número que usted ha elegido no es capicúa. ");
				}
			}	
		
		if ((numero >= 100) && (numero <=999)) {
			a = numero/100;		
			if (a == b) {
				System.out.println("El número que usted ha elegido es capicúa. ");
				} else {
					System.out.println("El número que usted ha elegido no es capicúa. ");
				}
			}
			
			if ((numero >= 1000) && (numero <=9999)) {
			a = numero/1000;
									
			if ((a == b) && (c == d)) {
				System.out.println("El número que usted ha elegido es capicúa. ");
				} else {
					System.out.println("El número que usted ha elegido no es capicúa. ");
				}
			}
			
			if ((numero >= 10000) && (numero <=99999)) {
			a = numero/10000;
									
			if ((a == b) && (e == d)) {
				System.out.println("El número que usted ha elegido es capicúa. ");
				} else {
					System.out.println("El número que usted ha elegido no es capicúa. ");
				}
			}
			if (numero >= 100000) {
				System.out.println("El número introducido no es válido ");
			}
	}	
}
