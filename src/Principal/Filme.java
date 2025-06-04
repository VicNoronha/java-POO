package Principal;

public class Filme extends Titulo {
    private int duracaoEmMinutos;

    public Filme(String nome, int duracaoEmMinutos) {
        super(nome); // Chama o construtor da superclasse Titulo
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public String toString() {
        return "Filme: " + getNome() + " (" + duracaoEmMinutos + " min)";
    }
}