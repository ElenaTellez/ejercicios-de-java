
/**
 * Ejercicio 10 Lección 5
 * 
 * Escribe un programa que calcule la media de un conjunto de números positivos introduci-
 * dos por teclado. A priori, el programa no sabe cuántos números se introducirán. El usuario
 * indicará que ha terminado de introducir los datos cuando meta un número negativo.
 * 
 * @author Elena Téllez
 */

public class Ejercicio1005 {

  public static void main(String[] args) {
    
    double media = 0;
    int n = 0;
    double suma = 0;

    System.out.print("Vamos a calcular la media de un conjunto de números positivos elegidos por usted.\n");
    System.out.print("Por favor introduzca los número elegidos.\n");
    System.out.print("Para dejar de introducir números inserte un numero negativo.\n");
		   
    
    while (n >= 0) {
			n = Integer.parseInt(System.console().readLine());
			media++;
			suma += n;
    }
    
    System.out.println(" La media de sus números es: " + (suma - n)/(media - 1));

  }
}

//suma: va sumando todos los valores, includido el negativo para cerrar bucle
// cuando le resto n le resto el ultimo numero introducido negativo
// en media tambien tendre que restas 1 que es bucle que se hace con el negativo
