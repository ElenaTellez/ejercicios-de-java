import java.util.Scanner;

/**
 *
 * @author Elena Tellez
 */
public class parizado {
  
  public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
	
  System.out.print("Introduzca un numero entero: ");		
	
	long x = 	 sc.nextInt();
  
  System.out.println(x);
  
  System.out.println(voltea(parizado(x)));
		
  
  sc.close();	
  }  
/**
* 
* Realiza una función que devuelva el número “parizado” a otro que se pasa como parámetro. 
* Cada dígito del número parizado es el mismo dígito del número original 
* en caso de que éste sea par, o el siguiente par en caso de que el dígito original sea impar
* (el siguiente par del 9 será el 0). 
* Por ejemplo el parizado de 308566 es el 408666 y el parizado de 92491 es el 2402. 
* 
* @param numero
* @return ese mismo numero con digitos impares sumados uno y en caso de 9 se devuelve 0
*/	

  public static long parizado(long x) {
   
    long complementario = 0;
       
    while(x > 0) {     
    
      if (((x%10)%2 != 0) && ((x%10)!=9)) {        
          complementario =  (complementario * 10) + ((x % 10)+1);
      } else  if ((x%10)%2 == 0) {
        complementario =  (complementario * 10) + (x % 10);
      } else if ((x%10)==9){
        complementario = (complementario * 10) + 0;
      } 
      
      
      x = x/10;
    }

    return complementario;
  }

  /**
   * Le da la vuelta a un número.
   *
   * @param x número al que se le quiere dar la vuelta
   * @return  número volteado (al revés)
   */
  public static long voltea(long x) {
    

    long volteado = 0;

    while(x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }

    return volteado;
  }

}
