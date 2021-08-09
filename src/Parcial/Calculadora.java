package Parcial;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;
public class Calculadora {
//atributos private es exclusivo
    double numero1;
    double numero2;
    double resultado;


    //metodos
    public void suma() {
        double resultado = 0;
        Scanner ingresar = new Scanner(System.in);
            System.out.println("Ingrese el primer numero");
            numero1 = ingresar.nextDouble();

            System.out.println("Ingrese el segundo numero");
            numero2 = ingresar.nextDouble();

            resultado = numero1 + numero2;//contatenacion
            System.out.println("El resultado de la suma es: " + resultado);
        }


    public void resta(){
            Scanner ingresar = new Scanner(System.in);

            System.out.println("Ingrese el primer numero");
            numero1=ingresar.nextDouble();

            System.out.println("Ingrese el segundo numero");
            numero2=ingresar.nextDouble();
        resultado=numero1 - numero2;//contatenacion
        System.out.println("El resultado de la resta es: " + resultado);

        }
    public void multiplicacion(){
            Scanner ingresar = new Scanner(System.in);

            System.out.println("Ingrese el primer numero");
            numero1=ingresar.nextDouble();

            System.out.println("Ingrese el segundo numero");
            numero2=ingresar.nextDouble();
            resultado=numero1 * numero2;//contatenacion
            System.out.println("El resultado de la multiplicacion es: " + resultado);

        }
    public void division (){
        Scanner ingresar = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        numero1=ingresar.nextDouble();

        System.out.println("Ingrese el segundo numero");
        numero2=ingresar.nextDouble();

        resultado=numero1 / numero2;//contatenacion
        System.out.println("El resultado de la division es" + resultado);

    }
    public void mostrar(){

    }

}
