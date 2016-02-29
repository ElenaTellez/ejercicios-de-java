import java.util.Scanner;

/**
 *El “minmax” de un determinado número es otro número que se calcula juntando
 * el dígito menor junto al mayor. Por ejemplo, el minmax de 3917 es el 19, 
 * el minmax de 4876428 es el 28, el minmax de 6305 es el 6, el minmax de 5555 es el 55, etc.
 * Realiza la función minmax y pruébala en un programa.
 * A continuación se muestra la cabecera de la función:
 * 
 * public static int minmax(long x)
 * 
 * @author Elena Tellez
 */
public class minmax {
  
  public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
	
  System.out.print("Introduzca un  numero entero: ");		
	
	long numero = sc.nextInt();
    
  System.out.println("El numero que resulta de los digitos minimos y maximos es:");		
	
  System.out.println(minmax(numero)); 
  
  sc.close();  
  }  
/**
* 
* Genera funcion que reciba como parametro array unidimensional y devuelva array 
* solo de los numeros con 7 encontrados. En caso de que solo sea de numeros sin 7 el array 
* devolvera -1. Ademas los arrays de entrada y retorno pueden ser de distinto tamaño.
* 
* @param un array de una dimension
* @return array con los numeros pares que contiene o -1 si no contiene
*/	

  public static int minmax(long x) {
  
    long minimo = Integer.MAX_VALUE;
    long maximo = Integer.MIN_VALUE;
    int digitos = digitos(x);
    long valor = 0;
    
    for (int i = 0; i < digitos; i++) {
      valor = x%10;
      
      if (valor < minimo){
		    minimo = valor;
      }
      if (valor > maximo){
		    maximo = valor;
      }
     
       x = x/10;
		} 
    
    int minmax = (int) juntaNumeros(minimo,maximo);
    
    return minmax;
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
   * Cuenta el número de dígitos de un número entero.
   *
   * @param x número al que se le quieren contar los dígitos
   * @return  número de dígitos que tiene el número que se pasa como parámetro
   */
  public static int digitos(int x) {
    return digitos((long)x);
  }
/**
   * Pega dos números para formar uno solo.
   *
   * @param x trozo que se pegará por la izquierda
   * @param y trozo que se pegará por la derecha
   * @return  número compuesto de los trozos <code>x</code> e <code>y</code>
   */
  public static long juntaNumeros(long x, long y) {
    return (long)(x * potencia(10, digitos(y))) + y;
  }

  /**
   * Pega dos números para formar uno solo.
   *
   * @param x trozo que se pegará por la izquierda
   * @param y trozo que se pegará por la derecha
   * @return  número compuesto de los trozos <code>x</code> e <code>y</code>
   */
  public static int juntaNumeros(int x, int y) {
    return (int)(juntaNumeros((long)x, (long)y));
  }
  /**
   * Dada una base y un exponente, devuelve la potencia.
   *
   * @param base      base de la potencia
   * @param exponente exponente de la potencia
   * @return          número resultante de elevar la base a la potencia indicada
   */
  public static double potencia(int base, int exponente) {
    if (exponente == 0) {
      return 1;
    }

    if (exponente < 0) {
      return 1/potencia(base, -exponente);
    }

    int n = 1;

    for (int i = 0; i < Math.abs(exponente); i++) {
      n = n * base;
    }

    return n;
  }

}
