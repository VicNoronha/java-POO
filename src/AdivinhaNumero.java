import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int contador = 5;
        int chuteNumero = 0;
        int numeroAleatorio = random.nextInt(101);

        while (contador > 0) {
            System.out.println("Digite um numero de 0 a 100:");
            chuteNumero = scanner.nextInt();

            if (chuteNumero == numeroAleatorio) {
                System.out.println("Parabéns!! Você acertou o número premiado!!");
                break;
            } else {
                contador--;
                System.out.println("Vc tem " + contador + " tentativas restantes");

                if (chuteNumero < numeroAleatorio) {
                    System.out.println("O número premiado é maior que " + chuteNumero + ". Tente Novamente");
                } else if (chuteNumero > numeroAleatorio) {
                    System.out.println("O número premiado é menor que " + chuteNumero + ". Tente Novamente");
                }
            }
        }

        if (contador == 0) {
            System.out.println("Suas tentativas acabaram. O número era: " + numeroAleatorio);
        }

        scanner.close();
    }
}