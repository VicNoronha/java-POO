package Exercicios.Interfaces.exercicio1.DesafioFinal.Modelos;

public class Musica extends Audio { // Musica herda de Audio
    private String album;
    private String cantor;
    private String genero;


    public Musica(String titulo, int duracao, String album, String cantor, String genero) {
        super(titulo, duracao);
        this.album = album;
        this.cantor = cantor;
        this.genero = genero;
    }

    // --- Getters ---
    public String getAlbum() {
        return album;
    }

    public String getCantor() {
        return cantor;
    }

    public String getGenero() {
        return genero;
    }

    // --- Setters ---
    public void setAlbum(String album) {
        this.album = album;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    // --- Método getClassificacao() ---
    @Override
    public int getClassificacao(){

        if(this.getTotalReproducoes() > 2000){
            return 10; // Classificação alta para muitas reproduções
        } else {
            return 7; // Classificação padrão para menos reproduções
        }
    }
}
