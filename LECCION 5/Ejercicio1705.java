
/**
 * Ejercicio 17 Lección 5
 * 
 * Realiza un programa que sume los 100 números siguientes a un número entero y positivo
 * introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un
 * número positivo).
 * 
 * @author Elena Téllez
 */
public class Ejercicio1705 {

  public static void main(String[] args) {           
           
   
    System.out.print("Por favor, introduzca un numero entero y positivo: ");
    int n = Integer.parseInt(System.console().readLine());
    int suma = 0;
      
            
    if (n>=0) {
        
      for (int i=n; (i <= n+100); i++){
    
      suma = suma + i; //suma el valor a n y1 lo guarda, cuando vuelvo a entrar suma el valor guardado mas n incrementado en 1+1+1+1...   
        
      }   System.out.print((suma -n)+"\n");  
    }     
  }
}
