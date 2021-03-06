/**
 * Ejercicio 18 Lección 5
 * 
 * Escribe un programa que obtenga los números enteros comprendidos entre dos números
 * introducidos por teclado y validados como distintos, el programa debe empezar por el
 * menor de los enteros introducidos e ir incrementando de 7 en 7.
 * 
 * @author Elena Téllez
 */

public class Ejercicio1805 {

  public static void main(String[] args) {
    
    System.out.println("Por favor introduzca un número.");
    int x = Integer.parseInt(System.console().readLine());
    System.out.println("Por favor introduzca un número distinto al anterior.");
		int y = Integer.parseInt(System.console().readLine());   
    
    int serie = x;
    int serieDos = y;
    
    System.out.println("Los números comprendidos incrementados de 7 en 7 entre los introducidos son:"); 
    
    if ((x < y) && (x !=y)) {
      do {
        
        System.out.print("\n " + serie ); 
        serie +=7;    // esto es igual que serie = serie + 7 
      } while (serie <= y); 
    } 
    
    if ((x > y) && (x != y)) {
      do {        
        System.out.print("\n" + serieDos ); 
        serieDos +=7;     
      } while (serieDos <= x); 
    }
    
    if (x == y) {
        System.out.print("Los números introducidos son iguales."); 
    }
  }
}

