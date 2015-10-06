/**
 * Ejercicio 8 Leccion 4
 *
 * Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien,
 * notable o sobresaliente).
 *
 * @author Elena Téllez
 */
public class Ejercicio0804 {

	public static void main(String[] args) {

    System.out.println("Por favor, introduzca la nota de su primer examen\n");    
    Double a = Double.parseDouble(System.console().readLine());    
    System.out.println("Por favor, introduzca la nota de su segundo examen\n");
	Double b = Double.parseDouble(System.console().readLine());    
	System.out.println("Por favor, introduzca la nota de su tercer examen\n");  
    Double c = Double.parseDouble(System.console().readLine());  
    
    double media = (a + b + c) / 3;  
    
  	if (media < 5) { 
	System.out.println("La nota de su boletín es: Insuficiente");
	}
	
	if((media >= 5) && (media < 6)){ 
	System.out.println("La nota de su boletín es: Suficiente");
	}
	
	if((media >= 6) && (media < 7)){ 
	System.out.println("La nota de su boletín es: Bien");
	}
	
	if ((media >= 7) && (media < 9)){ 
	System.out.println("La nota de su boletín es: Notable");
	}
	
	if ((media >= 9) && (media <= 10)){ 
	System.out.println("La nota de su boletín es: Sobresaliente");
	}
	
  }
}
