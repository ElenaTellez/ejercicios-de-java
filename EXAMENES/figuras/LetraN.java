
/**
 * Realiza un programa que pinte la letra N hecha de asteriscos. El programa debe pedir la altura de la
 * letra, que deberá ser un número mayor o igual que 4. En caso de que el usuario introduzca un número
 * no válido, se mostrará un mensaje de error.
 * Ejemplo:
 * Por favor, introduzca la altura de la N: 5
 * 
 * @author Elena Téllez
 */

public class LetraN {

  public static void main(String[] args) {
	  
	System.out.println("Vamos a dibujar una letra N. ");
    System.out.println("Por favor, introduzca la altura que desee que tenga.");
    int altura = Integer.parseInt(System.console().readLine());
    
    
		for (int j = 1; j <= altura ; j++) {
			System.out.print("#");
			
			for (int i = 1; i <= altura/2; i++) {
			
			System.out.print("p");   // inserta espacios
			}
			for (int k = 1; k <= altura/2; k++) {
			
			System.out.print("#"); 
			
			}	
				
						
			
			System.out.print("#");
			System.out.println();
		}	
	}
}			
