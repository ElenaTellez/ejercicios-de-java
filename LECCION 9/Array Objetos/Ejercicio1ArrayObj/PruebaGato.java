package Ejercicio1ArrayObj;
import java.util.Scanner;

/**
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos. 
 * PruebaCaballo.java
 * Programa que prueba la clase Caballo
 * @author Elena Téllez
 */

public class PruebaGato {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);		
    
    String nombreIntroducido;
    String razaIntroducida;
    String sexoIntroducido;
    
    Gato [] gatito = new Gato [4];
    
    for ( int i = 0; i < 4; i++) {
      gatito [i] = new Gato();
      System.out.println("Gatito " + i);
      
      System.out.print("Nombre: ");
      nombreIntroducido = sc.nextLine();
      (gatito[i]).setNombre(nombreIntroducido);
      
      System.out.print("Raza: ");
      razaIntroducida = sc.nextLine();
      (gatito[i]).setRaza(razaIntroducida);
      
      System.out.print("Sexo: ");
      sexoIntroducido = sc.nextLine();
      (gatito[i]).setSexo(sexoIntroducido);
    } // for i

System.out.println("Los datos introducidos son los siguientes:");

    for ( int i = 0; i < 4; i++) {
      System.out.println(gatito[i]);
    } // for i

  }

}
