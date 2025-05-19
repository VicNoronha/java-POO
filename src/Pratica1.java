import java.util.Scanner;

public class Pratica1 {
    public static void main(String[] args) {

        System.out.println("Digite um numero");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println(numero + "É positivo" );
        } else if (numero < 0) {
            System.out.println(numero + "É negativo");
        }



    }
}
