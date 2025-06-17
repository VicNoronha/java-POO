package Exercicios.Calculadora;

import java.util.ArrayList;
import java.util.InputMismatchException; // Para tratar entrada inválida
import java.util.List; // Boa prática usar a interface List
import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Forma> listaDeFormas = new ArrayList<>();
        int opcao = -1;


        listaDeFormas.add(new Circulo(5.0));
        listaDeFormas.add(new Quadrado(4.0));
        listaDeFormas.add(new Circulo(7.5));
        listaDeFormas.add(new Quadrado(10.0));

        System.out.println("--- Cálculo de Áreas de Formas ---");

        // Loop para calcular e imprimir a área de cada forma na lista
        for (Forma forma : listaDeFormas) {
            System.out.printf("%s tem área de: %.2f%n", forma.toString(), forma.calcularArea());
        }


        System.out.println("\n--- Interação para adicionar e calcular novas formas ---");

        do {
            System.out.println("\nSelecione uma opção:");
            System.out.println("1 - Adicionar Círculo");
            System.out.println("2 - Adicionar Quadrado");
            System.out.println("0 - Sair");
            System.out.print("Sua escolha: ");

            try {
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1: // Adicionar Círculo
                        System.out.print("Digite o raio do círculo: ");
                        double raio = scanner.nextDouble();
                        if (raio > 0) {
                            Circulo novoCirculo = new Circulo(raio);
                            listaDeFormas.add(novoCirculo);
                            System.out.printf("%s adicionado. Área: %.2f%n", novoCirculo.toString(), novoCirculo.calcularArea());
                        } else {
                            System.out.println("Raio deve ser positivo.");
                        }
                        break;
                    case 2: // Adicionar Quadrado
                        System.out.print("Digite o lado do quadrado: ");
                        double lado = scanner.nextDouble();
                        if (lado > 0) {
                            Quadrado novoQuadrado = new Quadrado(lado);
                            listaDeFormas.add(novoQuadrado);
                            System.out.printf("%s adicionado. Área: %.2f%n", novoQuadrado.toString(), novoQuadrado.calcularArea());
                        } else {
                            System.out.println("Lado deve ser positivo.");
                        }
                        break;
                    case 0: // Sair
                        System.out.println("Você finalizou o programa. Até mais!");
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, digite 1, 2 ou 0.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                scanner.next(); // Consumir a entrada inválida para evitar loop infinito
                opcao = -1; // Mantém o loop ativo e mostra o menu novamente
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
                opcao = -1;
            }
        } while (opcao != 0);

        scanner.close(); // Fechar o scanner
    }
}