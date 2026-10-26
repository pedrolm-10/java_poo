package testes;
class Conta {
    String titular;
    double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Novo saldo: R$ " + saldo);
    }
}

public class ContaPrincipal {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.titular = "João";
        conta.saldo = 0;

        conta.depositar(100);
        conta.depositar(50);
    }
}
