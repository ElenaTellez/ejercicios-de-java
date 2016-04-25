/**
 * Buscando Capicuas
 * 
 * Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga 
 * lo que se especifica  * en los comentarios (puedes incluirla en tu propia biblioteca
 * de rutinas):
 * 
 * public int[ ] filtraCapicuas(int x[ ]) 
 * 
 * Devuelve un array con todos los números capicúa que se encuentren en otro array 
 * que se pasa como parámetro.
 * Obviamente el tamaño del array que se devuelve será menor o igual al que se pasa 
 * como parámetro. Utiliza esta función en un programa para comprobar que funcionan bien.
 * Para que el ejercicio resulte más fácil, las repeticiones de números capicúa se conservan;
 * es decir, si en el array x el número 505 se repite 3 veces, en el array devuelto 
 * también estará repetido 3 veces. Si no existe ningún número
 * capicúa en x, se devuelve un array con el número -1 como único elemento.
 * 
 * @author Elena Tellez
 */
public class filtraCapicuas {
  public static void main(String[] args) {
  
  
  int x[]= new int [20];
  
  x = generaArrayUni(x);
  
  System.out.println("Array original: ");		
	
  muestraArrayInt(x);
 
  System.out.println("Numeros capicuas del array anterior: "); 
  
  muestraArrayInt(filtraCapicuas(x));
     
  }  
/**
* 
* Genera funcion que reciba como parametro array unidimensional y devuelva array 
* solo de los numeros capicúas encontrados. En caso de que solo sea de numeros no capicuas el array 
* devolvera -1. Ademas los arrays de entrada y retorno pueden ser de distinto tamaño.
* 
* @param un array de una dimension
* @return array con los numeros pares que contiene o -1 si no contiene
*/	

  public static int[] filtraCapicuas(int x[]) {
  
    int capicuas[] = new int [x.length];
    int i;
    int capicua = 0;
    int sincapicuas[] = new int [x.length];
    int sincapicua = 0;
    int sinCap[]= {-1};
    
    
    for (i = 0; i < x.length; i++) {
      // Separa los números metiendo los capicuas en un array
      // y los no capicua en otro.
      if (x[i]  == voltea(x[i])) {
        capicuas[capicua++] = x[i];        
      } else {
        sincapicuas[sincapicua++] = x[i];
      }   
          
     }
     
     int capiDef[]= new int [capicua];
     
     for (i = 0; i < capicua; i++) {
		 capiDef[i] = capicuas[i];
		}
    
		if (sincapicua == x.length){
			return sinCap;
		} else {    
		return capiDef;  
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
		      arrayUni[i] = (int)((Math.random()*800)+100);
		    }
		     
		return arrayUni;
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
}

