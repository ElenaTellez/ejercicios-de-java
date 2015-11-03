/**
* Ejercicio 2
*
* Realiza un programa que muestre al azar el nombre de una carta de la baraja francesa. Esta
* baraja está dividida en cuatro palos: picas, corazones, diamantes y tréboles. Cada palo está
* formado por 13 cartas, de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8,
* 9, 10, J, Q, K y A (que sería el 1). Para convertir un número en una cadena de caracteres
* podemos usar String.valueOf(n) .
*
* @author Elena Téllez
*/

public class Ejercicio0206 {
  public static void main(String[] args) {

    System.out.println("Muestra al azar el nombre de una carta de la baraja francesa:");
    
    String numero = "";
    String palo = "";
    
    int figuraNumero = (int)(Math.random()*13) + 1;
            
    switch(figuraNumero) {
      
      case 1:
        numero = "As";
        break;
      
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
            
        numero = String.valueOf(figuraNumero);
        break;
          
      case 11:
        numero = "J";
        break; 
       
      case 12:
        numero = "Q"; 
        break;
      
      case 13:
        numero = "k"; 
        break;  
      
      default:
    }

    int figuraPalo = (int)(Math.random()*4) + 1;
            
    switch(figuraPalo) {
      
      case 1:
        palo = "Corazones";
        break;
         
      case 2:
        palo = "Pica";
        break; 
       
      case 3:
        palo = "Diamante"; 
        break;
      
      case 4:
        palo = "Trébol"; 
        break;  
      
      default:
    }
    System.out.println(numero + " de " + palo);
  }
}
