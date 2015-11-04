/**
* Ejercicio 10 Leccion 6
*
* Realiza un programa que pinte por pantalla diez líneas formadas por caracteres. El carácter
* con el que se pinta cada línea se elige de forma aleatoria entre uno de los siguientes: *, -, =,
* ., |, @. Las líneas deben tener una longitud aleatoria entre 1 y 40 caracteres.
*
* @author Elena Téllez
*/

public class Ejercicio1006 {
  public static void main(String[] args) {

    
    String caracter = "";
    
        
   	for (int i = 1; i <= 10; i++) {    
			
			int relleno = ((int)(Math.random()*6)+1);
			
			
			switch (relleno) {
				
					case 1:
					caracter = ("*");
					break;
					
					case 2:
					caracter = ("-");
					break;
					
					case 3:
					caracter = ("=");
					break;
					
					case 4:
					caracter = (".");
					break;
					
					case 5:
					caracter = ("|");
					break;
					
					case 6:
					caracter = ("@");
					break;				
					default:
				}
				int longitud = ((int)(Math.random()*40)+1);
				for (int j = 1; j <=longitud; j++) { //pinta lineas
					System.out.print(caracter);
				}	
				System.out.println();
			}
	}  
}
