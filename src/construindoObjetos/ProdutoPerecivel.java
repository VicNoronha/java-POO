
package construindoObjetos;

import java.time.LocalDate; // Importa a classe LocalDate para trabalhar com datas

// A classe ProdutoPerecivel herda de Produto2
class ProdutoPerecivel extends Produto2 {
    private LocalDate dataValidade; // Novo atributo para a data de validade

    // Construtor da classe ProdutoPerecivel
    // Ele recebe os atributos de Produto2 (nome, preco, quantidade)
    // e o seu próprio atributo (dataValidade)
    public ProdutoPerecivel(String nome, double preco, int quantidade, LocalDate dataValidade) {
        // Chama o construtor da classe mãe (Produto2) usando 'super()'
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade; // Inicializa o atributo específico de ProdutoPerecivel
    }

    // Método getter para acessar a data de validade
    public LocalDate getDataValidade() {
        return dataValidade;
    }

    // Sobrescreve o método toString() para incluir a data de validade
    @Override
    public String toString() {
        // Reutiliza o toString() da classe mãe e adiciona a informação da data de validade
        return super.toString() + ", Data de Validade: " + dataValidade;
    }
}