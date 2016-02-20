package matematicas;



/**
* Funciones matematicas de proposito general
* 
* Ejercicios 1 - 14: Crea una biblioteca de funciones matemáticas que contenga las siguientes
* funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
*
* @author Elena Tellez
*/

 

public class funciones {

	  /**
	   * Devuelve verdadero si el n�mero que se pasa como par�metro es capic�a y
	     falso en caso contrario.
	   * <p>
	   * Un n�mero capic�a es el que se lee igual de izquierda a derecha que de
	   * derecha a izquierda.
	   * 
	   * @param x n�mero del que se quiere saber si es capic�a
	   * @return  verdadero si el n�mero que se pasa como par�metro es capic�a y
	   *          falso en caso contrario
	   */
	  public static boolean esCapicua(long x) {
	    return x == voltea(x);
	  }

	  /**
	   * Devuelve verdadero si el n�mero que se pasa como par�metro es capic�a y
	   * falso en caso contrario.
	   * <p>
	   * Un n�mero capic�a es el que se lee igual de izquierda a derecha que de
	   * derecha a izquierda.
	   *
	   * @param x n�mero del que se quiere saber si es capic�a
	   * @return  verdadero si el n�mero que se pasa como par�metro es capic�a y
	   *          falso en caso contrario
	   */
	  public static boolean esCapicua(int x) {
	    return esCapicua((long)x);
	  }

	  /**
	   * Devuelve verdadero si el n�mero que se pasa como par�metro es primo y falso
	   * en caso contrario.
	   * <p>
	   * Un n�mero es primo cuando es divisible �nicamente entre el mismo y entre 1.
	   *
	   * @param x n�mero del que se quiere saber si es primo
	   * @return  verdadero si el n�mero que se pasa como par�metro es primo y falso
	   *          en caso contrario
	   */
	  public static boolean esPrimo(int x) {
	    for (int i = 2; i < x; i++) {
	      if ((x % i) == 0) {
	        return false;
	      }
	    }
	    return true;
	  }

	  /**
	  /* Devuelve el menor primo que es mayor al n�mero que se pasa como par�metro.
	   *
	   * @param x un n�mero entero
	   * @return  el menor primo que es mayor al n�mero que se pasa como par�metro
	   */
	  public static int siguientePrimo(int x) {
	    while (!esPrimo(++x)) {};

	    return x;
	  }

	  /**
	   * Dada una base y un exponente, devuelve la potencia.
	   *
	   * @param base      base de la potencia
	   * @param exponente exponente de la potencia
	   * @return          n�mero resultante de elevar la base a la potencia indicada
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

	  /**
	   * Cuenta el n�mero de d�gitos de un n�mero entero.
	   *
	   * @param x n�mero al que se le quieren contar los d�gitos
	   * @return  n�mero de d�gitos que tiene el n�mero que se pasa como par�metro
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
	        x = x / 10; // se le quita un d�gito a x
	        n++; // incrementa la cuenta de d�gitos
	      }
	      return n;
	    }
	  }

	  /**
	   * Cuenta el n�mero de d�gitos de un n�mero entero.
	   *
	   * @param x n�mero al que se le quieren contar los d�gitos
	   * @return  n�mero de d�gitos que tiene el n�mero que se pasa como par�metro
	   */
	  public static int digitos(int x) {
	    return digitos((long)x);
	  }

	  /**
	   * Le da la vuelta a un n�mero.
	   *
	   * @param x n�mero al que se le quiere dar la vuelta
	   * @return  n�mero volteado (al rev�s)
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
	   * Le da la vuelta a un n�mero.
	   *
	   * @param x n�mero al que se le quiere dar la vuelta
	   * @return  n�mero volteado (al rev�s)
	   */
	  public static int voltea(int x) {
	    return (int)voltea((long)x);
	  }

