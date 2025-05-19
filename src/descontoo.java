public class descontoo {
    public static void main(String[] args) {
        double precoOriginal = 67.88;
        double percentualDesconto = 15;

        double valorTotal =(precoOriginal)-( (precoOriginal * percentualDesconto)/100);

        System.out.printf("O valor total com desconto é : %.2f\n", valorTotal);
    }
}