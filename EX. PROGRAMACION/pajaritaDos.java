/**
* Preparando examen
*
* dibujar una pajarita
*
* @author Elena Téllez
*/

public class pajaritaDos {
  public static void main(String[] args) {

   System.out.print("Vamos a dibujar una pirámide.\n ");
    System.out.print("Por favor, introduzca la altura que desee que tenga la pirámide.\n ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca el carácter que dibuje su pirámide.\n ");
    String relleno = (System.console().readLine());
    
    int i = 0;    
    int tamaño = 0; //pisos de la piramide
	int espacios = (altura/2) + 2;
	int espaciosDos =  (altura/2) - 4; 
	int tamañoDos = (altura/2) + 2;
  
		//parte de arriba de la pajarita
		
		while (tamaño/2 < (altura/2)-2) {   //el numero de filas, las veces que entro en el bucle, ser igual a la altura elegida
   
			for (i = 0; i < tamaño; i++) { //aumento el numero de caractares cada vez entro en el bucle
				System.out.print(relleno); // inserta relleno
			}
			
			for (i = 1; i < espacios*2; i++) {
				System.out.print(" ");   // inserta espacios
				
			}
			for (i = 0; i < tamaño; i++) { //aumento el numero de caractares cada vez entro en el bucle
				System.out.print(relleno); // inserta relleno
			}
      
			System.out.println(); //es necesario para dar orden a los bucles.
	
			tamaño++; //contador, veces que eentro en el bucle. 
			espacios--; //reduzco el numero de espacios porque inserto mas caracteres
			}
    
		for (i = 0; i < altura + 2; i++) {   
      
      System.out.print(relleno); //Imprime linea intermedia              
      
		}
		
		System.out.println();
    
		//parte de abajo de la pajarita
    
		for (i = (altura-1)/2; i >= 0; i--)  {
	

			for(int j = tamañoDos ; j > 1; j--) { // Mostramos los asteriscos

			System.out.print(relleno);

			}
       
			for (int l = 1 ; l <=(espaciosDos*2)-3 ; l++) { //aumento el numero de caractares cada vez entro en el bucle
				System.out.print(" "); // inserta relleno
			}
			
			for(int m = 1 ; m < tamañoDos; m++) {

			System.out.print(relleno);
          
			}
			tamañoDos--;
			
			espaciosDos++;
 
       
			System.out.println();

			} 
       

    
	}
}
