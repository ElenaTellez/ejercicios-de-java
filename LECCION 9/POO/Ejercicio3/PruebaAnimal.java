package poo.ejercicio3;

import java.util.Scanner;

import poo.ejercicio3.Ave;

import poo.ejercicio3.Animal;

/**
 * Ejercicio 3
 *
 * Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y
 * Lagarto. Crea, al menos, tres métodos específicos de cada clase y redefine
 * el/los método/s cuando sea necesario. Prueba las clases creadas en un
 * programa en el que se instancien objetos y se les apliquen métodos.
 *
 * @author Elena Tellez
 *
 */
public class PruebaAnimal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Animal General = new Animal();
        Ave Aveztruz = new Ave("Negra", "Grande");
        Canario Piolin = new Canario(7);
        Pinguino HappyFeet = new Pinguino("Pinguino Emperador");
        Gato Felix = new Gato ("Felix", "persa", "macho");
        Mamifero Ballena = new Mamifero (Sexo.HEMBRA); 
        
        /**
         * 
         * Perro Pluto = new Perro (pelota); 
         * Lagarto (Guancho) = new Lagarto(escamas);
         */
        
        System.out.println("En el Planeta tenemos dos tipos de seres: los seres vivos y los seres inertes.");
        System.out.println("Los seres vivos forman el reino animal y se distinguen de los seres inertes porque:");

        System.out.println(General);
        General.nacer();
        General.crecer();
        General.morir();

        System.out.println("El reino animal se divide en distintos tipos: peces, aves, mamiferos, anfibios, artropodos, insectos...");

        System.out.println("El aveztruz es un tipo de ave.");
        System.out.print("El aveztruz es: ");
        System.out.println(Aveztruz);

        System.out.println("¿Cuantos huevos puso el aveztruz el jueves?");
        int huevos = Integer.parseInt(sc.nextLine());
        Aveztruz.poneHuevos(huevos);
        System.out.println("¿Cuantos huevos puso el aveztruz el viernes?");
        huevos = Integer.parseInt(sc.nextLine());
        Aveztruz.poneHuevos(huevos);
        System.out.println("El Aveztruz ha puesto:");
        System.out.println(Ave.getcuentaHuevos() + " huevos.");

        System.out.println("¿Cuantos metros corrió el aveztruz el jueves?");
        int metros = Integer.parseInt(sc.nextLine());
        Aveztruz.vuela(metros);
        System.out.println("¿Cuantos metros corrió el aveztruz el viernes?");
        metros = Integer.parseInt(sc.nextLine());
        Aveztruz.vuela(metros);
        System.out.println("El Aveztruz recorrió:");
        System.out.print(Ave.getcuentaMetros() + "metros.");

        System.out.println("Para el nido, el aveztruz encontró paja y palos");
        String material = " paja";
        Aveztruz.haceNido(material);
        System.out.println();

        System.out.println("Piolin es otro tipo de ave. Es un canario.");
        System.out.println("Piolin es: ");
        System.out.println(Piolin);

        Piolin.canta();
        System.out.println();

        Piolin.haceNido(material);  
        
        System.out.println();
        
        System.out.println("Happy Feet es otro tipo de ave. Es un pingüino.");
        System.out.println("Happy Feet es: ");
        System.out.println(HappyFeet);

        HappyFeet.comePescado();
        System.out.println();

        HappyFeet.haceNido(material);    
        
        System.out.println("Happy Feet es un mamifero porque: ");
        
        HappyFeet.nacer();
        HappyFeet.crecer();
        HappyFeet.morir();
        
        System.out.println();
        System.out.println(Felix);
        Felix.come("pescado");
        System.out.println("Si le das de comer otra cosa que no se pescado al gato:");
        Felix.come("hormigas");
        Felix.ronronea();
        Felix.maulla();
        
        System.out.println();
        System.out.println("La ballena es un mamífero.");
        System.out.println("Los mamíferos no nacen de huevos.");
        Ballena.amamanta();   
        
            

        sc.close(); 

    }

}
