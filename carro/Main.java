package carro;

public class Main {

    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", "Prata", 2020, "Flex", false, 0);

        System.out.println("Estado inicial:");
        carro1.mostrarDados();

        carro1.acelerar(); // Tentativa de acelerar com o carro desligado

        carro1.ligar();
        
        carro1.mostrarDados();

        System.out.println("acelerando...");
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();

        carro1.mostrarDados();

        carro1.buzinar();

        System.out.println("freando...");

        carro1.frear();

        carro1.mostrarDados();

        carro1.desligar();
        carro1.mostrarDados();
    }

}
