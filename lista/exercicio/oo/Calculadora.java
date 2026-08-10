package lista.exercicio.oo;

import java.util.Scanner;

public class Calculadora {

    private double valor1;
    private double valor2;


    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void exibirMenu() {
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {

            System.out.print("Digite o primeiro valor: ");
            double valor1 = read.nextDouble();

            System.out.print("Digite o segundo valor: ");
            double valor2 = read.nextDouble();

            Calculadora calculadora = new Calculadora(valor1, valor2);

            calculadora.exibirMenu();

            opcao = read.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Soma: " + (valor1 + valor2));
                    break;
                case 2:
                    System.out.println("Subtração: " + (valor1 - valor2));
                    break;
                case 3:
                    System.out.println("Multiplicação: " + (valor1 * valor2));
                    break;
                case 4:
                    System.out.println("Divisão: " + (valor1 / valor2));
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("Deseja realizar outra operação? (1 - Sim, 0 - Não)");
            opcao = read.nextInt();

        }

    }
}
