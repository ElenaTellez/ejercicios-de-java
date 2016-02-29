/**
 * Buscando pares e impares
 * @author Elena Tellez
 */
public class extraePares {
  public static void main(String[] args) {
  
  
	
  int x[]= new int [20];
  
  x = generaArrayUni(x);
  
  System.out.println("Array original: ");		
	
  muestraArrayInt(x);
 
  System.out.println("Numeros pares del array anterior: "); 
  
  muestraArrayInt(extraePares(x));
  
  int otro[]= new int [20];
  otro = generaArrayImp(otro);
  
  System.out.println("Array original de numeros impares: ");		
	
  muestraArrayInt(otro);
 
  System.out.println("Numeros pares del array anterior: "); 
  
  muestraArrayInt(extraePares(otro));
  
  
  }  
/**
* 
* Genera funcion que reciba como parametro array unidimensional y devuelva array 
* solo de los numeros pares encontrados. En caso de que solo sea de numeros impares el array 
* devolvera -1. Ademas los arrays de entrada y retorno pueden ser de distinto tamaño.
* 
* @param un array de una dimension
* @return array con los numeros pares que contiene o -1 si no contiene
*/	

  public static int[] extraePares(int x[]) {
  
    int par[] = new int [x.length];
    int impar[] = new int [x.length];
    int i;
    int pares = 0;
    int impares = 0;
    int sinpar[]= {-1};
    
    
    for (i = 0; i < x.length; i++) {
      // Separa los números metiendo los pares en un array
      // y los impares en otro.
      if (x[i] % 2 == 0) {
        par[pares++] = x[i];        
      } else {
        impar[impares++] = x[i];
      }    
          
     }
     
     int parDef[]= new int [pares];
     
     for (i = 0; i < pares; i++) {
		 parDef[i] = par[i];
		}
    
		if (impares == x.length){
			return sinpar;
		} else {    
		return parDef;  
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
* generaArrayInt: Genera un array de tamaño n con numeros aleatorios
* 
* @paran array
* @return genera array unidimensinal
*/	

	public static int[] generaArrayImp(int x[]) {
		
		int arrayUni[] = new int[x.length];
		
		 for(int i = 0; i < x.length; i++) {
		      arrayUni[i] = (int)((Math.random()*1)+1);
		    }
		     
		return arrayUni;
	}  
}
