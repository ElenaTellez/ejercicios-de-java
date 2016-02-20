package pruebaFunciones.java;
/**
* Funciones matematicas de proposito general
* 
* Ejercicios 1 - 14: 10.quitaPorDelante: Le quita a un número n dígitos por delante (por la
* izquierda).
*
* @author Elena Tellez
*/
 
import java.util.Scanner;

public class quitaPorDelante {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un numero entero positivo: ");
		
		 	
		int numero = sc.nextInt();
		
		System.out.print("Introduzca el numero de digitos que desee quitar por delante: ");
		
		int digitos = sc.nextInt();		
		 
		System.out.println("El numero resultante es: " + quitaPorDelante(numero,digitos) );
			
		sc.close();	
	
	}


/**
* quitaPorDelantes: Le quita a un nÃºmero n dÃ­gitos por delante (por la izquierda)
* 
* @param un numero entero
* @param numero de digitos a quitar por delante
* @return devuelve numero con n digitos menos por delante
*/
public static int quitaPorDelante(int numero, int digitos) {
	
		int volteado = 0;
		int volteadoDos = 0;
    
		while (numero > 0) {
			volteado = (volteado * 10) + (numero % 10);
			numero /= 10;
		}  
	
		for (int i = 0; i < digitos; i++){
		
		 
			volteado /=10;
			
		}
		
		while (volteado > 0) {
			volteadoDos = (volteadoDos * 10) + (volteado % 10);
			volteado /= 10;
		}  
		
		
	
		return volteadoDos;
		 
		
	}
}