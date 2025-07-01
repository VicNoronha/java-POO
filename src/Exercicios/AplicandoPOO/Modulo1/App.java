package Exercicios.AplicandoPOO.Modulo1;

public class App {
    public static void main(String[] args) {
        // Criando um objeto Musica usando o construtor
        Musica musica = new Musica("Crazy In Love", "Beyonce", 2006);

        musica.exibaFichaTecnica();

        musica.avalia(7.0); // Avalia a musica
        musica.avalia(9);
        musica.avalia(10);

        musica.exibaFichaTecnica();
        musica.getMediaAvaliacoes();
        System.out.println(" A média de avaliacoes dessa música é: " +String.format("%.2f", musica.getMediaAvaliacoes()));

    }
}