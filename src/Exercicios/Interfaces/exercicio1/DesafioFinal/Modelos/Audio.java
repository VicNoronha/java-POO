package Exercicios.Interfaces.exercicio1.DesafioFinal.Modelos;

public class Audio {
    // Atributos (campos) - Usando convenção camelCase
    private String titulo;
    private int duracao;
    private int totalReproducoes;
    private int totalCurtidas;



    public Audio() {
        this.totalReproducoes = 0;
        this.totalCurtidas = 0;

    }


    public Audio(String titulo, int duracao) {
        this();
        this.titulo = titulo;
        this.duracao = duracao;
    }


    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


    public void curte(){
        this.totalCurtidas++;

    }

    public void reproduz(){
        this.totalReproducoes++;

    }

    public int getClassificacao(){
        return totalReproducoes / 100;
    }
}