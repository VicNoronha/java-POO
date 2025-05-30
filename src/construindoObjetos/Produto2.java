package construindoObjetos;

import java.util.ArrayList;
import java.util.List;

// Implementação da classe Produto2
class Produto2 {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto2(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        // Melhorando a formatação do preço para duas casas decimais
        return "Produto: " + nome + ", Preço R$: " + String.format("%.2f", preco) + ", Quantidade: " + quantidade;
    }
}

public class GerenciadorProdutos {
    public static void main(String[] args) {
        // A lista deve ser do tipo Produto2
        List<Produto2> listaDeProdutos = new ArrayList<>();

        // Adicione produtos usando o construtor da classe Produto2
        listaDeProdutos.add(new Produto2("Laptop Dell", 3500.00, 5));
        listaDeProdutos.add(new Produto2("Celular Samsung", 1800.99, 12));
        listaDeProdutos.add(new Produto2("Monitor AOC", 750.50, 8));
        listaDeProdutos.add(new Produto2("Teclado Mecânico", 250.00, 20));

        System.out.println("--- Lista de Produtos ---");
        // Imprima a lista de produtos diretamente
        System.out.println(listaDeProdutos);

        System.out.println("\n--- Exemplo de recuperação de um produto específico (índice 0) ---");
        // O produto recuperado também deve ser do tipo Produto2
        Produto2 primeiroProduto = listaDeProdutos.get(0);
        System.out.println(primeiroProduto);
    }
}