package Opcoes;

import java.util.Scanner;
public class DiferencaValores {
    public static void main() {

        Scanner dados = new Scanner(System.in);

        int valorUm, valorDois, diferenca;

        System.out.println("\nDigite o 1º valor: ");
        valorUm = dados.nextInt();

        System.out.println("\nDigite o 2º valor: ");
        valorDois = dados.nextInt();

        diferenca = valorUm - valorDois;

        System.out.println("\nA diferença entre o valor " + valorUm + " e o valor " + valorDois + " é: " + diferenca);
    }

    public static void Executar() {
        main();
    }
}