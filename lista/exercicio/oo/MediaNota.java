package lista.exercicio.oo;
public class MediaNota {

    private double nota1;
    private double nota2;
    private double nota3;

    public MediaNota(double nota1, double nota2, double nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public void calcularMedia() {
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Média: " + media);
    }

    public static void main(String[] args) {
        MediaNota mediaNota = new MediaNota(8.0, 7.5, 9.0);
        mediaNota.calcularMedia();
    }

}
