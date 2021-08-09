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
        public void Raiz () {
        System.out.println("Operacion de radicacion");
        Scanner mostrar=new Scanner(System.in);

        numero1=mostrar.nextDouble();
        resultado=Math.sqrt(numero1);
        System.out.println("La raiz cuadrada de"+numero1+" es : "+resultado);

        }
        public void Seno () {

        }
        public void Coseno () {

        }
    }

