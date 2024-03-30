package Opcoes;

import java.math.BigInteger;
import java.util.Scanner;

public class CalculoFatorial {
    public static void main() {

        Scanner dado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = dado.nextInt();

        BigInteger Fatorial = CalculoFatorial(numero);
        System.out.println("O Fatorial do número " + numero + " é: " + Fatorial);
    }

    private static BigInteger CalculoFatorial(int a) {

        if (a < 0) {
            System.out.println("Não pode número negativo.");
            return BigInteger.valueOf(-1);
        } else {
            BigInteger fatorial = BigInteger.ONE;

            for (int i = 1; i <= a; i++) {
                fatorial = fatorial.multiply(BigInteger.valueOf(i));
            }
            return fatorial;
        }
    }

    public static void Executar() {
        main();
    }
}
