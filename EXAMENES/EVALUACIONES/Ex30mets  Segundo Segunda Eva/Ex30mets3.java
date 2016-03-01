
import java.util.Scanner;

/**
 *
 * @author Elena Tellez
 */
public class Ex30mets3 {
  
     public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
	
  System.out.print("Introduzca un numero entero: ");		
	
	long x = 	 sc.nextInt();
  
  System.out.print("Introduzca un numero entero: ");		
	
	long y = 	 sc.nextInt();
  
  System.out.println(mezclaAleatoria(x, y));
  
  sc.close();	
  }  
/**
* 
* 
* @param un numero
* @param un numero
* @return un numero formado por los digitos de los numeros anteriores
* de forma aleatoria
*/	

  public static long mezclaAleatoria(long x, long y){
   
    long volteadoUno = voltea(x);
    long volteadoDos = voltea(y);
    int digitoUno = (digitos(x));
    int digitoDos = (digitos(y));
    int longitudTotal = (digitoUno + digitoDos);
    long mezclado = 0;
    long aleatorio = 0;
    int contadorUno = 1;
 
   
        
    for (int i = 0; i < longitudTotal; i++) {
      int mezcla = (int)(Math.random()*((1 - 0) + 1)+ 0);
        if ((mezcla == 1) && (contadorUno <= digitoUno)){
          mezclado = volteadoUno%10;
          volteadoUno = volteadoUno/10;
          contadorUno++;
        }else {
          mezclado = volteadoDos%10;
          volteadoDos = volteadoDos/10;
        }
        aleatorio = (aleatorio*10) + mezclado;
      
      }
    
   return aleatorio; 
     
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
   /** Cuenta el número de dígitos de un número entero.
   *
   * @param x número al que se le quieren contar los dígitos
   * @return  número de dígitos que tiene el número que se pasa como parámetro
   */
  public static int digitos(long x) {
    if (x < 0) {
      x = -x;
    }

    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10; // se le quita un dígito a x
        n++; // incrementa la cuenta de dígitos
      }
      return n;
    }
  }

  /**
   * Cuenta el número de dígitos de un número entero.
   *
   * @param x número al que se le quieren contar los dígitos
   * @return  número de dígitos que tiene el número que se pasa como parámetro
   */
  public static int digitos(int x) {
    return digitos((long)x);
  }
  
  
  
}
