import java.util.Scanner;

public class Pratica4ParouImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada;

        while (true) {
            System.out.println("Digite um numero de 0 a 100: ");
            entrada = sc.nextInt();
            if (entrada >= 0 && entrada <= 100) {
                break; // Exit the loop if input is valid
            } else {
                System.out.println("Numero invalido. Digite um numero entre 0 e 100.");
            }
        }


       if (entrada % 2 == 0) {
           System.out.println("O numero 66" + entrada+ " é: par ");
       } else {
           System.out.println("O numero " + entrada+ " : ímpar ");
        }
        sc.close();
    }
}
