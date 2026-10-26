package secao_5;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();

        if (n>=0 && n<=25) {
            System.out.println("Intervalo (0,25)");
        } else if (n>=25.01 && n<=50) {
            System.out.println("Intervalo (25,50)");
        } else  if (n>=50.01 && n<=75) {
            System.out.println("Intervalo (50,75");
        } else if (n>=75.01 && n<=100) {
            System.out.println("Intervalo (75,100");
        } else {
            System.out.println("Fora de intervalo");
        }
        sc.close();
    }
}
