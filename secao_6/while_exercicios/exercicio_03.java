package secao_6.while_exercicios;

import java.util.Scanner;

public class exercicio_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tipo do combustível abastecido (1 - Álcool, 2 - Gasolina, 3 - Diesel, 4 - Fim)");
        int cod = sc.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (cod != 4) {
            if (cod==1) {
                alcool++;   
            } else if (cod==2) {
                gasolina++;
            } else if (cod==3) {
                diesel++;
            }
            cod = sc.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);

        sc.close();
    }
}
