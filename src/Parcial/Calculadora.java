package Parcial;

import javax.swing.*;

public class Calculadora {

    private int operacion1;
    private int operacion2;
    double resultado;

   //Constructor
public Calculadora(){
    operacion1=0;
    operacion2=0;
    resultado=0;
}
//metodos
    public void suma(){
    operacion1=Integer.parseInt(JOptionPane.showInputDialog("Digite el primer valor:"));

    }
}