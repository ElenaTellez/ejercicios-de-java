/**
* Ejercicio 6 Lección 5
* 
*
* Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle do while .
*
* @author Elena Téllez
*/
public class Ejercicio0605 {
	public static void main(String[] args) {
		
    int n = 320;
    
    do {
    System.out.println(n);
    n = (n - 20);    
    } while (n >=160);   
	}
}
