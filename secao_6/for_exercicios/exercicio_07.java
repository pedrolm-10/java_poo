package secao_6.for_exercicios;

import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int n = sc.nextInt();

        for(int i=1; i <= n; i++){
            System.out.println(i+" "+i*i+" "+i*i*i);
        }
        sc.close();
    }
}
