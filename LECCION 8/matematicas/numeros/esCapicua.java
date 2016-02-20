/**
* Funciones matemáticas de propósito general
* 
* Ejercicios 1 - 14: 1. esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa
y falso en caso contrario.
*
* @author Elena Tellez
*/
package matematicas;

public class esCapicua {

/**
* 
* esCapicua: Devuelve verdadero si el número que se pasa como parámetro es capicúa
* y falso en caso contrario.
*
* @param un número entero 
* @return <code>true</code> si el número es capicua
* @return <code>false</code> en caso contrario
*/
public static boolean capicua(int numero) {
    
   
       
    long vuelta = 0;
    
    while (numero > 0) {
      vuelta = (vuelta * 10) + (numero % 10);
      numero /= 10;
    }
    
    if (vuelta == numeroIntroducido) {
      return true;
    }
     return false;
  }
}
