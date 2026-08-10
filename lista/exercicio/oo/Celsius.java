package lista.exercicio.oo;
public class Celsius {

    private float temperatura;

    public Celsius(float temperatura) {
        this.temperatura = temperatura;
    }

    public float converterParaFahrenheit() {
        return (temperatura * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Celsius celsius = new Celsius(25.0f);
        System.out.println("Fahrenheit: " + celsius.converterParaFahrenheit());
    }

}
