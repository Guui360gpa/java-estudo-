package lista.exercicio.oo;

public class Cachorro {

    private String nome;
    private int idade;

    public Cachorro(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void latir() {
        System.out.println(nome + " está latindo!");
    }

    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}
