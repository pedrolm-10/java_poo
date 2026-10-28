package secao_6.for_exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de casos: ");
        int n = sc.nextInt();

        for (int i = 1; i<= n; i++){
            double v1 = sc.nextDouble();           
            double v2 = sc.nextDouble();           
            double v3 = sc.nextDouble();
            double resultado = (v1*2+v2*3+v3*5)/(2+3+5);
            System.out.printf("%.1f%n",resultado);
        }
        sc.close();
    }
}
