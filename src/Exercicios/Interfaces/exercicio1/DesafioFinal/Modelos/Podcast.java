package Exercicios.Interfaces.exercicio1.DesafioFinal.Modelos;

public class Podcast extends Audio {
    private String apresentador;
    private String descricao;


    public Podcast(String titulo, int duracao, String apresentador, String descricao) {
        super(titulo, duracao);
        this.apresentador = apresentador;
        this.descricao = descricao;
    }


    public String getApresentador() {
        return apresentador;
    }

    public String getDescricao() {
        return descricao;
    }


    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Override
    public int getClassificacao(){

        if (this.getTotalCurtidas() > 500){
            return 10;
        } else {
            return 8;
        }
    }
}
