package poo.ejercicio3;

/**
*  
* Definici�n de la clase Mamifero
* @author Elena Tellez
*/

public class Mamifero extends Animal {

  public Mamifero () {
    super();
  }

  public Mamifero (Sexo s) {
    super(s);
  }

  
  //Metodos
  
  
  public void amamanta() {
    if (this.getSexo() == Sexo.MACHO) {
      System.out.println("Los machos no tienen crías :(");
    } else {
      System.out.println("Amamantan a sus crias.");
    }
  }
  
  public void cuidaCrias() {
    System.out.println("Cuidann de sus crias");
  }
  
  public void anda() {
    System.out.println("Se desplanzan de distintas formas. ");
  }
}
