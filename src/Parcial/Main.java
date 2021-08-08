package Parcial;

import java.util.Scanner;

public class Main {

    public static void menu(){
        Scanner entrada = new Scanner(System.in);
        int op;
        do {
            System.out.printf("\n\n");
            System.out.println("Bienvenido al menu de opciones");
            System.out.println("1) Calculadora Basica");
            System.out.println("2) Calculadora Avanzada");
            System.out.println("3) Salir del Sistema");
            System.out.println("Ingresa una Opcion:"); op = entrada.nextInt();

            switch (op){
                case 1:
                    System.out.printf("Bienvenido a la calculadora Basica");
                    break;
                case 2:
                    System.out.printf("Bienvenido a la calculadora Avanzada");
                    break;
                case 3:
                    System.out.printf("Hasta pronto");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingresa una opcion valida del menu");
                              }

        }while (op !=4);


    }

    public static void main(String[] args){

        menu();


    }

}
