package secao_5;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double cq = 4.00;
        double xs = 4.50;
        double xb = 5.00;
        double tr = 2.00;
        double refri = 1.50;

        int codigo = sc.nextInt();
        int quant = sc.nextInt();

        if (codigo == 1) {
            System.out.printf("Total: R$ %.2f",quant * cq);
        } else if(codigo == 2) {
            System.out.printf("Total: R$ %.2f",quant * xs);
        } else if(codigo == 3) {
            System.out.printf("Total: R$ %.2f",quant * xb);
        }else if(codigo == 4) {
            System.out.printf("Total: R$ %.2f",quant * tr);
        }else if(codigo == 5) {
            System.out.printf("Total: R$ %.2f",quant * refri);
        } else {
            System.out.println("Pedido inválido");
        }
        
        sc.close();
    }
}
