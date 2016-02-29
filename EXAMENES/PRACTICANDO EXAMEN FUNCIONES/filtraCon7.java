
/**
 * Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga lo que se especifica
 * en los comentarios (puedes incluirla en tu propia biblioteca de rutinas):
 * public int[ ] filtraCon7(int x[ ])
 * Devuelve un array con todos los números que contienen el 7
 * (por ej. 7, 27, 370, 782...) que se encuentren en otro array
 * que se pasa como parámetro.
 * Obviamente el tamaño del array que se devuelve será menor o
 * igual al que se pasa como parámetro.
 * Utiliza esta función en un programa para comprobar que funcionan bien. Para que el ejercicio resulte
 * más fácil, las repeticiones de números que contienen 7 se conservan; es decir, si en el array x el
 * número 875 se repite 3 veces, en el array devuelto también estará repetido 3 veces. Si no existe
 * ningún número que contiene 7 en el array x, se devuelve un array con el número -1 como único
 * elemento.
 * @author Elena Téllez
 */
public class filtraCon7 {
  
	public static void main(String[] args) {
  
  
	int x[]= new int [20];
  
	x = generaArrayUni(x);
  
	System.out.println("Array original: ");		
	
	muestraArrayInt(x);
 
	System.out.println("Numeros con 7 del array anterior: "); 
  
	muestraArrayInt(filtraCon7(x));
     
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

  public static int[] filtraCon7(int x[]) {
  
    int filtrado[] = new int [x.length];
    int i;
    int siete = 0;
    int sinSietes[] = new int [x.length];
    int sinSiete = 0;
    int sinSie[]= {-1};
    
    
    for (i = 0; i < x.length; i++) {
      // Separa los números metiendo los numeros con 7 en un array
      // y los sin siete en otro.
      if (x[i]  == posicionDeDigito(x[i], 7)) {
        filtrado[siete++] = x[i];        
      } else {
        sinSietes[sinSiete++] = x[i];
      }   
          
     }
     
     int sieteDef[]= new int [siete];
     
     for (i = 0; i < siete; i++) {
		 sieteDef[i] = filtrado[i];
		}
    
		if (sinSiete == x.length){
			return sinSie;
		} else {    
		return sieteDef;  
		} 
    
  }
  
/**
   * Muestra por pantalla todos los elementos de un array de números enteros
   * separados por un espacio.
   * 
   * @param x array unidimiensional de números enteros
   */
  public static void muestraArrayInt(int x[]) {
    for (int n : x) {
      System.out.print(n + " ");
    }
    System.out.println();
  }
/**
* generaArrayInt: Genera un array de tamaño n con numeros aleatorios
* 
* @paran array
* @return genera array unidimensinal e imprime
*/	

	public static int[] generaArrayUni(int x[]) {
		
		int arrayUni[] = new int[x.length];
		
		 for(int i = 0; i < x.length; i++) {
		      arrayUni[i] = (int)((Math.random()*100)+1);
		    }
		     
		return arrayUni;
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
 
  /** Devuelve el dígito que está en la posición <code>n</code> de un número
   * entero. Se empieza contando por el 0 y de izquierda a derecha.
   *
   * @param x número entero
   * @param n posición dentro del número <code>x</code>
   * @return  dígito que está en la posición n del número <code>x</code>
   *          empezando a contar por el 0 y de izquierda a derecha
   */
  public static int digitoN(long x, int n) {
    x = voltea(x);

    while (n-- > 0) {
      x = x / 10;
    }

    return (int)x % 10;
  }

  /**
  /* Devuelve el dígito que está en la posición n de un número entero. Se
   * empieza contando por el 0 y de izquierda a derecha.
   *
   * @param x número entero
   * @param n posición dentro del número <code>x</code>
   * @return  dígito que está en la posición n del número <code>x</code>
   *          empezando a contar por el 0 y de izquierda a derecha
   */
  public static int digitoN(int x, int n) {
    return digitoN((long)x, n);
  }

  /**
   * Da la posición de la primera ocurrencia de un dígito dentro de un número
   * entero. Si no se encuentra, devuelve -1.
   *
   * @param x número entero
   * @param d dígito a buscar dentro del número
   * @return  posición de la primera ocurrencia del dígito dentro del número o
   *          -1 si no se encuentra
   */
  public static int posicionDeDigito(int x, int d) {
    int i;

    for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};

    if (i == digitos(x)) {
      return -1;
    } else {
      return x;//para que devuelva posicion es i pero la modifico para que devuelva numero
    }
  }
   
}


