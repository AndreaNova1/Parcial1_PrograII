package Parcial;
import javax.swing.*;
import java.util.Scanner;

public class CalculadoraAvanzada {
    double base;
    double exponente;
    double resultado;


    public CalculadoraAvanzada() {
        base = 0;
        exponente = 0;
        resultado = 0;

    }
    public void Potencia(){
        {
            base = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor:"));
            exponente = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor:"));
            resultado = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor:"));
            resultado = Math.pow(base, exponente);
            JOptionPane.showInputDialog(+base+"Elevado al exponente"+exponente+"el resultado es:");
        }
    }
    public void Raiz(){

    }
    public void Seno(){

    }
    public void Coseno(){

    }
}
