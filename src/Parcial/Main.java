package Parcial;
import java.util.InputMismatchException;
import java.util.Scanner;

//clase principal
public class Main {
    static Calculadora calculadora = new Calculadora();
    static CalculadoraAvanzada calculadoraAv = new CalculadoraAvanzada();

    public static void menuPincipal() {
        Scanner sn = new Scanner(System.in);
        int op = 0;
        do {
            System.out.println("               BIENVENIDO             ");
            System.out.println(" --------------------------------------------");
            System.out.println("SELECCIONE LA CALCULADORA QUE DESEA UTILIZAR ");
            System.out.println(" --------------------------------------------");
            System.out.println("1.Calculadora Basica");
            System.out.println("2. Calculadora Avanzada");
            System.out.println("3. Salir del programa");
            System.out.println("Por favor Ingrese una Opcion del menur: " ); op = sn.nextInt();
            switch (op) {
                case 1:
                    menuinicial();
                    break;
                case 2:
                    menuavanzado();
                    break;
                case 3:
                    System.out.println("Hasta pronto....");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Numero incorrecto, digite un numero para continuar");

            }

        } while (op != 4);


    }

    public static void menuinicial() {
        Scanner entrada = new Scanner(System.in);
        int op;
        do {
            System.out.printf("\n\n");
            System.out.println(" --------------------------------------------");
            System.out.println("****Bienvenido al menu de opciones****");
            System.out.println(" --------------------------------------------");
            System.out.println("****Calculadora de operaciones basicas***");
            System.out.println(" --------------------------------------------");

            System.out.println("1) suma");
            System.out.println("2) resta");
            System.out.println("3) multiplicacion");
            System.out.println("4) division");
            System.out.println("5) Regresar al menu principal") ;
            System.out.println("Ingresa una Opcion:");
            op = entrada.nextInt();

            switch (op) {
                case 1:
                    calculadora.suma();
                    break;
                case 2:
                    calculadora.resta();
                    break;
                case 3:
                    calculadora.multiplicacion();
                    break;
                case 4:
                    calculadora.division();
                    break;
                case 5:
                    System.out.println("Regreso al menu principal");
                default:
                    System.out.println("Ingrese un número correcto segun las opciones");
                    break;
            }
        } while (op != 5);

    }

    public static void menuavanzado() {
        Scanner entrada = new Scanner(System.in);
        int op;
        do {
            System.out.printf("\n\n");
            System.out.println(" --------------------------------------------");
            System.out.println("***Calculadora de operaciones avanzadas***");
            System.out.println(" --------------------------------------------");
            System.out.println("1) Potencia");
            System.out.println("2) Raiz");
            System.out.println("3) Seno");
            System.out.println("4) Coseno");
            System.out.println("5) Tangente");
            System.out.println("6) Regresar al menu principal") ;
            System.out.println("Ingresa una Opcion:");
            op = entrada.nextInt();
            switch (op) {
                case 1:
                    calculadoraAv.Potencia();
                    break;
                case 2:
                    calculadoraAv.Raiz();
                    break;
                case 3:
                    calculadoraAv.Seno();
                    break;
                case 4:
                    calculadoraAv.Coseno();
                    break;
                case 5:
                    calculadoraAv.Tangente();
                    break;
                case 6:
                    System.out.println("Regreso al menu principal");

                default:
                    System.out.println("Ingrese un número correcto segun las opciones");
                    break;
            }
        } while (op != 6);
    }

    public static void main(String[] args) {

        menuPincipal();
        menuinicial();
        menuavanzado();

    }
}