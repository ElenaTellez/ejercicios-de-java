import java.util.Scanner;

/**
 *
 * @author Elena Tellez
 */
public class Ex30mets2 { 
   public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
	
  System.out.print("Introduzca un numero entero: ");		
	
	long x = 	 sc.nextInt();
  
  muestraArrayInt(convierteNumeroEnArray(x));
  
  sc.close();	
  }  
/**

* 
* @param numero
* @return un array en el que cada digito es un valor del array
*/	

  public static int[] convierteNumeroEnArray(long n){
   
    long volteado = voltea(n);
    int digito = (digitos(n));
    int array[] =new int[digito];
    int valores = 0;
        
    for (int i = 0; i < digito; i++) {        
      array[i] = (int) (volteado%10);      
      volteado = volteado/10;
      }
    
    
     return array; 
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
   /* * Cuenta el número de dígitos de un número entero.
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
  
  /**
   * Muestra por pantalla todos los elementos de un array de números enteros
   * separados por un espacio.
   * 
   * @param x array unidimiensional de números enteros
   */
  public static void muestraArrayInt(int x[]) {
    
    System.out.println("\n\nArray del numero elegido:");
    
    System.out.print("│ Índice ");
    for (int i = 0; i < x.length; i++) {
      System.out.printf("│%4d ", i);
    }
    System.out.println();  
    System.out.print("│ Valor  ");
    for (int i = 0; i < x.length; i++) {
      System.out.printf("│%4d ", x[i]);
    }
    

  }
}
