package Opcoes;

import java.util.Scanner;

import Opcoes.CalculoFatorial;
import Opcoes.DiferencaValores;
import Opcoes.ImpostoDeRenda;
import Opcoes.ReajusteSalario;
import Opcoes.OperacoesMat;

public class Menu {

    private static String[] args;

    public static void main(String[] args) {

        Scanner dado = new Scanner(System.in);

        int menu;

        while (true) {

            System.out.printf("\nEscolha uma opção:" +
                    "%n1. Calcular novo salário após reajuste" +
                    "%n2. Calcular diferença entre dois valores" +
                    "%n3. Realizar as 4 operações matemáticas" +
                    "%n4. Calcular salário líquido com imposto de renda de 27,5%" +
                    "%n5. Calcular fatorial" +
                    "%n0. Sair" +
                    "%n");

            menu = dado.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\nOpção 1 selecionada.");
                    ReajusteSalario.Executar();
                    break;
                case 2:
                    System.out.println("\nOpção 2 selecionada.");
                    DiferencaValores.Executar();
                    break;
                case 3:
                    System.out.println("\nOpção 3 selecionada.");
                    OperacoesMat.Executar();
                    break;
                case 4:
                    System.out.println("\nOpção 4 selecionada.");
                    ImpostoDeRenda.Executar();
                    break;
                case 5:
                    System.out.println("\nOpção 5 selecionada.");
                    CalculoFatorial.Executar();
                    break;
                case 0:
                    System.out.println("\nEncerrando o programa. Até logo!");
                    break;
                default:
                    System.out.println("\nOpção inválida. Tente novamente.");
            }
        }
    }
}