package secao_4;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número do funcionário: ");
        int nfuncionario = sc.nextInt();
        System.out.println("Digite quantas horas foram trabalhadas: ");
        int horas = sc.nextInt();
        System.out.println("Digite quantos recebe por horas trabalhada: ");
        double recebe = sc.nextDouble();
        

        double salario = horas * recebe;
        System.out.println("NUMBER = "+ nfuncionario);
        System.out.printf("SALARY = U$ %.2f %n", salario);
        
        sc.close();
    }
}
