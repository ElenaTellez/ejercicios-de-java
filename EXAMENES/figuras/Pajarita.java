/**
* Preparando examen
*
* dibujar una pajarita
*
* @author Elena Téllez
*/

public class Pajarita {
  public static void main(String[] args) {

   System.out.print("Vamos a dibujar una pirámide.\n ");
    System.out.print("Por favor, introduzca la altura que desee que tenga la pirámide.\n ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca el carácter que dibuje su pirámide.\n ");
    String relleno = (System.console().readLine());
    
    int i = 0;    
    int tamaño = 1; //pisos de la piramide
	int espacios = altura-1;
	int espaciosDos = altura + 1; //el numero del primer caracter sera igual a la altura elegida -1 del caracter
	int tamañoDos = altura - 1;
  
		while (tamaño <= altura) {   //el numero de filas, las veces que entro en el bucle, ser igual a la altura elegida
       
			//parte de arriba de la pajarita

			for (i = 1; i < tamaño * 2; i++) { //aumento el numero de caractares cada vez entro en el bucle
				System.out.print(relleno); // inserta relleno
			}
			
			for (i = 1; i <= (espacios *4); i++) {
				System.out.print(" ");   // inserta espacios
      }
      for (i = 1; i < tamaño * 2; i++) { //aumento el numero de caractares cada vez entro en el bucle
				System.out.print(relleno); // inserta relleno
			}
      
			System.out.println(); //es necesario para dar orden a los bucles.
	
			tamaño++; //contador, veces que eentro en el bucle. 
			espacios--; //reduzco el numero de espacios porque inserto mas caracteres
    }
    
    
    
    //parte de abajo de la pajarita
    
    for (i = altura; i > 1; i--) {
		
		
			  

      for(int j= tamañoDos * 2; j > 1; j--) { // Mostramos los asteriscos

          System.out.print(relleno);

       }
       
       for (int l = (espaciosDos *2) - 1; l >=1 ; l = l - ((altura/2) + 1)) { //aumento el numero de caractares cada vez entro en el bucle
				System.out.print(" "); // inserta relleno
			}
			
		for(int m = 1 ; m < tamañoDos * 2  ; m++) {

          System.out.print(relleno);
          
	  }
	  tamañoDos--;
			
			espaciosDos = (espaciosDos + altura) + 1;
 
       
			System.out.println();

       } 
       

    
}
} 
