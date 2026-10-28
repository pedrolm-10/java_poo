package secao_6.for_exercicios;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pares:");
        int n = sc.nextInt();

        for (int i = 0; i <n; i++){
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            double div = (double) n1/n2;
            if (n2 == 0) {
                System.out.println("Divisão impossível");
            } else {
                System.out.println(div);
            }
        }
        sc.close();
    }
}
