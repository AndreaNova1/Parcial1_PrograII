package Parcial;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
public class Calculadora {

    double numero1;
    double numero2;
    double resultado;


    //metodos
    public void suma() {
        int k, numero;
        double resultado = 0;
        Scanner ingresar = new Scanner(System.in);
        System.out.println("Capture 8 valores:");
        for (k = 0; k < 8; k++) {
            System.out.println("Ingrese el primer numero");
            numero1 = ingresar.nextDouble();

            System.out.println("Ingrese el segundo numero");
            numero2 = ingresar.nextDouble();

            resultado = numero1 + numero2;//contatenacion
            System.out.println("El resultado de la suma es" + resultado);

        }
    }

    public void resta(){
            Scanner ingresar = new Scanner(System.in);

            System.out.println("Ingrese el primer numero");
            numero1=ingresar.nextDouble();

            System.out.println("Ingrese el segundo numero");
            numero2=ingresar.nextDouble();
        resultado=numero1 - numero2;//contatenacion
        System.out.println("El resultado de la resta es" + resultado);

        }
    public void multiplicacion(){
            Scanner ingresar = new Scanner(System.in);

            System.out.println("Ingrese el primer numero");
            numero1=ingresar.nextDouble();

            System.out.println("Ingrese el segundo numero");
            numero2=ingresar.nextDouble();
            resultado=numero1 * numero2;//contatenacion
            System.out.println("El resultado de la multiplicacion es" + resultado);

        }
    public void division (){
        Scanner ingresar = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        numero1=ingresar.nextDouble();

        System.out.println("Ingrese el segundo numero");
        numero2=ingresar.nextDouble();
        resultado=numero1 / numero2;//contatenacion
        System.out.println("El resultado de la suma es" + resultado);

    }
    public void mostrar(){

    }

}
