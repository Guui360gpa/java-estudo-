package lista.exercicio.oo;
public class ExibirNomeIdade {
    private String nome;
    private int idade;

    public ExibirNomeIdade(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void exibir(){
        System.out.printf("%s possui %d anos.", nome, idade);
    }
    
    public static void main(String[] args) {
        ExibirNomeIdade exibir = new ExibirNomeIdade("Guilherme", 18);
        exibir.exibir();
    }
}
