package lista.exercicio.oo;

public class Lampada {

    private boolean ligada;

    public Lampada() {
        this.ligada = false;
    }

    public void ligar() {
        this.ligada = true;
        System.out.println("Ligando lâmpada...");
    }

    public void desligar() {
        this.ligada = false;
        System.out.println("Desligando lâmpada...");
    }

    public void mostrarEstado() {
        if (ligada) {
            System.out.println("A lâmpada está ligada.");
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }

}
