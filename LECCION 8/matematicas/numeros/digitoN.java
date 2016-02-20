/**
* Funciones matemáticas de propósito general
* 
* Ejercicios 1 - 14: 7. digitoN: Devuelve el dígito que está en la posición n de un número entero. Se
* empieza contando por el 0 y de izquierda a derecha
*
* @author Elena Tellez
*/
package matematicas;

public class digitoN {

/**
* 
* digitoN: Devuelve el dígito que está en la posición n de un número entero. Se
* empieza contando por el 0 y de izquierda a derecha
*
* @param un número entero 
* @return ese numero volteado
*/
public static double potencia(int numero) {
    
   
   // le da la vueta al número y calcula la longitud
    int volteado = 0;
    int longitud = 0;
    int posicion = 1;
    
    if (numero == 0) {
      longitud = 1;
    }
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    } // while
