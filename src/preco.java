public class preco {
    public static void main(String[] args) {
        double precoProduto = 25.99;
        int quantidade = 20;

        double valorTotal = precoProduto * quantidade; // Use double para manter a precisão

        System.out.printf("O valor total dessa compra é: %.2f\n", valorTotal); // Formato correto

    }
}