
/**
 * 
 * Programa Java que guarda en un array 10 números enteros que se leen por teclado.
 * A continuación se recorre el array y calcula cuántos números son positivos, 
 * cuántos negativos y cuántos ceros. 
 * 
 * @author Elena Tellez
 */
public class ArraysUno {

  public static void main(String[] args) {
     
    
        int[] numeros = new int[10];
        int pos = 0, neg = 0, cero = 0; //contadores
        
       
        for (int i = 0; i<10; i++){  //Leemos los valores por teclado y los guardamos en el array

          System.out.print("Introduce un número: ");
          numeros[i] = Integer.parseInt(System.console().readLine());
		}
		
		//se recorre el array para contar positivos, negativos y ceros
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                pos++;
            } else if (numeros[i] < 0) {
                neg++;
            } else {
                cero++;
            }
        }
        //mostrar resultados
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + cero);
    }
}
