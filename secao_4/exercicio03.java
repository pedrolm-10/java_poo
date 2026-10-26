package secao_4;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        int num3 = sc.nextInt();
        System.out.println("Digite o quarto numero: ");
        int num4 = sc.nextInt();

        int dif = num1 * num2 - num3 * num4;

        System.out.println("DIFERENCA: " + dif);

        sc.close();
    }
}
