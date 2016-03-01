/**
 * Escribe un programa que pida dos números por teclado y que luego mezcle en dos números
 * diferentes los dígitos pares y los impares. Se van comprobando los dígitos de la siguiente manera:
 * primer dígito del primer número, primer dígito del segundo número, segundo dígito del primer número,
 * segundo dígito del segundo número, tercer dígito del primer número... Para facilitar el ejercicio,
 * podemos suponer que el usuario introducirá dos números de la misma longitud y que siempre habrá al
 * menos un dígito par y uno impar. Usa long en lugar de int donde sea necesario para admitir números
 * largos.
 * Ejemplo 1:
 * Por favor, introduzca un número: 9402
 * Introduzca otro número: 6782
 * El número formado por los dígitos pares es 640822
 * El número formado por los dígitos impares es 97
 * Ejemplo 2:
 * Por favor, introduzca un número: 137
 * Introduzca otro número: 909
 * El número formado por los dígitos pares es 0
 * El número formado por los dígitos impares es 19379
 *
 * @author Elena Téllez
 */
public class Ex30metsp04 {
  public static void main(String[] args) {
    
     
    System.out.print("Por favor, introduzca un número: ");
    long numeroUnoIntroducido = Long.parseLong(System.console().readLine());
    System.out.print("Por favor, introduzca otro número: ");
    long numeroDosIntroducido = Long.parseLong(System.console().readLine());
    
    
    long volteadoPares = 0;
    long volteadoImpares = 0;
        
    long numeroDePares = 0;
    long numeroDeImpares = 0;
    long digito = 0;
    
    
    
    while (numeroUnoIntroducido > 0) { //al ser la misma longitud no es necesario repetir con numeroDosIntroducido
                                       //ya que estoy repitiendo el bucle segun longitud 
      
      // comprueba el dígito del primero numero
      digito = numeroUnoIntroducido%10;
      numeroUnoIntroducido = numeroUnoIntroducido/10;
      System.out.println(digito);
      if (digito%2 == 0) {
        
         numeroDePares = numeroDePares * 10 + digito;
         
      } else {
         
         numeroDeImpares = numeroDeImpares * 10 + digito; 
      }
      
      digito = numeroDosIntroducido%10;
      numeroDosIntroducido = numeroDosIntroducido/10;
      System.out.println(digito);
      
      if (digito%2 == 0) {
        
         numeroDePares = numeroDePares * 10 + digito;
         
      } else {
         
         numeroDeImpares = numeroDeImpares * 10 + digito; 
      }  
    }  
    
    //Ahora ya tenemos el resultado pero hay que darle la vuelta ya que sale al reves
    
    System.out.println(numeroDePares);
    System.out.println(numeroDeImpares);
    
    System.out.print("Numeros Pares:");
    
    while (numeroDePares > 0) { 
      
      // voltea los digitos del numero par resultante
      volteadoPares = numeroDePares%10;
      numeroDePares = numeroDePares/10;
      System.out.print(volteadoPares);      
    }          
    
    System.out.print("\nNumeros Impares:");
    
    while (numeroDeImpares > 0) { //al no ser la misma longitud de numero par resultante 
                                //hay que repetir el bucle segun longitud 
      
      // voltea los digitos del numero impar resultante
      volteadoImpares = numeroDeImpares%10;
      numeroDeImpares = numeroDeImpares/10;
      System.out.print(volteadoImpares);      
    } 
  }
}