	  /**
	  /* Devuelve el d�gito que est� en la posici�n <code>n</code> de un n�mero
	   * entero. Se empieza contando por el 0 y de izquierda a derecha.
	   *
	   * @param x n�mero entero
	   * @param n posici�n dentro del n�mero <code>x</code>
	   * @return  d�gito que est� en la posici�n n del n�mero <code>x</code>
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
	  /* Devuelve el d�gito que est� en la posici�n n de un n�mero entero. Se
	   * empieza contando por el 0 y de izquierda a derecha.
	   *
	   * @param x n�mero entero
	   * @param n posici�n dentro del n�mero <code>x</code>
	   * @return  d�gito que est� en la posici�n n del n�mero <code>x</code>
	   *          empezando a contar por el 0 y de izquierda a derecha
	   */
	  public static int digitoN(int x, int n) {
	    return digitoN((long)x, n);
	  }

	  /**
	   * Da la posici�n de la primera ocurrencia de un d�gito dentro de un n�mero
	   * entero. Si no se encuentra, devuelve -1.
	   *
	   * @param x n�mero entero
	   * @param d d�gito a buscar dentro del n�mero
	   * @return  posici�n de la primera ocurrencia del d�gito dentro del n�mero o
	   *          -1 si no se encuentra
	   */
	  public static int posicionDeDigito(long x, int d) {
	    int i;

	    for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};

