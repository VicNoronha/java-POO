package Exercicios.AplicandoPOO.Modulo1;
/*Crie uma classe Musica com atributos titulo, artista, anoLancamento,
 avaliacao e num Avaliacoes, e métodos para exibir a ficha técnica,
  avaliar a música e calcular a média de avaliações.
 */

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;

    public Musica(String titulo, String artista, int anoLancamento) {
        this.titulo = titulo;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.somaDasAvaliacoes = 0.0;
        this.totalDeAvaliacoes = 0;
    }

    public void exibaFichaTecnica() {
        System.out.println("\n--- Ficha Tecnica da Musica ---");
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lancamento: " + anoLancamento);
        System.out.println("Total de avaliacoes: " + totalDeAvaliacoes);

        if (totalDeAvaliacoes > 0) {
            double media = somaDasAvaliacoes / totalDeAvaliacoes;
            System.out.println("A media das avaliacoes e: " + String.format("%.2f", media));
        } else {
            System.out.println("Ainda nao ha avaliacoes para esta musica.");
        }
        System.out.println("-----------------------------\n");
    }

    public void avalia(double nota) {
        if (nota >= 0 && nota <= 10) { // Validacao da nota entre 0 e 10
            this.somaDasAvaliacoes += nota;
            this.totalDeAvaliacoes++;
            System.out.println("Avaliacao de " + nota + " registrada para '" + titulo + "'.");
        } else {
            System.out.println("Nota invalida. Por favor, insira uma nota entre 0 e 10.");
        }
    }

    public double getMediaAvaliacoes() {
        if (totalDeAvaliacoes == 0) {
            return 0.0;
        }
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}