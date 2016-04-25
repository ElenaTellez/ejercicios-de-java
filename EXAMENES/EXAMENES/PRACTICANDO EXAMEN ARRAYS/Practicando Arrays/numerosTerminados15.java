import java.util.Scanner;

/**
 * Leer 10 números enteros, almacenarlos en un vector y determinar 
 * cuántos números de los almacenados en dicho vector terminan en 15.
 *      
 * @author Elena Téllez
 * 
 */

public class numerosTerminados15 {
    public static void main(String[] args) { // Se añade esta línea para poder usar sleep
		
	Scanner s = new Scanner(System.in);
	
	int v[]= new int[10];
	int aux=0;
	
	System.out.println( "Ingrese los elementos del vector...");
 
    for( int i=0; i<10; i++) {
            System.out.print( "Elemento "+ i+ " del vector: ");
            v[i]= Integer.parseInt(s.nextLine());
            if( v[i]% 100 == 15 ) {
				aux++;
			}
        }
 
	System.out.print( "Vector almacenado: " );
    
    for( int i=0; i<10; i++) {
		System.out.print( ""+ v[i]+ ", " );            
        }
        System.out.println( "\nEn total, "+ aux+ " numeros terminan en 15" );
    }
}
