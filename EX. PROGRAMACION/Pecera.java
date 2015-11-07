/**
 * Dibujar Pecera
 * 
 * Realiza un programa que pinte por pantalla una pecera con un pececito dentro. Se debe pedir al
 * usuario el ancho y el alto de la pecera, que como mínimo serán de 4 unidades. No hay que comprobar
 * que los datos se introducen correctamente; podemos suponer que el usuario los introduce bien.
 * Dentro de la pecera hay que colocar de forma aleatoria un pececito, que puede estar situado en
 * cualquiera de las posiciones que quedan en el hueco que forma el rectángulo.
 * Ejemplo:
 * Por favor, introduzca la altura de la pecera (como mínimo 4): 4
 *  Ahora introduzca la anchura (como mínimo 4): 7
 * 
 * @author Elena Téllez
 */

public class Pecera {

  public static void main(String[] args) {
		
		System.out.println("Vamos a dibujar una Pecera.");
		System.out.println("Por favor, introduzca la altura que desee que tenga la pecera: ");
		int altura = Integer.parseInt(System.console().readLine()); 
		
		System.out.println("Por favor, introduzca el ancho que desee que tenga la pecera: ");
		int ancho = Integer.parseInt(System.console().readLine());   	
 
  
		String simbolo = "#";
		
		int espaciosInteriores = ancho - 2;		
		int uno = ((int)(Math.random()*ancho) + (ancho - 2));		
		int dos = ((int)(Math.random()*altura) + (altura - 2)); 
		boolean coinciden = true;
		
		        
    for (int i = 0; i < ancho; i++) {   
      
      System.out.print(simbolo); //Imprime primera linea pecera               
      
    }
    
    System.out.println ();
      
    for (int i = 0; i < altura - 2 ; i++) {
			
			System.out.print(simbolo); 
			
			for (int j = 0; j < espaciosInteriores; j++) { //espacios interiores			
				
				 
				if (uno == dos) {
					
					System.out.print("@");
					
				} else  {
					System.out.print("l");	
					
				}	
			 		
			
			}	
			System.out.print(simbolo); 
			 
		System.out.println ();	
			
    }
     
    for (int i = 0; i < ancho; i++) {   
      
      System.out.print(simbolo); //Imprime ultima linea pecera               
      
    }                
     
   
	
  }
}
