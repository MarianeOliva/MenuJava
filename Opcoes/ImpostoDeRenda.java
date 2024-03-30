package Opcoes;

import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main() {

        Scanner dados = new Scanner(System.in);

        double salarioBruto, calculoPer, salarioLiquido;
        double percentual = 27.5;

        System.out.println("Digite o sálario bruto: ");
        salarioBruto = dados.nextDouble();

        calculoPer = (salarioBruto * percentual) / 100;
        salarioLiquido = salarioBruto - calculoPer;

        System.out.println("\nO sálario liquído com um desconto de 27,5% é: " + salarioLiquido);
    }

    public static void Executar() {
        main();
    }
}