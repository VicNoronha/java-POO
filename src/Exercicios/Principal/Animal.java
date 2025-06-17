package Exercicios.Principal;

public class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void emitirSom() {
        System.out.println(nome + " faz um som.");
    }

    @Override
    public String toString() {
        return "Animal: " + nome;
    }
}