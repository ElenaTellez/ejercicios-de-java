/**
 * Dibujar Desposito de Agua
 * 
 * Realiza un programa que pinte por pantalla una cuba con cierta cantidad de agua. La capacidad será
 * indicada por el usuario. La cuba se llenará con una cantidad aleatoria de agua que puede ir entre 0 y
 * la capacidad máxima que pueda admitir. El ancho de la cuba no varía.
 * Ejemplo:
 * Por favor, indique la capacidad de la cuba en litros: 3
 * 
 * @author Elena Téllez
 */

public class Deposito {

  public static void main(String[] args) {
		
		System.out.println("Vamos a dibujar un deposito de agua.");
		System.out.println("Por favor, introduzca la capacidad del depósito: ");
		int altura = Integer.parseInt(System.console().readLine()); 
		
		int ancho = 6;
		String simbolo = "#";
		int espaciosInteriores = 4;//ancho - 2	 
		 
		int uno = ((int)(Math.random()*altura));	
		
	     
		for (int i = 0; i < uno; i++) {
			
			System.out.print(simbolo); 
			
			for (int j = 0; j < espaciosInteriores; j++) { //espacios interiores			
			
				
				System.out.print(" ");
				
				 
			}
			System.out.print(simbolo); 
			 
			System.out.println ();
		
		}
		
		for (int l = 0; l < (altura - uno); l++) {			
			
			System.out.print(simbolo); 
			
			for (int j = 0; j < espaciosInteriores; j++) { //espacios interiores			
			
				
				System.out.print("=");
				
				 
			}		 
		
			System.out.print(simbolo); 
			 
			System.out.println ();	
		}
			
				
			
			
    
        for (int i = 0; i < ancho; i++) {   
      
		System.out.print(simbolo); //Imprime ultima linea del deposito               
      
		}                
     
   
	
  }
}
