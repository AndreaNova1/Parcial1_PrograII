package Parcial;
import javax.swing.*;

public class Calculadora {

    private int operacion1;
    private int operacion2;
    double resultado;

    //Constructor
    public Calculadora() {
        operacion1 = 0;
        operacion2 = 0;
        resultado = 0;
    }

    //metodos
    public void suma() {
        operacion1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor:"));
        operacion2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor:"));
        resultado = operacion1 + operacion2;
        JOptionPane.showInputDialog("El resultado es" + resultado);

    }

    public void resta() {
        operacion1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor:"));
        operacion2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor:"));
        resultado = operacion1 - operacion2;
        JOptionPane.showInputDialog("El resultado es" + resultado);
    }

    public void multiplicacion () {
        operacion1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor:"));
        operacion2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor:"));
        resultado = operacion1 * operacion2;
        JOptionPane.showInputDialog("El resultado es" + resultado);
    }

    public void division() {
        operacion1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor:"));
        operacion2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo valor:"));
        resultado = operacion1 / operacion2;
        JOptionPane.showInputDialog("El resultado es" + resultado);
    }
}