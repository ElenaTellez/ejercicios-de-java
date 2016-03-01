/**
 * Dibujar Pecera
 * 
 * Realiza un programa que pinte por pantalla una letra U
 * 
 * @author Elena Téllez
 */

public class Ex30metsp02 {

  public static void main(String[] args) {
		
		System.out.println("Vamos a dibujar la letra U.");
		System.out.println("Por favor, introduzca la altura que desee que tenga: ");
		int altura = Integer.parseInt(System.console().readLine()); 
		
		   	
 
  
		String simbolo = "*";		
		int espaciosInteriores = altura - 2;		
		  
    for (int i = 0; i < altura-1; i++) {
			
			System.out.print(simbolo); 
			
			for (int j = 0; j < espaciosInteriores; j++) { 
				
				 
				System.out.print(" ");	
					
				}	
			System.out.print(simbolo);  
      System.out.println (); 		
			
			}	
			
      	
			
    System.out.print(" ");
     
    for (int k = 0; k < (altura-2); k++) {   
      
      System.out.print(simbolo);
                   
      
    }                
    
     
   
	
  }
}
