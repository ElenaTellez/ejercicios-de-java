/**
* Funciones matemáticas de propósito general
* 
* Ejercicios 1 - 14: 6. voltea: Le da la vuelta a un número.
*
* @author Elena Tellez
*/
package matematicas;

public class volteado {

/**
* voltea: Le da la vuelta a un número.
*
* @param un número entero 
* @return ese numero volteado
*/
public static int volteado(int numero) {
    
   
    int volteado = 0;
    
    while (numero > 0) {
      volteado = (volteado * 10) + (numero % 10);
      numero /= 10;
    } // while
    
    return volteado;
  }
}
