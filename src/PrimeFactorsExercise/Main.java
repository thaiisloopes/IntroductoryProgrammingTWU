package PrimeFactorsExercise;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um número inteiro: ");
        n = ler.nextInt();

        generate(n);
    }

    public static void generate(int n) {
        for (int i = 2; i <= n; i++) {
            boolean eDivisivel = n % i == 0;

            if (eDivisivel && ePrimo(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean ePrimo(int n) {
        boolean ePrimo = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ePrimo = false;
                break;
            }
        }

        return ePrimo;
    }
}
