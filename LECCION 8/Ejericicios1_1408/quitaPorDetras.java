/**
* Funciones matematicas de proposito general
* 
* Ejercicios 1 - 14: 9. quitaPorDetras: Le quita a un número n dígitos por detrás (por la
* derecha).
*
* @author Elena Tellez
*/
 
import java.util.Scanner;

public class quitaPorDetras {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un numero entero positivo: ");
		
		 	
		int numero = sc.nextInt();
		
		System.out.print("Introduzca el numero de digitos que desee quitar por detras: ");
		
		int digitos = sc.nextInt();		
		 
		System.out.println("El numero resultante es: " + matematicas.funciones.quitaPorDetras(numero,digitos) );
			
		sc.close();	
	
	}



}