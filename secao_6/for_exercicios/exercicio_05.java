package secao_6.for_exercicios;

import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int n = sc.nextInt();
        int fatorial = 1;
         
        for (int i = n; i > 1; i--){
            fatorial *= i;
        }
        System.out.println(fatorial);
        sc.close();
    }
}
