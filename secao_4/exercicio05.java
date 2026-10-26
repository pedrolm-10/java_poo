package secao_4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1 = sc.nextInt();
        int n1 = sc.nextInt();
        double valor1 = sc.nextDouble();
        int cod2 = sc.nextInt();
	    int n2 = sc.nextInt();
	    double valor2 = sc.nextDouble();

        double preco = n1 * valor1 + n2 * valor2;
        System.out.println("Codigo "+cod1+" e "+cod2);
        System.out.printf("VALOR A PAGAR: R$ %.2f",preco);

        sc.close();
    }
}
