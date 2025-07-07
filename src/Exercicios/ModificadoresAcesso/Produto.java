package Exercicios.ModificadoresAcesso;
/*Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar
e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
 */
public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Erro: Preço não pode ser negativo.");
        }
        // Ele recebe o 'percentualDesconto' (ex: 10 para 10%) e o aplica ao preço
        public void aplicarDesconto(double percentualDesconto) {
            if (percentualDesconto >= 0 && percentualDesconto <= 100) {

                double valorDoDesconto = this.preco * (percentualDesconto / 100.0);
                this.preco -= valorDoDesconto;
                System.out.println("Desconto de " + percentualDesconto + "% aplicado. Novo preço: R$" + String.format("%.2f", this.preco));
            } else {
                System.out.println("Erro: Percentual de desconto inválido. Deve ser entre 0 e 100.");
            }
        }

        // Método toString() para facilitar a visualização do objeto (boa prática)
        @Override
        public String toString() {
            return "Produto [Nome=" + nome + ", Preco=R$" + String.format("%.2f", preco) + "]";
        }
    }
    }

}
