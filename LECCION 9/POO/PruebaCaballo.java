/**
 * PruebaGatoSimple.java
 * Programa que prueba la clase GatoSimple
 * @author Luis José Sánchez
 */

public class PruebaCaballo {
  public static void main(String[] args) {
    
    Caballo estrella = new Caballo("hembra", "Estrella");
    
    System.out.println("-¡Corre caballo!");
    estrella.trota();
    System.out.println("¿te gustan las zanahorias?");
    estrella.come("zanahoria");
    System.out.println("¿te gustan las manzanas?");
    estrella.come("manzana");
    
    Caballo lucero = new Caballo("macho","Lucero");
    
    System.out.println("- Lucero, come lechuga");
    lucero.come("lechuga");
    
    Caballo rocinante = new Caballo("macho", "Rocinante");
    
    System.out.println("Los caballos salen a pasear");
    System.out.print(estrella.getNombre() + " ");
    estrella.relincha();
    System.out.print(lucero.getNombre()+ " ");
    lucero.relincha();
    System.out.print(rocinante.getNombre() + " ");
    rocinante.relincha();
    
    System.out.println(estrella.getNombre() + " sale a competir con " + rocinante.getNombre());
    estrella.compiteCon(rocinante);
    
    System.out.println(lucero.getNombre() + " sale a competir con " + estrella.getNombre());
    lucero.compiteCon(estrella);
    
    System.out.println(lucero.getNombre() + " sale a competir con " + rocinante.getNombre());
    lucero.compiteCon(rocinante);
    
  }
}
