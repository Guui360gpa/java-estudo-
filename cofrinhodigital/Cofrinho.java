package cofrinhodigital;

public class Cofrinho {

    private String objetivo;

    private double saldo;

    public Cofrinho(String objetivo){
        this.objetivo = objetivo;
        this.saldo = 0;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            System.out.println("Depositando R$" + valor);
            saldo += valor;
        }else{
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void retirar(double valor){
        if(valor > 0 && valor <= saldo){
            System.out.println("Retirando R$" + valor);
            saldo -= valor;
        }else{
            System.out.println("Valor inválido para retirada.");
        }
    }

    public String mostrarResumo(){
        return "Objetivo: " + objetivo + "\n" + "Saldo: R$" + saldo;
    }



}
