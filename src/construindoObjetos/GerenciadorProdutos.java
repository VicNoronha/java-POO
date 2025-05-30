package construindoObjetos;
import java.util.ArrayList; // Importa a classe ArrayList
import java.util.List;    // Importa a interface List para melhor prática

// Definição da classe Produto
class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor da classe Produto
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos getters para acessar os atributos
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Sobrescreve o método toString() para uma representação amigável do objeto
    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}

public class GerenciadorProdutos2 {
    public static void main(String[] args) {
        // 1. Crie uma lista de objetos Produto utilizando a classe ArrayList
        // É uma boa prática usar a interface List e instanciar com ArrayList
        List<Produto> listaDeProdutos = new ArrayList<>();

        // 2. Adicione alguns produtos à lista
        Produto produto1 = new Produto("Laptop", 1200.00, 10);
        Produto produto2 = new Produto("Mouse", 25.50, 50);
        Produto produto3 = new Produto("Teclado", 75.00, 30);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        // Você também pode adicionar diretamente:
        listaDeProdutos.add(new Produto("Monitor", 300.00, 15));

        // 3. Imprima o tamanho da lista
        System.out.println("Tamanho da lista de produtos: " + listaDeProdutos.size());

        // 4. Recupere um produto pelo índice
        // Lembre-se que os índices de listas em Java começam em 0
        int indiceParaRecuperar = 1; // Para recuperar o segundo produto (Mouse)

        if (indiceParaRecuperar >= 0 && indiceParaRecuperar < listaDeProdutos.size()) {
            Produto produtoRecuperado = listaDeProdutos.get(indiceParaRecuperar);
            System.out.println("\nProduto recuperado pelo índice " + indiceParaRecuperar + ":");
            System.out.println(produtoRecuperado);
        } else {
            System.out.println("\nÍndice inválido. Não foi possível recuperar o produto.");
        }

        // Exemplo de iteração sobre a lista para imprimir todos os produtos
        System.out.println("\nTodos os produtos na lista:");
        for (Produto p : listaDeProdutos) {
            System.out.println(p);
        }
    }
}