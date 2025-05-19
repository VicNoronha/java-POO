import java.util.Scanner;

public class Pratica2 {
    public static void main(String[] args) {

        System.out.println("Digite o primeiro numero: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
                Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();

        if (num1 > num2) {
            System.out.println(num1);
            System.out.println("O numero " + num1 + "  maior que o numero " + num2);
        } else if (num2 > num1) {
            System.out.println(num2);
            System.out.println("O numero " + num2 + " maior que o numero " + num1);
        }



    }
}
