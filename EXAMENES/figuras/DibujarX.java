/**
 * Dibujar X
 * 
 * Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura. Se debe
 * comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
 * mensaje de error.
 * Ejemplo:
 * Por favor, introduzca la altura de la X: 5
 * 
 * @author Elena Téllez
 */

public class DibujarX {

  public static void main(String[] args) {
		
	System.out.println("Vamos a dibujar una X.");
  System.out.println("Por favor, introduzca la altura que desee que tenga la X: ");
  int n = Integer.parseInt(System.console().readLine());   	
  
  if ((n%2 != 0) && (n>3)) {
    
  
  String simbolo = "*";

	for (int j = n-1; j >= 0; --j) { //Se utiliza otro grupo de for para lograr la forma de x
        
      System.out.println();
           
    for (int i = 0; i < n-j-1; ++i) {  //Utilizamos dos "for" para lograr la forma. 
      
      System.out.print(" "); //Imprime espacios                
      
    }
      
    for (int i = 0; i < 2*j+1; ++i) {
                
        if ((j==0)||(i==0)||(i==2*j)) { //Condición para imprimir solo los bordes.
          
          System.out.print(simbolo);
					
					} else {
					
					System.out.print(" ");
        }                
      }
    }
   
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
    } else {     
			
			System.out.println("Error, la altura introducida es impar o  menor o igual a 3. ");
    }
  }
}
