/**
 * Dibujar Serpiente
 * 
 * 
 * 
 * @author Elena Téllez
 */

public class Serpiente {

  public static void main(String[] args) {
		
		System.out.println("Vamos a dibujar una serpiente.");
		System.out.println("Por favor, introduzca el largo de la serpiente: ");
		int altura = Integer.parseInt(System.console().readLine()); 
		
		String relleno = "";
		 
		
		for (int j = 0; j <= 12 ; j++) {
				System.out.print(" ");   // inserta espacios
			}
			System.out.print("@");
			System.out.println();   
		 
		for (int k = 1; k <= altura-1; k++) {
		
			for (int i = 0; i <= 12; i++) { 
			
			System.out.print(" ");
			
			}
			switch ((int)(Math.random()*2)+1){  
			  
				case 1:
					relleno = "# ";
				break; 
					
				case 2:
					relleno = " #";
				break; 
								
				default:
			
				}   
	
		System.out.print(relleno);  
		System.out.println();     
	}   
		

  }
}
