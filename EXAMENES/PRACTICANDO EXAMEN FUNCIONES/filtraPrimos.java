/**
 * Funcion Filtra Primos
 * 
 * @author Elena Téllez
 */
public class filtraPrimos {  
  public static void main(String[] args) {
  
  
  int x[]= new int [20];
  
  x = generaArrayUni(x);
  
  System.out.println("Array original: ");		
	
  muestraArrayInt(x);
 
  System.out.println("Numeros capicuas del array anterior: "); 
  
  muestraArrayInt(filtraPrimos(x));
     
  }  
/**
* 
* Genera funcion que reciba como parametro array unidimensional y devuelva array 
* solo de los numeros primos encontrados. En caso de que no hay numeros primos el array 
* devolvera -1. Ademas los arrays de entrada y retorno pueden ser de distinto tamaño.
* 
* @param un array de una dimension
* @return array con los numeros pares que contiene o -1 si no contiene
*/	

  public static int[] filtraPrimos(int x[]) {
  
    int primos[] = new int [x.length];
    int i;
    int primo = 0;
    int sinPrimos[] = new int [x.length];
    int sinPrimo = 0;
    int sinPrim[]= {-1};
    
    
    for (i = 0; i < x.length; i++) {
      // Separa los números metiendo los primos en un array
      // y los no primos en otro.
      if (esPrimo(x[i])) {
        primos[primo++] = x[i];        
      } else {
        sinPrimos[sinPrimo++] = x[i];
      }   
          
     }
     
     int primDef[]= new int [primo];
     
     for (i = 0; i < primo; i++) {
		 primDef[i] = primos[i];
		}
    
		if (sinPrimo == x.length){
			return sinPrim;
		} else {    
		return primDef;  
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
		      arrayUni[i] = (int)((Math.random()*99)+1);
		    }
		     
		return arrayUni;
	}
    /**
   * Devuelve verdadero si el número que se pasa como parámetro es primo y falso
   * en caso contrario.
   * <p>
   * Un número es primo cuando es divisible únicamente entre el mismo y entre 1.
   *
   * @param x número del que se quiere saber si es primo
   * @return  verdadero si el número que se pasa como parámetro es primo y falso
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
  
}
