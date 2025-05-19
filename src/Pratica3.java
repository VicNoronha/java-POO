import java.util.InputMismatchException;
import java.util.Scanner;

public class Pratica3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcao = 0;
        double areaQuadrado = 0;
        double areaCirculo = 0;
        int lado, raio;

        while (true) { // Loop para garantir entrada válida
            System.out.println("Digite a área que deseja calcular: Opção 1 (Quadrado) ou Opção 2 (Círculo)");
            try {
                opcao = input.nextInt();
                if (opcao == 1 || opcao == 2) {
                    break; // Sai do loop se a opção for válida
                } else {
                    System.out.println("Opção inválida. Por favor, digite 1 ou 2.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro (1 ou 2).");
                input.next();
            }
        }

        if (opcao == 1) {
            System.out.println("Você escolheu calcular a área do quadrado.\nDigite o valor do lado: ");
            lado = obterLado(input);
            areaQuadrado = lado * lado;
            System.out.println("A área do quadrado é: " + areaQuadrado);
        } else {
            System.out.println("Você escolheu calcular a área do círculo.\nDigite o valor do raio: ");
            raio = obterRaio(input); //
            areaCirculo = Math.PI * raio * raio;
            System.out.printf("A área do círculo é: %.2f%n", areaCirculo); // Formatação correta
        }

        input.close(); // Feche o scanner
    }

    // Função para obter o lado com validação
    public static int obterLado(Scanner input) {
        int lado;
        while (true) {
            try {
                lado = input.nextInt();
                if (lado > 0) {
                    return lado;
                } else {
                    System.out.println("Valor inválido. Digite um valor positivo para o lado: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro positivo para o lado: ");
                input.next();
            }
        }
    }

    // Função para obter o raio com validação
    public static int obterRaio(Scanner input) {
        int raio;
        while (true) {
            try {
                raio = input.nextInt();
                if (raio > 0) {
                    return raio;
                } else {
                    System.out.println("Valor inválido. Digite um valor positivo para o raio: ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro positivo para o raio: ");
                input.next();
            }
        }
    }
}
