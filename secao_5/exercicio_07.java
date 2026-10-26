package secao_5;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();

        if (n1 >0 && n2>0) {
            System.out.println("Q1");
        } else if (n1 >0 && n2<0) {
            System.out.println("Q4");
        } else if (n1<0 && n2>0) {
            System.out.println("Q2");
        } else if (n1<0 && n2<0) {
            System.out.println("Q3");
        } else if (n1 == 0 && n2 == 0) {
            System.out.println("Origem");
        } else if (n1 ==0){
            System.out.println("Eixo X");
        } else {
            System.out.println("Eixo Y");
        }
        sc.close();
    }
}
