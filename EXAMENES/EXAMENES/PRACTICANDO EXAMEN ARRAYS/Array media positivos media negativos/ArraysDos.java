/**
 * Leer 10 números enteros y mostrar la media de los valores positivos
 * y la de los valores negativos.
 * 
 * @author Elena Tellez
 */
public class ArraysDos {

  public static void main(String[] args) {
    
      
        int[] numeros = new int[10];
        int pos = 0, neg = 0;  //contadores para positivos y negativos
        int i;
        double sumaPos = 0, sumaNeg = 0;  //suma de positivos y negativos
        //Leemos los valores por teclado y los guardamos en el array
        System.out.println("Lectura de los elementos del array: ");
         for (  i = 0; i<10; i++){ 
          System.out.print("Introduce un número: ");
          numeros[i] = Integer.parseInt(System.console().readLine());
		}
        //se recorre el array para sumar positivos y negativos
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0){ //sumar positivos
                sumaPos += numeros[i];
                pos++;
            } else if (numeros[i] < 0){ //sumar negativos
                sumaNeg += numeros[i];
                neg++;
            }
        }
        //mostrar resultados
        if (pos != 0) {
            System.out.println("Media de los valores positivos: " + sumaPos / pos);
        } else {
            System.out.println("No ha introducido números positivos");
        }
        if (neg != 0) {
            System.out.println("Media de los valores negativos: " + sumaNeg / neg);
        } else {
            System.out.println("No ha introducido números negativos");
        }
    }
}
