package Exercicios.DesafioFinal;
import java.util.Collections;
import java.util.Scanner;
// importando as classes que você precisa criar (se ainda não as fez)
// import Exercicios.DesafioFinal.CartaoDeCredito;
// import Exercicios.DesafioFinal.Compra;

public class AplicacaoCompras {
    public static void main(String[] args) {
        try (Scanner leitura = new Scanner(System.in)) {
            System.out.println("Digite o limite do cartão:");
            double limite = leitura.nextDouble();
            leitura.nextLine();

            CartaoDeCredito cartao = new CartaoDeCredito(limite);

            int sair = 1;
            while (sair != 0) {
                System.out.println("***************************** \n");
                System.out.println("Digite a descrição da compra: \n");
                System.out.println("***************************** \n");
                String descricao = leitura.nextLine();

                System.out.println("Digite o valor da compra:");
                double valor = leitura.nextDouble();
                leitura.nextLine();

                Compra compra = new Compra(descricao, valor);
                boolean compraRealizada = cartao.lancaCompra(compra);

                if (compraRealizada) {
                    System.out.println("Compra realizada!\n");
                    System.out.println("Digite 0 para sair ou 1 para continuar:");
                    sair = leitura.nextInt();
                    leitura.nextLine(); // <-- CONSUMIR A NOVA LINHA APÓS nextInt()
                } else {
                    System.out.println("Saldo Insuficiente");
                    sair = 0; // Sai do loop se o saldo for insuficiente
                }
            }

            System.out.println("*************************");
            System.out.println("Compras Realizadas \n");

            // Certifique-se de que CartaoDeCredito.getCompras() retorna uma List<Compra>
            // e que Compra implementa Comparable<Compra>
            Collections.sort(cartao.getCompras());

            // Corrigindo o erro do ponto e vírgula extra no for-each
            for (Compra c : cartao.getCompras()) {
                System.out.println(c.getDescricao() + " - R$" + String.format("%.2f", c.getValor()));
            }

            System.out.println("\n***********************");
            System.out.println("\nSaldo do cartão: R$" + String.format("%.2f", cartao.getSaldo()));

        }
    }
}