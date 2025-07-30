package Exercicios.Interfaces.exercicio1.DesafioFinal.Principal;
import Exercicios.Interfaces.exercicio1.DesafioFinal.Modelos.MinhasPreferidas;
import Exercicios.Interfaces.exercicio1.DesafioFinal.Modelos.Musica;
import Exercicios.Interfaces.exercicio1.DesafioFinal.Modelos.Podcast;

public class Principal {
    public static void main(String[] args){

        Musica minhaMusica = new Musica("Forever", 240, "Hot in the Shade", "Kiss", "Rock");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i <50 ; i++) {
            minhaMusica.curte();
        }


        Podcast meuPodcast = new Podcast("BolhaDev", 3600, "Victoria Noronha", "Um podcast sobre desenvolvimento de software e carreira.");


        for (int i = 0; i <300 ; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i <300 ; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);


        System.out.println("\n--- Classificacoes e Mensagens das Preferidas ---");
        System.out.println("Classificacao da Musica '" + minhaMusica.getTitulo() + "': " + minhaMusica.getClassificacao());
        System.out.println("Classificacao do Podcast '" + meuPodcast.getTitulo() + "': " + meuPodcast.getClassificacao());
        System.out.println("Mensagem para Musica:");
        preferidas.inclui(minhaMusica); // Chama novamente para ver a mensagem
        System.out.println("Mensagem para Podcast:");
        preferidas.inclui(meuPodcast); // Chama novamente para ver a mensagem
    }
}
