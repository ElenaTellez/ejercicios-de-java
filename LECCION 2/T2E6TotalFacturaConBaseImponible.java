/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 *imponible (precio sin IVA). La base imponible estará almacenada en una
 *variable.
 *
 * @author David Bernal Guerrero
 */

  public class T2E6TotalFacturaConBaseImponible {			
    public static void main(String[] args) {

    double baseImponible = 100;
    int iva = 21;
    double total;

    total = baseImponible + (baseImponible * (iva/100));
    //total = baseImponible + (baseImponible * (21/100));     //   NO FUNCIONA
    
    System.out.println("|                                   ______________  |");
    System.out.print("| Base Imponible.................. |");
    System.out.printf("     %4.2f  €| |\n",baseImponible);
    System.out.printf("| I.V.A. ......................... |         %d  " 
      ,iva);
    System.out.println("%| |");                      //Conflicto al usar \%
    System.out.println("|                                  |--------------| |");
    System.out.printf("|                     TOTAL....... |      %.2f €| |\n"
      ,total);
    System.out.println("|                                  |______________| |");
    System.out.println("|___________________________________________________|");

    }
  }
