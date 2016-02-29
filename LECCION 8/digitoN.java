/**
* Funciones matemÃ¡ticas de propÃ³sito general
* 
* Ejercicios 1 - 14: 7. digitoN: Devuelve el dÃ­gito que estÃ¡ en la posiciÃ³n n de un nÃºmero entero. Se
* empieza contando por el 0 y de izquierda a derecha
*
* @author Elena Tellez
*/
 
import java.util.Scanner;

public class digitoN {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduzca un número entero positivo: ");
		
		 	
		int numero = sc.nextInt();
		
		System.out.print("Introduzca la posicion del dígito que desee: ");
		
		int posicion = sc.nextInt();		
		 
			System.out.println("el digito es  " + digitoN(numero,posicion) );
			
		sc.close();	

	 
}




/**
* 
* digitoN: Devuelve el digito que esta en la posicion n de un nÃºmero entero. Se
* empieza contando por el 0 y de izquierda a derecha
*
* @param un numero
* @param un una posicion 
* @return el digito de la posicion indicada
*/
public static int digitoN(int numero, int posicion) {
    
   
   // le da la vueta al nÃºmero y calcula la longitud
    int volteado = 0;
    int longitud = 0;    
    int aux = 0;
      
    
    
    while (numero > 0) {
        volteado = (volteado * 10) + (numero % 10);
        numero /= 10;
        longitud++;
       aux = longitud;
      
      
    } // while

    int digitos [] = new int[aux]; 
    
    for (int i = 0; i < aux; i++) { 
    	digitos[i] = volteado%10;
    	volteado /= 10;
    }
    
   	return digitos[posicion];  
   	
   	
	}
}
