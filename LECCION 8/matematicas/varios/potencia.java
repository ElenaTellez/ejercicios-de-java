/**
* Funciones matemáticas de propósito general
* 
* Ejercicios 1 - 14: 4. potencia: Dada una base y un exponente devuelve la potencia.
*
* @author Elena Tellez
*/
package matematicas;

public class potencia {

/**
* potencia: Dada una base y un exponente devuelve la potencia.
*
* @param base un número entero 
* @param exponente un número entero
* @return la potencia de un numero
*/
public static double potencia(int base, int exponente) {
    
   
    double potencia = 1;
        
    if (exponente == 0) {
      potencia = 1;
    }
    
    if (exponente > 0) {
      for (int i = 0; i < exponente; i++) {
        potencia *= base;
      }
    }
    
    if (exponente < 0) {
      for (int i = 0; i < -exponente; i++) {
        potencia *= base;
      }
      
      potencia = 1/potencia;
    }

    return potencia;
  }
}
