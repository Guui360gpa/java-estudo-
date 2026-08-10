package lista.exercicio.oo;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0, "João Silva");
        ContaBancaria conta2 = new ContaBancaria(500.0, "Maria Souza");

        conta.mostrarSaldo();
        conta2.mostrarSaldo();

        conta.depositar(200.0);
        conta2.sacar(100.0);

        conta.mostrarSaldo();
        conta2.mostrarSaldo();

        conta.sacar(500.0);
        conta2.depositar(300.0);

        conta.mostrarSaldo();
        conta2.mostrarSaldo();
    }
}
