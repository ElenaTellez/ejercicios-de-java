
package examenes;

import java.util.Scanner;

/**
* Realiza una función que devuelva el número complementario a otro que se pasa como parámetro.
* Cada dígito del número complementario es la diferencia con 9 del dígito original. 
* Por ejemplo el complementario de 308566 es el 691433 y el complementario de 92491 es el 7508.
* Prueba la función desde un programa. 
* A continuación se muestra la cabecera de la función:
* public static long complementario(long x)
*
* @author Elena Tellez
*/
public class complementarioNueve {
  
  public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
	
  System.out.print("Introduzca un numero entero: ");		
	
	long x = 	 sc.nextInt();
  
  System.out.println(x);
  
  System.out.println(voltea(complementario(x)));
		
  
  sc.close();	
  }  
/**
* 
* Realiza una función que devuelva el número complementario a otro 
* que se pasa como parámetro.
* 
* @param numero
* @return diferencia de cada digito hasta nueve
*/	

  public static long complementario(long x) {
   
    long complementario = 0;

    while(x > 0) {
      complementario =  (complementario * 10) + (9-(x % 10));
      x = x / 10;
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
  

