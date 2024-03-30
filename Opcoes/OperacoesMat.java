package Opcoes;

import java.util.Scanner;

public class OperacoesMat {
    public static void main() {

        Scanner dado = new Scanner(System.in);

        System.out.println("Insira dois números para realizar as operações matemáticas: ");
        double num = dado.nextDouble();
        double numDois = dado.nextDouble();

        System.out.println("\nA Soma é: " + (num + numDois));
        System.out.println("A Substração é: " + Subtracao(num, numDois));
        Divisao(num, numDois);
        System.out.println("A Multiplicação é: " + Multiplicacao(num, numDois));
    }

    public static double Subtracao(double num, double numDois) {
        double subtracao = num - numDois;
        return subtracao;
    }

    public static void Divisao(double a, double b) {
        double divisao = a / b;
        System.out.println("A Divisão é: " + divisao);
    }

    private static double Multiplicacao(double a, double b) {
        double multiplicacao = a * b;
        return multiplicacao;
    }

    public static void Executar() {
        main();
    }
}