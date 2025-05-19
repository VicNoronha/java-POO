import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);// Rastreio Input

        System.out.println("Digite o seu filme favortito");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lancamento?");
        int anoLancamento = leitura.nextInt();
        System.out.println("Digite sua avaliacao para o filme:");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);
    }
}
