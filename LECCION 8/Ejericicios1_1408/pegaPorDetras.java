/**
* Funciones matematicas de proposito general
* 
* Ejercicios 1 - 14:11. pegaPorDetras: Añade un dígito a un número por detrás.
*
* @author Elena Tellez
*/
 
import java.util.Scanner;

public class pegaPorDetras {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un numero entero positivo: ");
		
		 	
		String numero = sc.nextInt();
		
		System.out.print("Introduzca el numero de digitos que desee quitar por detras: ");
		
		String digito = sc.nextInt();		
		 
		System.out.println("El numero resultante es: " + matematicas.funciones.pegaPorDetras(numero,digito));
			
		sc.close();	
	
	}



}