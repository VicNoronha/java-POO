package Exercicios.DesafioFinal;
import java.util.Collections;
import java.util.Scanner;
// Criar uma aplicacao de lancamentos de compras no cartão de crédito;
//Menu para lancamento de compras;
// Exibicao da lista de compras realizadas e ordenadas por valor

public class AplicacaoCompras {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); // Para leitura do console
        System.out.println("Digite o limite do cartão");
        double limite = leitura.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0) {

            System.out.println("***************************** \n");
            System.out.println("Digite a descrição da compra: \n");
            System.out.println("***************************** \n");
            String descricao = leitura.next();

            System.out.println("Digite o valor da compra:");
            double valor = leitura.nextDouble();

            Compra compra = new Compra(descricao, valor); // buscar mais infos sobre esse bloco
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada!\n");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = leitura.nextInt();
            } else {
                System.out.println("Saldo Insuficiente");
                sair = 0;
            }
        }

        System.out.println("*************************");
        System.out.println("Compras Realizadas \n");
        Collections.sort(cartao.getCompras()); //buscar mais infos

        for (Compra c: cartao.getCompras()){
            System.out.println(c.getDescricao() + " - " +c.getValor()); // buscar mais infos
        }
            System.out.println("\n***********************");

        System.out.println("\nSaldo do cartão: " +cartao.getSaldo());
    }

}

