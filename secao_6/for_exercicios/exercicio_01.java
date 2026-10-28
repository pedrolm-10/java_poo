package secao_6.for_exercicios;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0 )  {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
