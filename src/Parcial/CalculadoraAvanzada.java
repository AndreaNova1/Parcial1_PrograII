package Parcial;
import javax.swing.*;
import java.util.Scanner;

public class CalculadoraAvanzada {
    double numero1;//decimales
    double numero2;
    double resultado;

    //metodos de calculos para operaciones avanzadas
    public void Potencia() {
        System.out.println("Calculo de la Potencia: ");
        System.out.println(" ");
        Scanner mostrar = new Scanner(System.in);

        System.out.println("Escriba la base que desea calcular ");
        numero1 = mostrar.nextDouble();

        System.out.println("Escriba el exponente que desea calcular ");
        numero2 = mostrar.nextDouble();

        resultado = Math.pow(numero1, numero2);
        System.out.println("La potencia obtenida es  " + resultado);

    }

    public void Raiz() {
        System.out.println("Operacion de radicacion");
        Scanner mostrar = new Scanner(System.in);

        numero1 = mostrar.nextDouble();
        resultado = Math.sqrt(numero1);
        System.out.println("La raiz cuadrada de" + numero1 + " es : " + resultado);

    }

    public void Seno() {
        System.out.println("Calculo del Seno de un triangulo: ");
        Scanner mostrar = new Scanner(System.in);

        System.out.println("Ingrese el valor del cateto opuesto: ");
        numero1 = mostrar.nextDouble();

        System.out.println("Ingrese el valor de la hipotenusa");
        numero2 = mostrar.nextDouble();

        double rad = Math.toRadians(numero1 / numero2);
        resultado = Math.sin(rad);

        System.out.println("El seno de un numero " + numero1 + numero2 + "º es: " + resultado);
        System.out.println(" ");
    }

    public void Coseno() {
        System.out.println("Calculo del coseno de un triangulo");
        Scanner mostrar = new Scanner(System.in);

        System.out.println("Ingrese el valor del cateto adyacente: ");
        numero1 = mostrar.nextDouble();

        System.out.println("Ingrese el valor de la hipotenusa: ");
        numero2 = mostrar.nextDouble();

        double rad = Math.toRadians(numero1 / numero2);
        resultado = Math.cos(rad);
        System.out.println("El coseno de un numero es: " + resultado);
    }

    public void Tangente() {
        System.out.println("Calculo de la Tangente de un triangulo");
        Scanner mostrar = new Scanner(System.in);

        System.out.println("Ingrese el valor del cateto opuesto: ");
        numero1 = mostrar.nextDouble();

        System.out.println("Ingrese el valor del cateto adyacente: ");
        numero2 = mostrar.nextDouble();

        double rad = Math.toRadians(numero1 / numero2);
        resultado = Math.cos(rad);
        System.out.println("La tangente de un numero es: " + resultado);
    }
}