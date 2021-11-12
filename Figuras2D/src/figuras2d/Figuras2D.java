package figuras2d;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Eber MD
 */
public class Figuras2D {

    public static Circle ci = new Circle();
    public static Triangle tri = new Triangle();
    public static Square cu = new Square();

    private static boolean checadorPA, checadorfi, checadorla;

    private static Character PA;
    private static int figura;
    private static float lado;

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        PA = 'E'; figura = 0; lado = 0; int resp = 1;
        checadorPA = false; checadorfi = false; checadorla = false;
        System.out.println("Bienvenido a la calculadora de perimetro y area");
        try {
            while (!checadorPA) {
                System.out.println("\n" + "1. ¿Deseas calcular el perimetro o area? (P o A): ");
                PA = lector.next().charAt(0);
                PA = Character.toUpperCase(PA);
                checadorPA = (PA == 'A' || PA == 'P');
                if (!checadorPA) {System.out.println("Por favor escoge una de las dos opciones");}
            }

            while (!checadorfi) {
                System.out.println("\n" + "2. ¿Que figura quieres usar?"
                        + "\n" + "1. Circulo"
                        + "\n" + "2. Cuadrado"
                        + "\n" + "3. Triangulo");
                figura = lector.nextInt();
                checadorfi = (figura > 0 && figura < 4);
                if (!checadorfi) {System.out.println("Por favor usa las figuras presentadas");}
            }

            while (!checadorla) {
                System.out.println("\n" + "3. Ingresar los atributos de la figura: lados, medida");
                lado = lector.nextFloat();
                checadorla = (lado > 0);
                if (!checadorla) {System.out.println("Por favor usa valores positivos");}
            }

            switch (PA) {
                case 'A':
                    switch (figura) {
                        case 1:
                            System.out.println(ci.getArea(lado)); // se devuelve el resultado con una impresion en pantalla
                            break;
                        case 2:
                            System.out.println(cu.getArea(lado));
                            break;
                        case 3:
                            System.out.println(tri.getArea(lado));
                            break;
                        default:
                            System.out.println("Por favor elige una de las dos opciones");
                            break;
                    }
                    break;
                case 'P':
                    switch (figura) {
                        case 1:
                            System.out.println(ci.getPerimeter((int) lado));
                            break;
                        case 2:
                            System.out.println(cu.getPerimeter((int) lado));
                            break;
                        case 3:
                            System.out.println(tri.getPerimeter((int) lado));
                            break;
                        default:
                            System.out.println("Por favor elige una de las dos opciones");
                            break;
                    }
                    break;
                default:
                    System.out.println("Por favor elige una de las dos opciones");
                    break;
            }

        } catch (InputMismatchException e) { // este tipo de error logra atrapar cuando se introduce un caracter no numérico.
            System.out.println("Por favor solo introduce valores válidos" + "\n");
            lector.nextLine(); // limpia el buffer, borrando el contenido, lo que permite ser llenado nuevamente.
        }
    }
}
