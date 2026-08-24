package carro;

public class Carro {
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private String combustivel;
    private boolean ligado;
    int velocidade;

    public Carro(String marca, String modelo, String cor, int ano, String combustivel, boolean ligado, int velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.combustivel = combustivel;
        this.ligado = ligado;
        this.velocidade = velocidade;
    }

    public void acelerar(){
        if(ligado) {
            velocidade += 10;
        } else {
            System.out.println("O carro está desligado. Ligue o carro antes de acelerar.");
        }
    }

    public void frear(){
        velocidade -= 10;
    }

    public void ligar(){
        System.out.println("Ligando o carro...");
        ligado = true;
    }

    public void desligar(){
        System.out.println("Desligando o carro...");
        ligado = false;
    }

    public void buzinar(){
        System.out.println("Biiiip!");
    }

    public void mostrarDados(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Combustível: " + combustivel);
        System.out.println("Ligado: " + ligado);
        System.out.println("Velocidade: " + velocidade);
        
        System.out.println();
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getVelocidade() {
        return velocidade;
    }
}
