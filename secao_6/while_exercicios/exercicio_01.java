package secao_6.while_exercicios;

import java.util.Scanner;

public class exercicio_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha:");
        int senha = sc.nextInt();

        while (senha!= 2002) {
            System.out.println("Senha inválida");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido");
        sc.close();
    }
}