	    if (i == digitos(x)) {
	      return -1;
	    } else {
	      return i;
	    }
	  }

	  /**
	   * Da la posici�n de la primera ocurrencia de un d�gito dentro de un n�mero
	   * entero. Si no se encuentra, devuelve -1.
	   *
	   * @param x n�mero entero
	   * @param d d�gito a buscar dentro del n�mero
	   * @return  posici�n de la primera ocurrencia del d�gito dentro del n�mero o
	   *          -1 si no se encuentra
	   */
	  public static int posicionDeDigito(int x, int d) {
	    return posicionDeDigito((long)x, d);
	  }

	  /**
	   * Le quita a un n�mero <code>n</code> d�gitos por detr�s (por la derecha). 
	   *
	   * @param x n�mero entero
	   * @param n n�mero de d�gitos que se le van a quitar
	   * @return  n�mero inicial <code>x</code> con <code>n</code> d�gitos menos
	   *          quitados de la derecha
	   */
	  public static long quitaPorDetras(long x, int n) {
	    return x / (long)potencia(10, n);
	  }

	  /**
	   * Le quita a un n�mero <code>n</code> d�gitos por detr�s (por la derecha). 
	   *
	   * @param x n�mero entero
	   * @param n n�mero de d�gitos que se le van a quitar
	   * @return  n�mero inicial <code>x</code> con <code>n</code> d�gitos menos
	   *          quitados de la derecha
	   */
	  public static int quitaPorDetras(int x, int n) {

	    return (int)quitaPorDetras((long) x, n);
	  }

	  /**
	   * Le quita a un n�mero <code>n</code> d�gitos por delante (por la izquierda).                                                 *
	   * @param x n�mero entero
	   * @param n n�mero de d�gitos que se le van a quitar
	   * @return  n�mero inicial <code>x</code> con <code>n</code> d�gitos menos
	   *          quitados de la izquierda
	   */
	  public static long quitaPorDelante(long x, int n) {
	    x = pegaPorDetras(x, 1); // "cierra" el n�mero por si acaso termina en 0
	    x = voltea(quitaPorDetras(voltea(x), n));
	    x = quitaPorDetras(x, 1);
	    return x;
	  }

	  /**
	   * Le quita a un n�mero <code>n</code> d�gitos por delante (por la izquierda).                                                 *
	   * @param x n�mero entero
	   * @param n n�mero de d�gitos que se le van a quitar
	   * @return  n�mero inicial <code>x</code> con <code>n</code> d�gitos menos
	   *          quitados de la izquierda
	   */
	  public static int quitaPorDelante(int x, int n) {
	    return (int)quitaPorDelante((long)x, n);
	  }

	  /**
	   * A�ade un d�gito a un n�mero por detr�s (por la derecha).
	   *
	   * @param x n�mero entero
	   * @param d d�gito que se le va a pegar por la derecha
	   * @return  n�mero inicial <code>x</code> con el d�gito <code>d</code> pegado
	   *          por la derecha
	   */
	  public static long pegaPorDetras(long x, int d) {
	    return juntaNumeros(x, d);
	  }

	  /**
	   * A�ade un d�gito a un n�mero por detr�s (por la derecha).
	   *
	   * @param x n�mero entero
	   * @param d d�gito que se le va a pegar por la derecha
	   * @return  n�mero inicial <code>x</code> con el d�gito <code>d</code> pegado
	   *          por la derecha
	   */
	  public static int pegaPorDetras(int x, int d) {
	    return (int)pegaPorDetras((long)x, d);
	  }

	  /**
	   * A�ade un d�gito a un n�mero por delante (por la izquierda).
	   *
	   * @param x n�mero entero
	   * @param d d�gito que se le va a pegar por la izquierda
	   * @return  n�mero inicial <code>x</code> con el d�gito <code>d</code> pegado
	   *          por la izquierda
	   */
	  public static long pegaPorDelante(long x, int d) {
	    return juntaNumeros(d, x);
	  }

	  /**
	   * A�ade un d�gito a un n�mero por delante (por la izquierda).
	   *
	   * @param x n�mero entero
	   * @param d d�gito que se le va a pegar por la izquierda
	   * @return  n�mero inicial <code>x</code> con el d�gito <code>d</code> pegado
	   *          por la izquierda
	   */
	  public static int pegaPorDelante(int x, int d) {
	    return (int)pegaPorDelante((long)x, d);
	  }

	  /**
	   * Toma como par�metros las posiciones inicial y final dentro de un n�mero y
	   * devuelve el trozo correspondiente.
	   * <p>
	   * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
	   *
	   * @param x      n�mero entero
	   * @param inicio posici�n inicial
	   * @param fin    posici�n final
	   * @return       trozo de n�mero compuesto por todos los d�gitos que van desde
	   *               la posici�n inicial a la posici�n final incluyendo ambos
	   */
	  public static long trozoDeNumero(long x, int inicio, int fin) {
	    int longitud = digitos(x);
	    x = quitaPorDelante(x, inicio);
	    x = quitaPorDetras(x, longitud - fin - 1);
	    return x;
	  }

	  /**
	   * Toma como par�metros las posiciones inicial y final dentro de un n�mero y
	   * devuelve el trozo correspondiente.
	   * <p>
	   * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
	   *
	   * @param x      n�mero entero
	   * @param inicio posici�n inicial
	   * @param fin    posici�n final
	   * @return       trozo de n�mero compuesto por todos los d�gitos que van desde
	   *               la posici�n inicial a la posici�n final incluyendo ambos
	   */
	  public static int trozoDeNumero(int x, int inicio, int fin) {
	    return (int)trozoDeNumero((long)x, inicio, fin);
	  }

	  /**
	   * Pega dos n�meros para formar uno solo.
	   *
	   * @param x trozo que se pegar� por la izquierda
	   * @param y trozo que se pegar� por la derecha
	   * @return  n�mero compuesto de los trozos <code>x</code> e <code>y</code>
	   */
	  public static long juntaNumeros(long x, long y) {
	    return (long)(x * potencia(10, digitos(y))) + y;
	  }

	  /**
	   * Pega dos n�meros para formar uno solo.
	   *
	   * @param x trozo que se pegar� por la izquierda
	   * @param y trozo que se pegar� por la derecha
	   * @return  n�mero compuesto de los trozos <code>x</code> e <code>y</code>
	   */
	  public static int juntaNumeros(int x, int y) {
	    return (int)(juntaNumeros((long)x, (long)y));
	  }
	}