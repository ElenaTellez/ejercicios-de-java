/**
* Ejercicio 3
*
* Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja de 40 cartas:
* 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
*
* @author Elena Téllez
*/

public class Ejercicio0306 {
  public static void main(String[] args) {

    System.out.println("Muestra al azar el nombre de una carta de la baraja española:");
    
    String numero = "";
    String palo = "";
    
    int figuraNumero = (int)(Math.random()*10) + 1;//sumo uno para quitar el 0
            
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
      
            
        numero = String.valueOf(figuraNumero);
        break;
          
      case 11:
        numero = "Sota";
        break; 
       
      case 12:
        numero = "Caballo"; 
        break;
      
      case 13:
        numero = "Rey"; 
        break;  
      
      default:
    }

    int figuraPalo = (int)(Math.random()*4) + 1;
            
    switch(figuraPalo) {
      
      case 1:
        palo = "Oro";
        break;
         
      case 2:
        palo = "Bastos";
        break; 
       
      case 3:
        palo = "Espadas"; 
        break;
      
      case 4:
        palo = "Copas"; 
        break;  
      
      default:
    }
    System.out.println(numero + " de " + palo);
  }
}
