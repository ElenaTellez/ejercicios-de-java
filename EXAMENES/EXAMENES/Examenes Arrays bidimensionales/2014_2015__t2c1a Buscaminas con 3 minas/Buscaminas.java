import java.util.Scanner;

public class Buscaminas {
	
	
	// se definen constantes para representar el

			// contenido de las celdas 
			
	static final int VACIO = 0;
	static final int MINA = 1; 
	static final int TESORO = 2; 
	static final int INTENTO = 4;
	

	public static void main(String[] args) {
		
            try (Scanner sc = new Scanner(System.in)) {
                
                int contador = 3;                
                int minaX = 0;
                int minaY = 0;
                int mina = 2;
                 
                
                
                int x;
                int y;
                
                int[][] cuadrante = new int[5][4];
                
                // inicializa el array
                
                for(x = 0; x <= 4; x++) { 
                    
                    for(y = 0; y <= 3; y++){  
                        
                        cuadrante[x][y] = VACIO;
                        
                    }
                    
                } // coloca TRES mina
                
                for (int j = 0; j < 3; j++){
                    
                    minaX = (int)(Math.random()*5);
                    minaY = (int)(Math.random()*4);
                    
                    cuadrante[minaX][minaY] = MINA;
                }
                // coloca el tesoro
                
                int tesoroX;
                int tesoroY;             
                
                
                do {
                    
                    tesoroX = (int)(Math.random()*5);
                    tesoroY = (int)(Math.random()*4);
                    
                } while ((minaX == tesoroX) && (minaY == tesoroY));
                
                cuadrante[tesoroX][tesoroY] = TESORO;
                
                for(y = 3; y >= 0; y--){
                    
                    for (x = 0; x <= 4 ; x++){
                        System.out.print(cuadrante[x][y]+ " ");
                        
                    }
                    
                    System.out.println();
                    
                }
                
                
                System.out.println();
                
                // juego
                
                System.out.println("¡BUSCA EL TESORO!");
                System.out.println();
                
                boolean salir = false;
                
                String c = "";
                
                do { // pinta el cuadrante
                    
                    
                    contador--;
                    int filas = 3;
                    
                    for(y = 3; y >= 0; y--) {
                       
                        
                        
                        System.out.print(filas + "|");
                        
                        filas--;                       
                        
                        
                        for(x = 0; x <= 4; x++) {
                            
                            if (cuadrante[x][y] == INTENTO){
                                
                                System.out.print("X ");
                                
                            } else {
                                
                                System.out.print("O ");
                                
                            }
                             
                        }
                        
                        System.out.println();
                    }
                    
                    System.out.println("----------\n  0 1 2 3 4\n");
                    
                    // pide las coordenadas
                    
                    System.out.print("Coordenada columna: ");
                    int a =  sc.nextInt();
                    
                    System.out.print("Coordenada fila: ");
                    int b =  sc.nextInt();
                    
                    // mira lo que hay en las coordenadas indicadas por el usuario
                    
                    switch(cuadrante[a][b]) {
                        
                        case VACIO: cuadrante[a][b] = INTENTO;
                        
                        break;
                        
                        case MINA:            
                            
                            
                            mina--;
                            
                            if (mina == 1) {
                                
                                System.out.println("Lo siento, estas herido.");
                            }
                            
                            if (mina == 0) {
                            
                            System.out.println("Lo siento, has perdido.");
                        
                            salir = true;
                            
                            }
                        
                        break;
                        
                        case TESORO: System.out.println("Enhorabuena, has encontrado el tesoro.");
                        
                        salir = true;
                        
                        break;
                        
                        default:
                            
                    }
                    
                    if (contador == 0){
                
                        System.out.println("Lo sentimos, ha agotado todos los intentos");
                
                   }
                    
                    
                    
                } while ((!salir) && (contador > 0) && (mina >0));
                
                //pinta el cuadrante
                
                int filasDos = 3;
                
                for(y = 3; y >= 0; y--) {                 
                    
                    
                    System.out.print(filasDos + "| ");               
                    filasDos--; 
                    
                    for(x = 0; x <= 4; x++) {
                        
                        switch(cuadrante[x][y]) {
                            
                            case VACIO: c = "O ";
                            
                            break;
                            
                            case MINA: c = "* ";
                            
                            break;
                            
                            case TESORO: c = "€ ";
                            
                            break;
                            
                            case INTENTO: c = "x ";
                            
                            break;
                            
                            default:
                                
                        }
                        
                        System.out.print(c);
                        
                    }
                    
                    System.out.println();
                      
                }
                
                System.out.println("----------\n   0 1 2 3 4\n");
            }
            
            
            

	}

}
