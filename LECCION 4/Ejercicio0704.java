/**
 * Ejercicio 7 Leccion 4
 *
 * Realiza un programa que calcule la media de tres notas.
 *
 * @author Elena Téllez
 */
public class Ejercicio0704 {

	public static void main(String[] args) {

    System.out.println("Este programa calcula la nota media de sus notas\n");
    System.out.println("Recuerde que solo son válidas las notas de 0 a 10\n");
    System.out.println("Por favor, introduzca la nota de su primer examen\n");    
    Double a = Double.parseDouble(System.console().readLine());    
    System.out.println("Por favor, introduzca la nota de su segundo examen\n");
	Double b = Double.parseDouble(System.console().readLine());    
	System.out.println("Por favor, introduzca la nota de su tercer examen\n");  
    Double c = Double.parseDouble(System.console().readLine());  
    
    double media = (a + b + c) / 3;
    
    if ((a >= 0) && (a <= 10) && (b >= 0) && (b <= 10) && (c >= 0) && (c <= 10)) {
		System.out.printf("Su nota media es %.2f.\n", media);
			} else {
			System.out.println("Los datos introducidos no son correctos");
			}
}
}
