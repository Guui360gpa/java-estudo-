package lista.exercicio.oo;
public class TrocarValores {

    private int valor1;
    private int valor2;
    private int variavelAuxiliar;

    public TrocarValores(int valor1, int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void trocar(){
        variavelAuxiliar = valor1;
        valor1 = valor2;
        valor2 = variavelAuxiliar;

        System.out.println("Valor 1: " + valor1);
        System.out.println("Valor 2: " + valor2);
    }

    public static void main(String[] args) {
        TrocarValores trocar = new TrocarValores(10, 20);
        trocar.trocar();
    }

}
