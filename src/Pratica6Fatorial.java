import java.util.Scanner;

public class Pratica6Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("Nao e possivel calcular o fatorial de um numero negativo.");
        } else {
            long fatorial = 1; // Use long to avoid integer overflow for larger numbers
            for (int i = 1; i <= numero; i++) {
                fatorial *= i; // fatorial = fatorial * i;
            }
            System.out.println("O fatorial de " + numero + " e " + fatorial);
        }

        entrada.close();

    }
}
