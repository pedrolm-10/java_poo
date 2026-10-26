package secao_5;

import java.util.Scanner;

public class exercicio_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 < n2) {
            int duracao = n2-n1;
            System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
        } else {
            int duracao = 24-n1+n2;
            System.out.println("O JOGO DUROU "+duracao+" HORA(S)");
        }
        sc.close();
    }
}
