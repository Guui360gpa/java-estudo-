import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        String nome;
        String turma;
        String curso;
        Scanner read  = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = read.nextLine();

        System.out.println("Digite o nome da turma:");
        turma = read.nextLine();

        System.out.println("Digite o nome do curso:");
        curso = read.nextLine();

        System.out.printf("Nome: %s\n Turma: %s\n Curso: %s\n",nome,turma,curso);
    }
}
