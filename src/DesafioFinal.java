import java.util.InputMismatchException; // Importe para lidar com entrada inválida
import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome = "Beyonce Knowles";
        String tipoConta = "Corrente";
        double saldo = 3500.00;
        int opcao = -1; // Inicializa com valor inválido para entrar no loop

        System.out.println("**********************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo: " + String.format("%.2f", saldo));
        System.out.println("\n**********************");

        // Loop para o menu, permitindo múltiplas operações até sair
        while (opcao != 3) { // Continua enquanto a opção não for 3 (Sair)
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Realizar Transferência");
            System.out.println("3. Sair");
            System.out.print("Digite a opção desejada: ");

            try { // Bloco try-catch para tratar entrada inválida do menu
                opcao = entrada.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("\nSaldo atual: R$ " + String.format("%.2f", saldo));
                        break;
                    case 2:
                        System.out.print("Digite o valor da transferência: R$ ");
                        double valorTransferencia = entrada.nextDouble();

                        if (valorTransferencia > saldo) {
                            System.out.println("Saldo insuficiente para transferência. Saldo atual: R$ " + String.format("%.2f", saldo));
                        } else if (valorTransferencia <= 0) { // Adiciona validação para valores positivos
                            System.out.println("Valor de transferência deve ser positivo.");
                        }
                        else {
                            saldo -= valorTransferencia; // Decrementa o saldo
                            System.out.println("Transferência de R$ " + String.format("%.2f", valorTransferencia) + " realizada com sucesso!");
                            System.out.println("Novo saldo: R$ " + String.format("%.2f", saldo));
                        }
                        break;
                    case 3:
                        System.out.println("Saindo do Sistema. Obrigado!");
                        break;
                    default: // Lida com opções fora do menu
                        System.out.println("Opção inválida. Por favor, escolha 1, 2 ou 3.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número correspondente à opção.");
                entrada.next();
                opcao = -1;
            }
        }

        entrada.close(); // Fecha o scanner ao final do programa
    }
}