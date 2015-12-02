/**
 * Examen A
 * 
 * Ejercicio 4
 * 
 * Escribe un programa que rellene un array con 10 números aleatorios (números entre 0 y 100) y que luego cree
 * otro array con esos mismos números “barajados”, es decir, reordenados de forma aleatoria. Puede haber
 * números repetidos en el array original.
 * 
 * @Fecha 03/12/1993
 *
 * @author Juan Jose Fernandez Romero 
 */

public class Ex11jjfr4 {
	public static void main(String[] args) {
		
		int[] num = new int [10];
		int i = 0;
		int temp = 0;
		int x = 0;
		int y = 0;
		
		System.out.println ("Este programa rellena un array con 10 numeros y luego muestra otro array barajado");
		
		for (i = 0; i < 10; i++) 
			num[i] = (int)(Math.random() * 101);
			
		System.out.println ("\n\nArray original:");
		System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
		System.out.print("│ Valor  ");
		for (i = 0; i < 10; i++) System.out.printf("│%4d ", num[i]);
		System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
			
		for (i = 0; i < 500; i++) {
			x = (int)(Math.random() * 10);
			y = (int)(Math.random() * 10);			
			temp = num[x];
			num[x] = num[y];
			num[y] = temp;	
		}
		
		System.out.println ("\n\nArray barajado:");
		System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
		System.out.print("│ Valor  ");
		for (i = 0; i < 10; i++) System.out.printf("│%4d ", num[i]);
		System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

	}
}
