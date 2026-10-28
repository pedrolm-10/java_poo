package secao_6.for_exercicios;

import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            if (n%i==0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
