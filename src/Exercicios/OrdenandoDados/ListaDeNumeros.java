package Exercicios.OrdenandoDados;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
//Crie uma lista de números inteiros e utilize o método Collections.sort
// para ordená-la em ordem crescente.
// Em seguida, imprima a lista ordenada.

public class ListaDeNumeros {
    public static void main(String[] args) {
        int tamanhoLista = 10;
        int limiteSuperior = 100;

        Random random = new Random();
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();

        for (int i = 0; i < tamanhoLista; i++) {

            int numeroAleatorio = random.nextInt(limiteSuperior);
            listaDeNumeros.add(numeroAleatorio);
        }
        System.out.println("Lista de números aleatório é: " + listaDeNumeros);

        Collections.sort(listaDeNumeros);

        System.out.println("Lista de números aleatórios ordenados: " + listaDeNumeros);

    }
}
