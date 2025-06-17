package Exercicios.OrdenandoDados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como LinkedList.
// Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.

public class DemonstracaoListas {
    public static void main(String[] args) {
        System.out.println("--- Usando ArrayList como implementação da interface List ---");

        List<String> minhaLista = new ArrayList<>();

        // Adicionando elementos à lista
        minhaLista.add("Elemento A - ArrayList");
        minhaLista.add("Elemento B - ArrayList");
        minhaLista.add("Elemento C - ArrayList");

        // Imprimindo a lista. O comportamento é o de um ArrayList.
        System.out.println("Lista de Strings (ArrayList): " + minhaLista);
        System.out.println("Tamanho da lista: " + minhaLista.size());
        System.out.println("Elemento no índice 1: " + minhaLista.get(1)); // Acesso rápido por índice
        System.out.println("--------------------------------------------------");


        System.out.println("\n--- Trocando para LinkedList como implementação da interface List ---");

        // 2. A mesma variável 'minhaLista' agora é instanciada com LinkedList.
        //    Isso "descarta" a referência ao ArrayList anterior (que será coletado pelo GC)
        //    e faz com que 'minhaLista' agora se refira a um novo objeto LinkedList.
        minhaLista = new LinkedList<>();

        // Adicionando elementos à nova lista (que agora é um LinkedList)
        minhaLista.add("Elemento X - LinkedList");
        minhaLista.add("Elemento Y - LinkedList");
        minhaLista.add("Elemento Z - LinkedList");
        minhaLista.add("Elemento W - LinkedList");


        // Imprimindo a lista. O comportamento é o de um LinkedList (mas os métodos da interface List são os mesmos).
        System.out.println("Lista de Strings (LinkedList): " + minhaLista);
        System.out.println("Tamanho da lista: " + minhaLista.size());
        System.out.println("Elemento no índice 2: " + minhaLista.get(2)); // Acesso por índice ainda funciona
        System.out.println("--------------------------------------------------");

        System.out.println("\nIsso demonstra a flexibilidade de usar a interface List!");
    }
}


