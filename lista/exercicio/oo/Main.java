package lista.exercicio.oo;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Rex", 3);
        Cachorro cachorro2 = new Cachorro("Buddy", 5);

        System.out.println(cachorro1);
        cachorro1.latir();

        System.out.println(cachorro2);
        cachorro2.latir();
    }
}
