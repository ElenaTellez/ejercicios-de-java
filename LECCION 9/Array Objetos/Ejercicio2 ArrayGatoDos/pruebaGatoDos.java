/**
 * 
 * Ejercicio 2
 * 
 * Cambia el programa anterior de tal forma que los datos de los gatos se intro-
 * duzcan directamente en el código de la forma gatito[2].setColor(“marrón”) o bien
 * mediante el constructor, de la forma gatito[3] = new Gato(“Garfield”, “naranja”,
 * “macho”) . Muestra a continuación los datos de todos los gatos utilizando un
 * bucle.
 * 
 * @author Elena Téllez
 * 
 */

public class pruebaGatoDos {
  public static void main(String[] args) {
    
       gatoDos[] gato = new gatoDos[4];

    int i;

    gato[0] = new gatoDos("Garfield", "naranja", "mestizo");
    gato[1] = new gatoDos("Pepe", "gris", "angora");
    gato[2] = new gatoDos("Mauri", "blanco", "manx");
    gato[3] = new gatoDos("Ulises", "marrón", "persa");

    System.out.println("\nDatos de los gatos.");
    
    for (i = 0; i < 4; i++) {
      System.out.println("\nGato nº" + (i + 1));
      System.out.println("Nombre: " + gato[i].getNombre());
      System.out.println("Color: " + gato[i].getColor());
      System.out.println("Raza: " + gato[i].getRaza());
    }
  }
}  

