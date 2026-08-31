package cofrinhodigital;

public class Main {
    public static void main(String[] args) {
        
        Cofrinho cofrinho = new Cofrinho("Viagem");

        cofrinho.depositar(500.00);
        cofrinho.depositar(200.00);
        cofrinho.retirar(150.00);


        cofrinho.retirar(1000.00);
        cofrinho.depositar(-50.00); 

        System.out.println(cofrinho.mostrarResumo());
    }
}
