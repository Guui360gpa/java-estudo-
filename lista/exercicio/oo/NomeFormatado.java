package lista.exercicio.oo;

import java.util.Scanner;

public class NomeFormatado {

    private String nome;
    private String sobrenome;

    public NomeFormatado(String nome,String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String exibirNomeCompleto(){
        return nome + " " + sobrenome;
    }

    public String exibirNomeCompletoMaiusculo(){
        return (nome + " " + sobrenome).toUpperCase();
    }

    public int exibirQuantidadeCaracteres(){
        return (nome + sobrenome).length();
    }

    public String exibirIniciais(){
        return nome.charAt(0) + "." + sobrenome.charAt(0);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Digite o nome: ");
        String nome = read.nextLine();

        System.out.print("Digite o sobrenome: ");
        String sobrenome = read.nextLine();

        NomeFormatado nomeFormatado = new NomeFormatado(nome, sobrenome);

        System.out.println("Iniciais: " + nomeFormatado.exibirIniciais());
    }

}
