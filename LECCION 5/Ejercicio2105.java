/**
 * Ejercicio 21 Lección 5
 * 
 * Realiza un programa que vaya pidiendo números hasta que se introduzca un numero
 * negativo y nos diga cuantos números se han introducido, la media de los impares y el mayor
 * de los pares. El número negativo sólo se utiliza para indicar el final de la introducción de
 * datos pero no se incluye en el cómputo.
 * 
 * @author Elena Téllez
 */

public class Ejercicio2105 {

  public static void main(String[] args) {
    
    
    
    int n = 0;
    int mayorPar = 0;
    double sumaImpares = 0;
    double mediaImpares = 0;
    int contador= 0;
        

    System.out.print("Por favor introduzca los número elegidos.\n");
    System.out.print("Para dejar de introducir números inserte un numero negativo.\n");
		   
    
    do  {
			n = Integer.parseInt(System.console().readLine());        
      
      if ((n%2 != 0)&& (n>0)) {
          
          mediaImpares++;
          sumaImpares +=n;
      } else {
          
          if (n > mayorPar) 
            mayorPar = n; //n cambia su valor en funcion del numero introducido, 
                          //NO ES UNA IGUALDAD SINO UNA ASIGNACION DE VALOR
        }  
    
      contador++;
    
    } while (n >= 0);
    
    System.out.println(" El números mayor par introducido es: " + mayorPar); 
    System.out.println(" Se han introducido: " + (contador-1)+ " números");
    System.out.println(" La media de sus números impares es: " + (sumaImpares/mediaImpares));
  }
}

