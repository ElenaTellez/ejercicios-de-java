/**
 * Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos notas que
ha sacado el alumno en los dos primeros controles. Si la media de los dos controles da un número
mayor o igual a 5, el alumno está aprobado y se mostrará la media. En caso de que la media sea un
número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se califica
como “apto” o “no apto”, por tanto se debe preguntar al usuario “¿Cuál ha sido el resultado de la
recuperación? (apto/no apto). Si el resultado de la recuperación es “apto”, la nota será un 5; en caso
contrario, se mantiene la nota media anterior.
Ejemplo 1:
Nota del primer control: 7
Nota del segundo control: 10
Tu nota de Programación es 8.5
Ejemplo 2:
Nota del primer control: 6
Nota del segundo control: 3
¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto
Tu nota de Programación es 5
Ejemplo 3:
Nota del primer control: 6
Nota del segundo control: 3
¿Cuál ha sido el resultado de la recuperación? (apto/no apto): no apto
Tu nota de Programación es 4.5
 *
 * @author Elena Téllez
 */
public class Ex30metsp01 {
  public static void main(String[] args) {
    
        
    System.out.println("Calcula la nota de un trimestre de la asignatura Programación..");
    System.out.println("Nota del primer control(del 0 al 10): ");
    double notaUna = Double.parseDouble(System.console().readLine());
    
    System.out.println("Nota del primer control(del 0 al 10): ");
    double notaDos = Double.parseDouble(System.console().readLine());
    
       
    double resultado = (notaUna + notaDos)/2;  
    String recuperacion = " ";
    String apto = " ";

    if (resultado >=5) {
    
      System.out.println("Tu nota de Programación es: " + resultado);
      
      }  else  {
      
        System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto):");
        
        recuperacion = System.console().readLine();
          
          if ("apto".equals(recuperacion)) {
            
            System.out.println("Tu nota de Programación es 5 ");
            
                        
          } else {
               
            System.out.println("Tu nota de Programación es: " + resultado);
            
          }
    }
  }
}
