package Parcial;
import java.util.Scanner;
//clase principal
public class Main {
    static Calculadora calculadora = new Calculadora();
// menu
public static void menu() {
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
    public static void main(String[] args){
        menu();
}
}