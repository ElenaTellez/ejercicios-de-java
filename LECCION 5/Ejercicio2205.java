/**
 * Ejercicio 22 Lección 5
 * 
 * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
 * 
 * @author Elena Téllez
 */
public class Ejercicio2205 {

	public static void main(String[] args) {
		
		System.out.println("Los números primos comprendidos entre 2 y 100 son: ");

		int num;
		boolean primo = true;
		int i;
			
			for(num=3;num<=100;num++){ 		
					
				primo = true;
				for (i = 2; i < num; i++) { // para cada número, calcularemos si es primo	
					if (num%i == 0) primo = false;
					}				
									
				if (primo){
						System.out.println(num+(" "));	 
				}
			}
			System.out.println();
	}	
}
