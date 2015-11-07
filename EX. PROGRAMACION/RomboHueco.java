/**
* Preparando examen
*
* dibujar un rombo hueco
*
* @author Elena Téllez
*/

public class RomboHueco {
  public static void main(String[] args) {
		
		System.out.println("Vamos a dibujar un rombo hueco.");
		System.out.println("Por favor, introduzca la altura que desee que tenga su rombo: ");
		int n = Integer.parseInt(System.console().readLine()); 
		
     
    String simbolo = "*";

		for (int i = 0; i < n; ++i) { //Cada primer for, se hace un salto de línea.
            
    System.out.println();
           
   //Utilizamos dos "for" para lograr la forma.         
           
      for (int j = 0; j < n-i-1; ++j) {                      
        System.out.print(" ");           
      }
           
      for (int j = 0; j < 2*i+1; ++j){
                
        if ((i==0)||(j==0)||(j==2*i)) { //Condición para imprimir solo los bordes.
					
          System.out.print(simbolo);
                
					} else {
                   
          System.out.print(" ");
        }    
                    
      }            
    }
        
    for (int j = n-2; j >= 0; --j) { //Se utiliza otro grupo de for para lograr la forma de "rombo"
        
      System.out.println();
           
    for (int i = 0; i < n-j-1; ++i) {  //Utilizamos dos "for" para lograr la forma. Imprime espacios                
      
      System.out.print(" ");
      
    }
      
    for (int i = 0; i < 2*j+1; ++i) {
                
        if ((j==0)||(i==0)||(i==2*j)) { //Condición para imprimir solo los bordes.
          
          System.out.print(simbolo);
					
					} else {
					
					System.out.print(" ");
        }                
      }
    }
    System.out.println();
  }
}
