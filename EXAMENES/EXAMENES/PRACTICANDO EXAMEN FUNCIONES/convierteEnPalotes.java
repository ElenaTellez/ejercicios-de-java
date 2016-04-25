
import java.util.Scanner;

/**
 * Crea una función con la siguiente cabecera:
 * public static String convierteEnPalotes(int n)
 * Esta función convierte el número n al sistema de palotes y lo devuelve en una cadena de caracteres.
 * Por ejemplo, el 470213 en decimal es el | | | | - | | | | | | | - - | | - | - | | | 
 * en el sistema de palotes. 
 * Utiliza  esta función en un programa para comprobar que funciona bien. 
 * Desde la función no se debe mostrar nada por pantalla, solo se debe usar print 
 * desde el programa principal.
 * @author Elena Tellez
 */
public class convierteEnPalotes {
  
public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
	
  System.out.print("Introduzca un numero: ");		
	
	int numero = 	 sc.nextInt();
  
  System.out.println("El Codigo en Palotes que le corresponde al numero introducido es:");
  System.out.println(convierteEnPalotes(numero) + ".");
    
  sc.close();	
  }  
/**
* La funcion transforma un numero introducido en Codigo Palotes 
* 
* @param numero 
* @return codigo morse que le corresponde
*/	

  public static String convierteEnPalotes(int n) {
   
    int numeroDigitos = digitos(n);
    String palote[]= {"   "," | "," | | "," | | | "," | | | | ",
      " | | | | | "," | | | | | | "," | | | | | | | "," | | | | | | | | ",
      " | | | | | | | | | "};    
    String palotes = " ";
    String codigo = " ";
    int volteado = voltea (n);
    
    for (int i = 0; i < numeroDigitos; i++){
   
      int digito = volteado%10;
      palotes = palote[digito];
      codigo = codigo + "-" + palotes;
      volteado = volteado/10;
      
    } 
    return codigo;
  } 
   /**
   * Cuenta el número de dígitos de un número entero.
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
   * Le da la vuelta a un número.
   *
   * @param x número al que se le quiere dar la vuelta
   * @return  número volteado (al revés)
   */
  public static long voltea(long x) {
    if (x < 0) {
      return -voltea(-x);
    }

    long volteado = 0;

    while(x > 0) {
      volteado = (volteado * 10) + (x % 10);
      x = x / 10;
    }

    return volteado;
  }

  /**
   * Le da la vuelta a un número.
   *
   * @param x número al que se le quiere dar la vuelta
   * @return  número volteado (al revés)
   */
  public static int voltea(int x) {
    return (int)voltea((long)x);
  }
}
