import java.util.Scanner;

public class Pratica3Tabuada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 10: ");
        int numero = entrada.nextInt();

        System.out.println("Exibindo a tabuada do número " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        entrada.close();


        }

    }

