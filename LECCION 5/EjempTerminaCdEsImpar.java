/**
* Bucle do-while que termina cuando se introduce por teclado un
* número impar.Después de pedir un número,
  que el programa diga ¿Quiere continuar? (s/n) . Si el usuario introduce una s o una S , el
* programa deberá continuar pidiendo números.
*
* @author Elena Tellez
*/
public class TerminaCuandoEsImpar {
  public static void main(String[] args) {

		int numero;
		String respuesta;

		do {
			System.out.print("Dime un número: ");
			numero = Integer.parseInt(System.console().readLine());
			if (numero % 2 == 0) {// comprueba si el número introducido es par
				System.out.println("El número introducido es par");
			} else {
				System.out.println("El número introducido es impar");
			}
			System.out.println("¿Desea seguir introduciondo números? Si (s) o No (n).");
			respuesta = (System.console().readLine());
				
		} while(respuesta.equalsIgnoreCase("s"));  
  }
}
