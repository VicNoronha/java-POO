import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Esse é o screen match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lancamento " + anoDeLancamento);
        boolean incluidoNoPlano =true;
        double notaDoFilme =5.0;

        double media =(9.8+6.3+8.0)/3;
        System.out.println(media);

        String sinopse;
        sinopse = ("""
                Filme de aventura com galã dos anos 80
                Filme TopGun
                """);
        System.out.println(sinopse);

            int classificacao = (int)(media/2);
        System.out.println(classificacao);

    }
}