/**
 * Realiza un programa que pida 10 números enteros por teclado y que luego diga cuántos de esos
 * números son capicúa. Los números capicúa son los que se leen igual hacia delante y hacia atrás. Los
 * capicúa repetidos también cuentan.
 *
 * @author Elena Tellez
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    System.out.println("Este determina si un número es o no capicúa");
    
    int contador = 0;  
    
    for (int i = 0; i < 10; i++) {
		
	System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());	
    
    long numero = numeroIntroducido;
    long vuelta = 0;
    
    
		while (numero > 0) {
		  vuelta = (vuelta * 10) + (numero % 10);
		  numero /= 10;
		  
		}
		
		if (vuelta == numeroIntroducido) {
		  System.out.println("El número introducido es capicúa.");
		} else {
		
		System.out.println("El número introducido no es capicúa.");
		
		}
		
		contador++;
		
	}
	
	
	System.out.println("Ha introducido " + contador + " números capicúa.");
  }
}
	
