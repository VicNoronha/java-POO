package Exercicios.Heranca.ConcessionariaApp;
/*Crie uma classe Carro com métodos para representar um modelo específico
ao longo de três anos. Implemente métodos para definir o nome do modelo,
os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
 Adicione uma subclasse ModeloCarro para criar instâncias específicas,
 utilizando-a na classe principal para definir preços e mostrar informações.
 */
public class Carro {
    private String nomeDoModelo;
    private double[] precosMediosPorAno;

    public Carro(String nomeDoModelo) {
        this.nomeDoModelo = nomeDoModelo;
        this.precosMediosPorAno = new double[3]; // Para 3 anos
    }

    public void definirPrecoPorAno(int anoIndex, double preco) {
        if (anoIndex >= 0 && anoIndex < precosMediosPorAno.length) {
            this.precosMediosPorAno[anoIndex] = preco;
        } else {
            System.out.println("Erro: Ano inválido. Por favor, use 0, 1 ou 2.");
        }
    }

    // Método para calcular e exibir o menor preço
    public void exibirMenorPreco() {
        if (precosMediosPorAno.length == 0 || precosMediosPorAno[0] == 0.0) {
            System.out.println("Preços ainda não definidos para " + nomeDoModelo + ".");
            return;
        }

        double menorPreco = precosMediosPorAno[0];
        for (int i = 1; i < precosMediosPorAno.length; i++) {
            if (precosMediosPorAno[i] != 0.0 && precosMediosPorAno[i] < menorPreco) {
                menorPreco = precosMediosPorAno[i];
            }
        }
        System.out.println("Menor preço médio para " + nomeDoModelo + ": R$" + String.format("%.2f", menorPreco));
    }

    // Método para calcular e exibir o maior preço
    public void exibirMaiorPreco() {
        if (precosMediosPorAno.length == 0 || precosMediosPorAno[0] == 0.0) {
            System.out.println("Preços ainda não definidos para " + nomeDoModelo + ".");
            return;
        }

        double maiorPreco = precosMediosPorAno[0];
        for (int i = 1; i < precosMediosPorAno.length; i++) {
            if (precosMediosPorAno[i] > maiorPreco) {
                maiorPreco = precosMediosPorAno[i];
            }
        }
        System.out.println("Maior preço médio para " + nomeDoModelo + ": R$" + String.format("%.2f", maiorPreco));
    }


    public void exibirPrecoMedioPorAno(int anoIndex) {
        if (anoIndex >= 0 && anoIndex < precosMediosPorAno.length) {
            System.out.println("Preço médio para o Ano " + (anoIndex + 1) + " do " + nomeDoModelo + ": R$" + String.format("%.2f", precosMediosPorAno[anoIndex]));
        } else {
            System.out.println("Erro: Índice de ano inválido.");
        }
    }


    public void exibirFichaTecnica() {
        System.out.println("\n--- Ficha Técnica do Modelo ---");
        System.out.println("Modelo: " + nomeDoModelo);
        System.out.println("Preços médios por ano:");
        for (int i = 0; i < precosMediosPorAno.length; i++) {
            System.out.println("  Ano " + (i + 1) + ": R$" + String.format("%.2f", precosMediosPorAno[i]));
        }
        System.out.println("-----------------------------\n");
    }

    public String getNomeDoModelo() {
        return nomeDoModelo;
    }
}