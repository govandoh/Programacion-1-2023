package tareacalculadora;
/**
 * GERARDO ANTONIO OVANDO HERNANDEZ - 9490-21-7 PROGRAMACIÓN 1 SECCIÓN: B
 * TAREA CALCULADORA OPERACIONES BÁSICAS
 * FECHA:23/02/2023
 */
import java.util.Scanner;

public class TareaCalculadora {
    static Scanner capturaN = new Scanner(System.in);
    static Scanner capOpc = new Scanner(System.in);
    public static void main(String[] args) {
        double n1, n2;
        int opMenu = -1;

        do {
            mostrarMenu();
            System.out.println("**************");
            opMenu = capOpc.nextInt();
            System.out.println("**************");
            switch (opMenu) {
                case 1:
                    System.out.println("");
                    System.out.println("Ingrese el primero numero: ");
                    n1 = capturaN.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    n2 = capturaN.nextDouble();
                    System.out.println("");
                    System.out.println("La suma es: ");
                    ejecutarSuma(new Operaciones(n1, n2));
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("Ingrese el primero numero: ");
                    n1 = capturaN.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    n2 = capturaN.nextDouble();
                    System.out.println("");
                    System.out.println("La resta es: ");
                    ejecutarResta(new Operaciones(n1, n2));
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Ingrese el primero numero: ");
                    n1 = capturaN.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    n2 = capturaN.nextDouble();
                    System.out.println("");
                    System.out.println("La multiplicacion es: ");
                    ejecutarMulti(new Operaciones(n1, n2));
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Ingrese el primero numero: ");
                    n1 = capturaN.nextDouble();
                    System.out.println("Ingrese el segundo numero: ");
                    n2 = capturaN.nextDouble();
                    System.out.println("");
                    System.out.println("La division es: ");
                    ejecutarDivi(new Operaciones(n1, n2));
                    System.out.println("");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no valida, seleccione una opcion valida. ");
                    System.out.println("");
                    break;
            }
        } while (opMenu != 5);
    }

    //Metodo para imprimir el menu
    public static void mostrarMenu() {
        System.out.println("*******************************");
        System.out.println(" *** CALCULADORA BÁSICA *** ");
        System.out.println("*******************************");
        System.out.println("SELECCIONE OPERACION A REALIZAR");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");
        System.out.println("");
    }

    //Llama la clase Operaciones y Ejecuta +
    public static void ejecutarSuma(Operaciones o) {
        System.out.printf("%.2f", o.sumar());
    }

    //Llama la clase Operaciones y Ejecuta -
    public static void ejecutarResta(Operaciones o) {
        System.out.printf("%.2f", o.restar());
    }

    //Llama la clase Operaciones y Ejecuta *
    public static void ejecutarMulti(Operaciones o) {
        System.out.printf("%.2f", o.multiplicar());
    }

    //Llama la clase Operaciones y Ejecuta /
    public static void ejecutarDivi(Operaciones o) {
        System.out.println(o.dividir());
    }
}
