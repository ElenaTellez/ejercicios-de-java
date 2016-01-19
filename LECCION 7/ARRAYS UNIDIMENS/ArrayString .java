/**
 * Ejemplo de uso de arrays
 * 
 * @author Luis José Sánchez
 */

public class ArrayString {
  public static void main(String[] args) {
        
    String[] color = {"verde", "rojo", "azul"};
        
    System.out.println("Mis colores:");
    System.out.println(color);
    
    for (int i = 0; i < color.length; i++) {
      System.out.println("que bonito es el " + color[i]);
    }
  }
}
