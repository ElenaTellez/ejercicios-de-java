/**
 * Realiza un programa que pida 10 números por teclado y que los almacene en un array. A continuación
 * se debe mostrar el contenido de ese array junto al índice (0 – 9). Seguidamente el programa debe 
 * colocar en las últimas posiciones los números que terminen en 7 dejando el resto en las primeras
 * posiciones.
 * @author ElenaTellez
 */
public class EjercicioExamen2 {

  public static void main(String[] args) {

    int[] numeros; 
    numeros = new int[10];
    int numPares = 0;
    int numImpares = 0;
    int indice=9;
    int aux=0;
    int aux2=0;
    
    System.out.print("Array original ");
      for (int i=0; i<numeros.length;i++){           
           numeros[i] = (int)(Math.random()*101);
           System.out.print(numeros[i]+" ");
      }
  
     do{
        if (numeros[indice]%10==7){
          indice--;
        }else{
          aux = numeros[indice];
          numeros[indice] = numeros[numImpares];
          numeros[numImpares] = aux;
          numImpares++;
          
        }
       
       
     }while(indice!=numImpares);
    
     
          System.out.println();
     System.out.print("Array cambiado "); 
    for (int i=0; i<10; i++){
      System.out.print(numeros[i]+" ");
    }
          
          
  }
  
}




