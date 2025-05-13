package service;

import java.util.Scanner;

public class Calculadora {
    Scanner entrada = new Scanner(System.in);
    private double n1;
    private double n2;

    public void receberValores() {
        System.out.print("Digite o primeiro número: ");
        n1 = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = entrada.nextDouble();
    }

    public double somarValores() {
        receberValores();
        double resultado = n1 + n2;
        return resultado;
    }

    public double subtrairValores() {
        receberValores();
        double resultado = n1 - n2;
        return resultado;
    }

    public double multiplicarValores() {
        receberValores();
        double resultado = n1 * n2;
        return resultado;
    }

    public double dividirValores() {
        receberValores();
        double resultado = n1 / n2;
        return resultado;
    }

}
