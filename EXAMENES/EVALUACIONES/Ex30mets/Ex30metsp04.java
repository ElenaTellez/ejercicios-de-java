/**
 *Escribe un programa que pida dos números por teclado y que luego mezcle en dos números
diferentes los dígitos pares y los impares. Se van comprobando los dígitos de la siguiente manera:
primer dígito del primer número, primer dígito del segundo número, segundo dígito del primer número,
segundo dígito del segundo número, tercer dígito del primer número... Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud y que siempre habrá al
menos un dígito par y uno impar. Usa long en lugar de int donde sea necesario para admitir números
largos.
Ejemplo 1:
Por favor, introduzca un número: 9402
Introduzca otro número: 6782
El número formado por los dígitos pares es 640822
El número formado por los dígitos impares es 97
Ejemplo 2:
Por favor, introduzca un número: 137
Introduzca otro número: 909
El número formado por los dígitos pares es 0
El número formado por los dígitos impares es 19379
 *
 * @author Elena Téllez
 */
public class Ex30metsp04 {
  public static void main(String[] args) {
    
     
    System.out.print("Por favor, introduzca un número: ");
    long numeroUnoIntroducido = Long.parseLong(System.console().readLine());
    System.out.print("Por favor, introduzca otro número: ");
    long numeroDosIntroducido = Long.parseLong(System.console().readLine());
    
    
    long numero = numeroUnoIntroducido;
    long volteado = 1;
    long pares = 0;
    long impares = 0;
    
    long numeroDos = numeroDosIntroducido;
    long volteadoDos = 1;
    long paresDos = 0;
    long imparesDos = 0;
    
    
    System.out.print("los dígitos impares son: ");
    
    while (numero > 0) {	
      
      volteado = (volteado * 10) + (numero % 10);
      numero = numero/10;
      
    }
    
     while (volteado > 1) {
      
       
      if (((volteado%10)%2) != 0) {     
       
       impares = volteado%10;
        System.out.print(impares);
        
      } 
      
      volteado /= 10;  
    
   
    }     
         
    while (numeroDos > 0) {	
      
      volteadoDos = (volteadoDos * 10) + (numeroDos % 10);
      numeroDos = numeroDos/10;
      
      }
    
     while (volteadoDos > 1) {
      
       
      if (((volteadoDos%10)%2) != 0) {     
       
        imparesDos = volteadoDos%10;
        System.out.print(imparesDos);
        
      } 
      
      volteadoDos /= 10;  
     
    }  
      
    System.out.println();
    
    System.out.println("Los dígitos pares son: ");
    
    
        
    
         
         
    
   }
}
