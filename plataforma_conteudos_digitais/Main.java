package plataforma_conteudos_digitais;

public class Main {

    public static void main(String[] args) {
        VideoAula video = new VideoAula("Aula de Java ", 20,"Youtube");

        Podcast podcast = new Podcast("Podcast de Java", 40, "Guilherme");

        System.out.println(video.mostrarResumo());
        video.reproduzirVideo();

        System.out.println("\n------------------------------\n");

        System.out.println(podcast.mostrarResumo());
        podcast.ouvirPodcast();

    }

}
