package lista.exercicio.oo;

public class ConsumoMedio {

    private double distancia;
    private double combustivel;

    public ConsumoMedio(double distancia, double combustivel) {
        this.distancia = distancia;
        this.combustivel = combustivel;
    }

    public double calcularConsumoMedio() {
        return distancia / combustivel;
    }

    public static void main(String[] args) {
        ConsumoMedio consumo = new ConsumoMedio(500, 40);
        double consumoMedio = consumo.calcularConsumoMedio();
        System.out.println("Consumo médio: " + consumoMedio + " km/l");
    }

}
