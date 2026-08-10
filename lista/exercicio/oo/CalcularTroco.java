package lista.exercicio.oo;
public class CalcularTroco {

    private double valorPago;
    private double valorTotal;

    public CalcularTroco(double valorPago, double valorTotal) {
        this.valorPago = valorPago;
        this.valorTotal = valorTotal;
    }

    public double calcularTroco() {
        return valorPago - valorTotal;
    }

    public static void main(String[] args) {
        double valorPago = 50.0;
        double valorTotal = 30.0;

        CalcularTroco troco = new CalcularTroco(valorPago, valorTotal);
        double resultadoTroco = troco.calcularTroco();

        System.out.println("O troco a ser devolvido é: R$ " + resultadoTroco);
    }

}
