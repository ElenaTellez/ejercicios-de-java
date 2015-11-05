/**
* Ejercicio 11 Leccion 6
*
* Escribe un programa que muestre 20 notas generadas al azar. Las notas deben aparecer de
* la forma: suspenso, suficiente, bien, notable o sobresaliente. Al final aparecerá el número
* de suspensos, el número de suficientes, el número de bienes, etc.
*
* @author Elena Téllez
*/

public class Ejercicio1106 {
  public static void main(String[] args) {

    String puntuacion = "";
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
        
   	for (int i = 1; i <= 20; i++) {
			
			int notas = (int)(Math.random()*5);
			
			switch (notas) {
				
					case 0:
					puntuacion = ("suspenso");
					suspenso++;
					break;
					
					case 1:
					puntuacion = ("suficiente");
					suficiente++;
					break;
					
					case 2:
					puntuacion = ("bien");
					bien++;
					break;
					
					case 3:
					puntuacion = ("notable");
					notable++;
					break;
					
					case 4:
					puntuacion = ("sobresaliente");
					sobresaliente++;
					break;
					default:
		 
				}
				
				System.out.println(puntuacion);
	
			}
			System.out.println("\nEl número de suspensos es: " + suspenso);
			System.out.println("El número de suficientes es: " + suficiente);
			System.out.println("El número de bien es: " + bien);
			System.out.println("El número de notables es: " + notable);
			System.out.println("El número de sobresalientes es: " + sobresaliente);
	}  
}
