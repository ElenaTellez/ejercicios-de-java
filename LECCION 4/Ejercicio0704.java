/**
 * Ejercicio 7 Leccion 4
 *
 * Realiza un programa que calcule la media de tres notas.
 *
 * @author Elena Téllez
 */
public class Ejercicio0704 {

	public static void main(String[] args) {

    System.out.println("Por favor, introduzca la nota de su primer examen\n");    
    Double a = Double.parseDouble(System.console().readLine());    
    System.out.println("Por favor, introduzca la nota de su segundo examen\n");
	Double b = Double.parseDouble(System.console().readLine());    
	System.out.println("Por favor, introduzca la nota de su tercer examen\n");  
    Double c = Double.parseDouble(System.console().readLine());  
    
    double media = (a + b + c) / 3;  
    
    System.out.printf("Su nota media es %.2f.\n", media);
  }
}
