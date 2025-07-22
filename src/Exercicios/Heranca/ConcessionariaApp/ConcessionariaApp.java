package Exercicios.Heranca.ConcessionariaApp;

public class ConcessionariaApp {
    public static void main(String[] args) {
        System.out.println("--- Gerenciamento de Modelos de Carro ---");

        ModeloCarro meuCarroPopular = new ModeloCarro("Fiesta");

        meuCarroPopular.definirPrecoPorAno(0, 35000.00); // Preço Ano 1
        meuCarroPopular.definirPrecoPorAno(1, 32500.00); // Preço Ano 2
        meuCarroPopular.definirPrecoPorAno(2, 30000.00); // Preço Ano 3

        meuCarroPopular.exibirFichaTecnica(); // Esta já lista os preços por ano agora.

        // Chamadas específicas para exibir o preço médio de cada ano
        meuCarroPopular.exibirPrecoMedioPorAno(0); // Exibe o preço do Ano 1
        meuCarroPopular.exibirPrecoMedioPorAno(1); // Exibe o preço do Ano 2
        meuCarroPopular.exibirPrecoMedioPorAno(2); // Exibe o preço do Ano 3

        meuCarroPopular.exibirMenorPreco();
        meuCarroPopular.exibirMaiorPreco();

        System.out.println("\n-------------------------------------");

        ModeloCarro meuCarroLuxo = new ModeloCarro("BMW X5");
        meuCarroLuxo.definirPrecoPorAno(0, 150000.00);
        meuCarroLuxo.definirPrecoPorAno(1, 145000.00);
        meuCarroLuxo.definirPrecoPorAno(2, 160000.00);

        meuCarroLuxo.exibirFichaTecnica();
        meuCarroLuxo.exibirPrecoMedioPorAno(0);
        meuCarroLuxo.exibirPrecoMedioPorAno(1);
        meuCarroLuxo.exibirPrecoMedioPorAno(2);
        meuCarroLuxo.exibirMenorPreco();
        meuCarroLuxo.exibirMaiorPreco();

        System.out.println("\n--- Fim do Gerenciamento ---");
    }
}