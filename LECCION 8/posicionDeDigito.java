/**
* Funciones matematicas de proposito general
* 
* Ejercicios 1 - 14: 8.posicionDeDigito: Da la posicion de la primera ocurrencia de un digito
* dentro de un numero entero. Si no se encuentra, devuelve -1.
*
* @author Elena Tellez
*/
 
import java.util.Scanner;

public class posicionDeDigito {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un numero entero positivo: ");
		
		 	
		int numero = sc.nextInt();
		
		System.out.print("Introduzca el digito que desee buscar dentro del numero: ");
		
		int digito = sc.nextInt();		
		 
			System.out.println("La posicion del digito es  " + posicionDeDigito(numero,digito) );
			
		sc.close();	
	
	}

/**
* 
* posicionDeDigito: Da la posicion de la primera ocurrencia de un digito
* dentro de un numero entero. Si no se encuentra, devuelve -1.
*
* @param un numero entero 
* @param una digito dada
* @return primera ocurrencia de ese digito en numero
* @return -1 si no existe ocurrencia
*/

public static int posicionDeDigito(int numero,int digito){
	
int volteado = 0;
int longitud = 0;    
int ocurrencia = 0;
int i;
		 
 
		while (numero > 0) {
			volteado = (volteado * 10) + (numero % 10);
			numero /= 10;
			longitud++;
		      	      
			} 
		   
		for (i = 0; i <= longitud; i++) {
			ocurrencia = volteado%10;
			if (ocurrencia == digito){
			return i;
			} else if ((ocurrencia != digito) && (i==longitud))  {
				return -1;
			}
			volteado /=10;
		} 
		return 1;
	}
}

