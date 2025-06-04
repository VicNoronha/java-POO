package Principal;

public class Serie extends Titulo {
    private int temporadas;

    public Serie(String nome, int temporadas) {
        super(nome);
        this.temporadas = temporadas;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    @Override
    public String toString() {
        return "Série: " + getNome() + " (" + temporadas + " temporadas)";
    }
}
