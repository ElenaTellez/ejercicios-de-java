/**
 * Ejercicio 25 Lección 5
 * 
 * Realiza un programa que pida un número por teclado y que luego muestre ese número al
 * revés.
 * 
 * @author Elena Téllez
 */
public class Ejercicio2505 {

  public static void main(String[] args) {  
   
           
    System.out.print("Por favor introduzca un número: ");
    int numero = Integer.parseInt(System.console().readLine());
		int digito = 0;
		
		System.out.println("El número introducido al revés es: ");
		
    do  {   		    
			digito = numero %10; // reservo la primero cifra del numero introducido
      System.out.print(digito); // muestra la primera cifra, despues la segunda, etc...
      numero /= 10; //entro en el bucle mientras el numero introducido sea mayor que 0
    }    while (numero > 0);             
  }
}
