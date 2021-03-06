package examenes;

import java.util.Scanner;

/**
 *
 * @author Elena Téllez
 */
public class letraNif {
  
  public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
	
  System.out.print("Introduzca su numero de DNI: ");		
	
	int numero = 	 sc.nextInt();
  
  System.out.print("La letra que le corresponde a su numero de DNI es: "+letraNIF(numero));
  
  System.out.println();
  
  sc.close();	
  }  
/**
* 
* Utiliza esta función en un programa para comprobar que funciona bien. 
* La letra del NIF se obtiene aplicando la operación de módulo 23
* (resto de la división entera entre 23) al número del DNI. 
* El resultado es un número comprendido entre el 0 y el 22.
* En base a la siguiente tabla se asigna la letra.
* 
* @param numero de DNI
* @return letra que le corresponde
*/	

  public static String letraNIF(int numero) {
   
    int resto = numero%23;
    
    String nif[]= {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z",
      "S","Q","V","H","L","C","K","E"};    
    
    String letra = nif[resto];
    
    return letra;
  } 
}
