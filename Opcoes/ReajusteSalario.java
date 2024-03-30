package Opcoes;

import java.util.Scanner;

public class ReajusteSalario {
    public static void main() {

        Scanner dados = new Scanner(System.in);

        double salario, percentual, aumentoPer, novoSal;

        System.out.println("\nDigite seu sálario: ");
        salario = dados.nextDouble();

        System.out.println("\nDigite a porcentagem de aumento: ");
        percentual = dados.nextDouble();

        aumentoPer = (salario * percentual) / 100;

        novoSal = salario + aumentoPer;

        System.out.println("\nO sálario com o novo reajuste de " + percentual + "%, será de: " + novoSal);

    }

    static void Executar() {
        main();
    }
}

