package lista.exercicio.oo;
public class ExibirNomeCurso {

    private String nome;
    private String curso;

    public ExibirNomeCurso(String nome, String curso){
        this.nome = nome;
        this.curso = curso;
    }

    public void exibir(){
        System.out.println("Nome:" + nome);
        System.out.println("Curso: " + curso);
    }

    public static void main(String[] args) {
        ExibirNomeCurso exibirNomeCurso = new ExibirNomeCurso("Guilherme Paiva Alves", "DSM");
        exibirNomeCurso.exibir();
    }
}