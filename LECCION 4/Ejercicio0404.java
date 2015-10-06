/**
 * Ejercicio 4 Leccion 4: Lectura de datos desde teclado
 *
 * Vamos a ampliar uno de los ejercicios de la relación anterior para considerar las horas
 * extras. Escribe un programa que calcule el salario semanal de un trabajador teniendo en 
 * cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora.
 * A partir de la hora 41, se pagan a 16 euros la hora.
 *
 * @author Elena Téllez
 */

public class Ejercicio0404 {
  public static void main(String[] args) {

    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    int horas = Integer.parseInt(System.console().readLine());
    
    int horasTrabajadas = 0;
    
    if (horas <= 40){
	horasTrabajadas = horas * 12;
	System.out.println("Su salario semanal es de " + horasTrabajadas + " euros.");
	}
				
	if (horas > 40){
	horasTrabajadas = (horas - 40) * 16;
	System.out.println("Su salario semanal es de " + (horasTrabajadas + 480) + " euros.");
	}
    
	} 
}
