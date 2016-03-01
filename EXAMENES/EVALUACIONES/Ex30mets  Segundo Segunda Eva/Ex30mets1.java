import java.util.Scanner;

/**
 *
 * @author Elena Tellez
 */
public class Ex30mets1 {public static void main(String[] args) {
  
  Scanner sc = new Scanner(System.in);
  
  boolean rellena = true;
  
  System.out.println("Introduzca el nombre de la figura: ");		
	
	String nombreFigura = sc.nextLine();
	
  System.out.println("Introduzca la altura de la figura: ");		
	
	int n = 	 sc.nextInt();
  
  System.out.println("¿Desea que la figura este rellena? 1.Si 2.No");		
	
	int relleno = sc.nextInt();
  
  if (relleno == 1){
    rellena = true;
  } else {
    rellena = false;
  }
  
  pintaFigura(nombreFigura,n,rellena);
  
  sc.close();	
  }  
/**
* 
* puede ser “piramide”, “piramide invertida” o “cuadrado”. 
* 
* @param nombre de una figura
* @param numero que indica altura figura
* @param deseo de relleno de la figura
* @return figura deseada con los datos aportados
*/	

 public static void pintaFigura(String nombreFigura, int n, boolean rellena){
   
   
    if ("piramide".equals(nombreFigura)&&(rellena == true)){
      int x = 0;
      int altinicial= n;
      int h = 0;
      int i = altinicial - (n - h);


      while (n > 0) {
        do {
          System.out.print(" ");
          x++;
        }   while (x < n);
        x = 0;
      while (i >= 0) {
        System.out.print("*");
        i--;
      }
      System.out.println();
      n--;
      h++;
      i = altinicial - (n - h);
    }
   
  }
    
    if ("piramide".equals(nombreFigura)&&(rellena == false)){
    
    int altura = 1;
    int espacios = n - 1;
    int i = 0;
    int j = 0;
    int relleno = 0;

    while (altura < n) {
      
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      System.out.print("*");
      for (i = 1; i < relleno; i++) {
        System.out.print(" ");
      }
      if (altura > 1) {
        System.out.print("*");
      }
        
      System.out.println();
      espacios--;
      altura++;
      relleno = relleno + 2;;
    }
  
    for (i = 1; i < (n * 2); i++) {
      System.out.print("*");
    }
   
 }
   
    
  if ("piramide invertida".equals(nombreFigura)&&(rellena == true)){
    int altura = 1;
    int espacios = 1;
    int i = 1;
    int j = 0;
    int relleno = n + (n -1);
            
          while (altura <= n) {   //pinta la parte de arriba
            for (i = 1; i < espacios; i++) {
              System.out.print(" ");
            }
            for (i = 1; i <= relleno; i++) {
              System.out.print("*");
            }
            System.out.println();
            espacios++;
            altura++;
            relleno = relleno - 2;;
          }
  }
  
  if ("piramide invertida".equals(nombreFigura)&&(rellena == false)){
    int altura = 1;
    int espacios = 1;
    int i = 1;
    int relleno = n + (n -1);
    int hueco = relleno - 2;
            
          while (altura <= (n)) {   //pinta la parte de arriba
            for (i = 1; i < espacios; i++) {
              System.out.print(" ");
            }
              System.out.print("*");
              for (int j=1; j <= hueco; j++) {
                if (altura == 1) {
                System.out.print("*");
                } else {
                System.out.print(" ");
                }
              }
              if (altura < n) {
              System.out.print("*");
              }
            System.out.println();
            espacios++;
            altura++;
            relleno = relleno - 2;
            hueco = hueco - 2;
          }
  }
  
  if ("cuadrado".equals(nombreFigura)&&(rellena == true)){
    
    String simbolo = "*";		
		int espaciosInteriores = n - 2;		
		
       
    for (int i = 0; i < n; i++) {
			
			System.out.print(simbolo); 
			
			for (int j = 0; j < espaciosInteriores; j++) { 
				
				 
				System.out.print("*");	
					
				}	
			System.out.print(simbolo);  
      System.out.println (); 		
			
			}	
			
      	
			
    System.out.print(" ");
    
  }
  
  if ("cuadrado".equals(nombreFigura)&&(rellena == false)){
    
    String simbolo = "*";		
		int espaciosInteriores = n - 2;		
		
    for (int i = 0; i < n; i++) {
			
      System.out.print(simbolo);  
     	
			
			}	  
    System.out.println (); 	
    for (int i = 0; i < n-2; i++) {
			
			System.out.print(simbolo); 
			
			for (int j = 0; j < espaciosInteriores; j++) { 
				
				 
				System.out.print(" ");	
					
				}	
			System.out.print(simbolo);  
      System.out.println (); 		
			
			}	
			
      for (int i = 0; i < n; i++) {
			
      System.out.print(simbolo);  
     	
			
			}	  
               
   
  }
  
 }
}
