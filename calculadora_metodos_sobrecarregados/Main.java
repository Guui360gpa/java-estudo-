package calculadora_metodos_sobrecarregados;

public class Main {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultado1 = calculadora.somar(10, 20);
        double resultado2 = calculadora.somar(2.5,3.8);
        int resultado3 = calculadora.somar(1,2,3);

        System.out.println("Resultado da soma de dois inteiros: " + resultado1);
        System.out.println("Resultado da soma de dois números decimais: " + resultado2);
        System.out.println("Resultado da soma de três inteiros: " + resultado3);
    }

}
