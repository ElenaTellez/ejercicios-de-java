
/**
* Ejercicio 13 Leccion 6
*
* Escribe un programa que simule la tirada de dos dados. El programa deberá continuar
* tirando los dados una y otra vez hasta que en alguna tirada los dos dados tengan el mismo
* valor.
*
* @author Elena Téllez
*/

public class Ejercicio1306 {
  public static void main(String[] args) {


    System.out.println ("Vamos a tirar dos dados hasta que la tirada de los dos tengan el mismo valor: ");
    int dadoUno = 0;
    int dadoDos = 0;
    
    do  {      
     
        dadoUno = ((int)(Math.random()*6) + 1);
        dadoDos = ((int)(Math.random()*6) + 1);       
        System.out.print(dadoUno + " y " + dadoDos + "\n");       
       
    } while (dadoUno != dadoDos);
    
    System.out.println ();
  } 
}

