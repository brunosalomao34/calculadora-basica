package service;

import java.util.Scanner;

public class Menu extends Calculadora{

    public void iniciarSistema() {
        Scanner entrada = new Scanner(System.in);
        int continuar = 1;

        while(continuar == 1) {
            double n1 = 0;
            double n2 = 0;

            System.out.println("""
                    =========================
                    EXPRESSÕES
                    =========================
                    1 - SOMA
                    2 - SUBTRAÇÃO
                    3 - MULTIPLICAÇÃO
                    4 - DIVISÃO""");
            System.out.print("Selecione uma opção: ");

            switch (entrada.nextInt()) {
                case 1:
                    System.out.println(somarValores());
                    break;

                case 2:
                    System.out.println(subtrairValores());
                    break;

                case 3:
                    System.out.println(multiplicarValores());
                    break;

                case 4:
                    System.out.println(dividirValores());
                    break;

                default:
                    System.out.println("OPÇÃO INVALIDA!!!");
                    break;
            }

            System.out.println();
            System.out.println("""
                    =========================
                    DESEJA CONTINUAR?
                    =========================
                    1 - SIM
                    0 - NÃO""");
            System.out.print("Selecione uma opção: ");

            // Verifica a opção do usuario para encerrar ou continuar o sistema
            do {
                continuar = entrada.nextInt();
                if (continuar == 0) {
                    System.out.println("ENCERRANDO...");
                } else if (continuar == 1) {
                    System.out.println();
                } else {
                    System.out.println("OPÇÃO INVALIDA!!!");
                    System.out.print("Selecione uma opção: ");
                }
            } while (continuar != 1 & continuar != 0);

        }

    }

}
