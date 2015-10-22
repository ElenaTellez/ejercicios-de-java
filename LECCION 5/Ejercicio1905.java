/**
 * Ejercicio 19 Leccion 5
 * 
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe pedir por
 * teclado. El carácter con el que se pinta la pirámide también se debe pedir por teclado.
 * 
 * @author Elena Téllez
 */

public class Ejercicio1905 {

  public static void main(String[] args) {
    
    System.out.print("Vamos a dibujar una pirámide.\n ");
    System.out.print("Por favor, introduzca la altura que desee que tenga la pirámide.\n ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca el carácter que dibuje su pirámide.\n ");
    String relleno = (System.console().readLine());
    
    int i = 0;    
    int tamaño = 1; //pisos de la piramide
		int espacios = altura-1; //el numero del primer caracter sera igual a la altura elegida -1 del caracter
		
		while (tamaño <= altura) {   //el numero de filas, las veces que entro en el bucle, ser igual a la altura elegida
       
			for (i = 1; i <= espacios; i++) {
				System.out.print(" ");   // inserta espacios
      }

			for (i = 1; i < tamaño * 2; i++) { //aumento el numero de caractares cada vez entro en el bucle
				System.out.print(relleno); // inserta relleno
			}
      
			System.out.println(); //es necesario para dar orden a los bucles. 
			
			tamaño++; //contador, veces que eentro en el bucle. 
			espacios--; //reduzco el numero de espacios porque inserto mas caracteres
    }
  }
} 

