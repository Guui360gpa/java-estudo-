package lista.exercicio.oo;
public class ExibirFicha {

    private String nome;
    private String curso;
    private String turma;

    public ExibirFicha(String nome, String curso, String turma){
        this.nome = nome;
        this.curso = curso;
        this.turma = turma;
    }

    public void exibirFicha(){
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Turma: " + turma);
    }

    public static void main(String[] args) {
        ExibirFicha exibirFicha = new ExibirFicha("Guilherme Paiva Alves", "DSM", "2º semestre de Técnicas de Programação I");
        exibirFicha.exibirFicha();
    }

}
