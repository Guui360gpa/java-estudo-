package lista.exercicio.oo;

import java.util.Scanner;

public class FichaOrganizada {

    private String nome;
    private int idade;
    private String curso;

    public FichaOrganizada(String nome, int idade, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public void exibirFicha() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = read.nextLine();

        System.out.print("Digite a idade: ");
        int idade = read.nextInt();
        read.nextLine(); // Limpar o buffer

        System.out.print("Digite o curso: ");
        String curso = read.nextLine();

        FichaOrganizada ficha = new FichaOrganizada(nome, idade, curso);
        ficha.exibirFicha();
    }

}
