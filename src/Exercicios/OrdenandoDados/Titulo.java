package Exercicios.OrdenandoDados;

import java.util.ArrayList;
import java.util.Collections; // Importa Collections para usar o método sort()

// Crie uma classe Titulo com um atributo nome do tipo String.
// Implemente a interface Comparable na classe para que seja
// possível ordenar uma lista de objetos Titulo.

public class Titulo implements Comparable<Titulo> { // 1. Implementa Comparable<Titulo>
    private String nome;


    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // Opcional: Adicionar um setter se precisar mudar o nome depois da criação
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Sobrescreve o método toString para uma representação legível do objeto
    @Override
    public String toString() {
        return "Título: " + nome;
    }

    // 3. Implementa o método compareTo para definir a ordem natural
    // A ordem natural será baseada no nome (ordem alfabética)
    @Override
    public int compareTo(Titulo outroTitulo) {
        // Usa o compareTo da classe String, que já ordena alfabeticamente
        return this.nome.compareTo(outroTitulo.nome);
    }


    public static void main(String[] args) {


        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(new Titulo("O Poderoso Chefão"));
        listaDeTitulos.add(new Titulo("Matrix"));
        listaDeTitulos.add(new Titulo("Interestelar"));
        listaDeTitulos.add(new Titulo("A Origem"));
        listaDeTitulos.add(new Titulo("Blade Runner 2049"));

        System.out.println("Lista de Títulos: ");
        for (Titulo titulo : listaDeTitulos) {
            System.out.println(titulo);
        }

        // 4. Utiliza Collections.sort() para ordenar a lista
        // Isso funciona porque a classe Titulo agora implementa Comparable
        Collections.sort(listaDeTitulos);

        System.out.println("\nLista de Títulos DEPOIS da ordenação (por nome):");
        for (Titulo titulo : listaDeTitulos) {
            System.out.println(titulo);
        }
    }
}