/**
 * Ejercicio 24 Leccion 5
 * 
 * Escribe un programa que lea un número n e imprima una pirámide de números con n filas
 * como en la siguiente figura:
 *   1
 *  121
 * 12321
 *1234321
 * 
 * @author Elena Téllez
 */

public class Ejercicio2405 {

  public static void main(String[] args) {
    
    System.out.print("Vamos a dibujar una pirámide.\n ");
    System.out.print("Por favor, introduzca la altura que desee que tenga la pirámide.\n ");
    int altura = Integer.parseInt(System.console().readLine());
    
    
    
    int i = 0;    
    int tamaño = 1; //pisos de la piramide
		int espacios = altura-1; //el numero de espacios del primer caracter sera igual a la altura elegida -1 del caracter

    int j = 0;
    
		while (tamaño/2 <= altura) {   //el numero de filas, las veces que entro en el bucle, ser igual a la altura elegida
       
			for (i = 1; i <= espacios; i++) {
				System.out.print(" ");   // inserta espacios
      }

			for (i = 1; i < (tamaño * 2); i++) { //aumento el numero de caractares cada vez entro en el bucle
				
        System.out.print(i); // inserta relleno de media piramide
			} 
       
			System.out.println(); //es necesario para dar orden a los bucles.
			tamaño++; //contador, veces que entro en el bucle. 
			espacios--; //reduzco el numero de espacios porque inserto mas caracteres
    }
      
    while (tamaño*2 <= altura) {   //el numero de filas, las veces que entro en el bucle, ser igual a la altura elegida
       

			for (j = altura-1; j < (tamaño * 2); j--) { //aumento el numero de caractares cada vez entro en el bucle
				
        System.out.print(j); // inserta relleno
			}     
       
			
			tamaño++; //contador, veces que entro en el bucle. 
    }  
    
  }
}
