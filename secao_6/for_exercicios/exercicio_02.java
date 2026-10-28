package secao_6.for_exercicios;

import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números: ");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;

        for (int i = 0; i < n; i++ ){
            int o = sc.nextInt();
            if (o>=10 && o<=20) {
                in++;
            } else {
                out++;                
            }
        }
        System.out.println(in+" in");
        System.out.println(out+" out");
        sc.close();
    }   
}
