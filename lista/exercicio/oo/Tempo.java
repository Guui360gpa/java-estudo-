package lista.exercicio.oo;
public class Tempo {

    private int horas;
    private int minutos;
    private int segundos;

    public Tempo(int segundos) {
        this.segundos = segundos;
    }

    public void converterParaHorasMinutosSegundos() {
        this.horas = segundos / 3600;
        this.minutos = (segundos % 3600) / 60;
        this.segundos = segundos % 60;
    }

    public void exibirTempoFormatado() {
        System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
    }

    public static void main(String[] args) {
        Tempo tempo = new Tempo(3661);
        tempo.converterParaHorasMinutosSegundos();
        tempo.exibirTempoFormatado();
    }
}
