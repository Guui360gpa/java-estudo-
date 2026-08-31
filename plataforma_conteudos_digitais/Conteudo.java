package plataforma_conteudos_digitais;

public class Conteudo {

    public String titulo;
    public int duracaoMinutos;

    public Conteudo(String titulo,int duracaoMinutos){
        this.titulo = titulo;
        this.duracaoMinutos = duracaoMinutos;
    }

    public String mostrarResumo(){
        return "Titulo: " + this.titulo + "\nDuração: " + this.duracaoMinutos + " minutos";
    }

}
