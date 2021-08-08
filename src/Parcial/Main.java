package Parcial;
import java.util.InputMismatchException;
import java.util.Scanner;

//clase principal
public class Main {
    static Calculadora calculadora = new Calculadora();
    static CalculadoraAvanzada calculadoraAv = new CalculadoraAvanzada();


    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        //Indica si salimos o no
        boolean salir = false;
        int opcion;

        //Bucle para pedir las opciones hasta que elijamos salir
        while (!salir) {

            //opciones
            System.out.println("***BIENVENIDO*** ");
            System.out.println("SELECCIONE LA CALCULADORA QUE DESEA UTILIZAR ");
            System.out.println("1.Calculadora Basica");
            System.out.println("2. Calculadora Avanzada");
            System.out.println("3. Salir del programa");

            try {//opciones que podemos realizar
                System.out.println("Por favor seleccione el menu que desea utilizar:   ");
                opcion = sn.nextInt();

                //Realiza una de las opciones
                switch (opcion) {
                    case 1:
                        menuinicial();
                        break;
                    case 2:
                        menuavanzado();
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Opciones a utilizar de 1 al 3");
                }

                //controla la excepcionn en caso de que se introduzca un valor no correcto
            } catch (InputMismatchException e) {
                System.out.println("Escribe un numero, para continuar");
                sn.next();
            }
        }

        System.out.println("Fin del menu");
    }

        public static void menuinicial() {
            Scanner entrada = new Scanner(System.in);
            int op;
            do {
                System.out.printf("\n\n");
                System.out.println("Bienvenido al menu de opciones");
                System.out.println("Calculadora de operaciones basicas");

                System.out.println("1) suma");
                System.out.println("2) resta");
                System.out.println("3) multiplicacion");
                System.out.println("4) division");
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
                        System.out.println("Hasta pronto....");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Ingrese un número correcto segun las opciones");
                        break;
                }
            } while (op != 5);
        }

        public static void menuavanzado () {
            Scanner entrada = new Scanner(System.in);
            int op;
            do {
                System.out.printf("\n\n");
                System.out.println("Calculadora de operaciones avanzadas");
                System.out.println("1) Potencia");
                System.out.println("2) Raiz");
                System.out.println("3) Seno");
                System.out.println("4) Coseno");
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
                        System.out.println("Fin de los calculos");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Ingrese un número correcto segun las opciones");
                        break;
                }
            } while (op != 5);
        }
    }