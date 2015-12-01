/**
 * Pinta un árbol de Navidad mediante un programa. El follaje del árbol estará hecho con el carácter ^ y estará
 * adornado con estrellas (asterisco) y bolas (letra O). En la cúspide del árbol siempre habrá una estrella y el
 * relleno del árbol se pintará de forma aleatoria en función del siguiente patrón: la probabilidad de encontrar un
 * adorno sobre el follaje es de 1 sobre 3. En caso de pintar un adorno, la probabilidad de que sea una bola es de
 * 2/3 y de que sea una estrella es de 1/3. La estrella de la cúspide se cuenta en la altura. Se debe verificar que
 * ésta última es mayor o igual que 4.
 * Ejemplo:
 * Por favor, indique la altura del árbol de Navidad: 6
 * 
 * @author Elena Téllez
 */

public class ArbolNavidad {

  public static void main(String[] args) {
    
    System.out.println("Vamos a dibujar un  Arbol de Navidad. ");
    System.out.println("Por favor, introduzca la altura que desee que tenga su árbol");
    int altura = Integer.parseInt(System.console().readLine());
    
    
		int i = 0;    
		int tamaño = 2; //pisos de la piramide
		int espacios = altura-1; //el lugar del primer caracter sera igual a la altura elegida -1 del caracter
		String relleno = "";
		
		for (int j = 0; j <= altura ; j++) {
				System.out.print(" ");   // inserta espacios
			}
			System.out.print("*");
			System.out.println();
		
    
		while (tamaño <= altura) {   //el numero de filas, las veces que entro en el bucle, ser igual a la altura elegida
       
			for (i = 0; i <= espacios; i++) {
				System.out.print(" ");   // inserta espacios
			}
      
          
			
			for (i = 0; i <(tamaño * 2) - 1; i++) { //aumento el numero de caractares cada vez entro en el bucle
		  
		  
		  
		  switch ((int)(Math.random()*8)){ //genera el carácter de relleno
          
          case 0:
            relleno = "^";
          case 1:
            relleno = "^";
          case 2:
            relleno = "^";
          case 3:
            relleno = "^";
          case 4:
            relleno = "^";
          case 5:
            relleno = "^";
            break; 
            
          case 6:
            relleno = "o";
          case 7:
            relleno = "o";
            break; 
            
          case 8:
            relleno = "*";
            break;       
            
            default:
        
        }     
        
		 System.out.print(relleno); // inserta relleno
        
      }
      
			
			
			System.out.println(); //es necesario para dar orden a los bucles. 
			
			tamaño++; //contador, veces que entro en el bucle. 
			espacios--; //reduzco el numero de espacios porque inserto mas caracteres
    }
  }
}
