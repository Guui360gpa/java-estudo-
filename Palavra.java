import java.util.Scanner;

public class Palavra {

    private String palavra;

    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    public int exibirTamanho() {
        return palavra.length();
    }

    public String exibirPrimeiroCaracter() {
        return String.valueOf(palavra.charAt(0));
    }

    public String exibirUltimoCaracter() {
        return String.valueOf(palavra.charAt(palavra.length() - 1));
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String input = read.nextLine();

        Palavra palavra = new Palavra(input);

        System.out.println("Tamanho da palavra: " + palavra.exibirTamanho());
        System.out.println("Primeiro caractere: " + palavra.exibirPrimeiroCaracter());
        System.out.println("Último caractere: " + palavra.exibirUltimoCaracter());
    }

}
