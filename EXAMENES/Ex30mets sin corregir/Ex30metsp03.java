/**
* 3. Realiza un simulador de máquina tragaperras simplificada que cumpla los siguientes requisitos:
a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5 figuras posibles:
corazón, diamante, herradura, campana y limón.
b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento, ha perdido”.
c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien, ha recuperado su
moneda”.
d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado 10 monedas”.
Ejemplo 1:
diamante diamante limón
Bien, ha recuperado su moneda
Ejemplo 2:
herradura campana diamante
Lo siento, ha perdido
Ejemplo 3:
corazón corazón corazón
Enhorabuena, ha ganado 10 monedas
*
* @author Elena Téllez
*/

public class Ex30metsp03 {
  public static void main(String[] args) {

    System.out.println("Suerte con la combinación de sus figuras: ");
    
    String numero = "";
    String palo = "";
    int i = 0;
    
            
    do  {
    
      int figuraNumero = (int)(Math.random()*5) + 1;
      
      switch(figuraNumero) {
      
      case 1:
        numero = "Corazón";
        break;
                    
      case 2:
        numero = "Diamante";
        break; 
       
      case 3:
        numero = "Herradura"; 
        break;
      
      case 4:
        numero = "Campana"; 
        break;  
      case 5:
        numero = "Limón"; 
        break;
      default:
    }
    System.out.print(numero + " ");
    i++;
             
    } while (i < 3);
    
  }
}
