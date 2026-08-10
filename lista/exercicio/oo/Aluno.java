package lista.exercicio.oo;


public class Aluno {

    private String nome;
    private int idade;
    private float altura;
    private float primeiraNota;
    private float segundaNota;
    //MATRICULADO ou TRANCADA
    private SituacaoMatricula matricula;

    public Aluno(String nome, int idade, float altura, float primeiraNota, float segundaNota){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.primeiraNota = primeiraNota;
        this.segundaNota = segundaNota;
        this.matricula = SituacaoMatricula.MATRICULADO;
    }

    public void mostrarDados(){
        System.out.printf("Nome: %s%nIdade: %d%nAltura: %.2f%nPrimeira Nota: %.2f%nSegunda Nota: %.2f%nSituação: %s%n",
                nome, idade, altura, primeiraNota, segundaNota, matricula);
    }

    public float calcularMedia(){
        return (primeiraNota + segundaNota) / 2;
    }
}
