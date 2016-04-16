package poo.ejercicio4;

/**
 * Ejercicio 4 Crea la clase Fracción . Los atributos serán numerador y
 * denominador. Algunos de los métodos pueden ser invierte, simplifica,
 * multiplica, divide, etc.
 *
 * @author Elena Téllez
 */
public class pruebaFraccion {

    public static void main(String[] args) {

        Fraccion f1 = new Fraccion(-7, 8);
        System.out.println(f1 + " x 5 = " + f1.multiplica(5));
        System.out.println(f1 + " ^-1 = " + f1.invierte());

        Fraccion f2 = new Fraccion(3, 5);
        System.out.println(f1 + " x " + f2 + " = " + f1.multiplica(f2));
        System.out.println(f1 + " : " + f2 + " = " + f1.divide(f2));

        Fraccion f3 = new Fraccion(910, -350);
        System.out.println(f3 + " = " + f3.simplifica());
    }
}
