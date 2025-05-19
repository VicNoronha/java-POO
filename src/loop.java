import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in); // Scanner dentro do main
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite sua avaliacao para o filme:");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.printf("Media de Avaliacoes: %.2f\n", mediaAvaliacao / 3);
        leitura.close(); // Fechar o Scanner quando terminar de usá-lo
    }
}

