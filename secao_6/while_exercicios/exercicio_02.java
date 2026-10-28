package secao_6.while_exercicios;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o X");
        int x = sc.nextInt();
        System.out.println("Digite o Y");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x > 0 && y < 0) {
                System.out.println("Quarto");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else {
                System.out.println("Terceiro");
            }
            System.out.println("Digite o X");
            x = sc.nextInt();
            System.out.println("Digite o Y");
            y = sc.nextInt();
        }
        sc.close();
    }
}
