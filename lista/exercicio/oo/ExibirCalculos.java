package lista.exercicio.oo;
import java.util.Scanner;

public class ExibirCalculos {

    private double valor1;
    private double valor2;

    public ExibirCalculos(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void exibirSoma(){
        System.out.println("Soma: " + (valor1 + valor2));
    }

    public void exibirSubtracao(){
        System.out.println("Subtração: " + (valor1 - valor2));
    }

    public void exibirMultiplicacao(){
        System.out.println("Multiplicação: " + (valor1 * valor2));
    }

    public void exibirDivisao(){
        System.out.println("Divisão: " + (valor1 / valor2));

    }

    public void exibirRestoDivisao(){
        System.out.println("Resto da Divisão: " + (valor1 % valor2));
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        var num1 = read.nextDouble();

        System.out.println("Digite o segundo número: ");
        var num2 = read.nextDouble();

        ExibirCalculos exibir = new ExibirCalculos(num1, num2);
        exibir.exibirSoma();
        exibir.exibirSubtracao();
        exibir.exibirMultiplicacao();
        exibir.exibirDivisao();
        exibir.exibirRestoDivisao();
    }

}
