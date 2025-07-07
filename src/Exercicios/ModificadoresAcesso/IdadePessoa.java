package Exercicios.ModificadoresAcesso;
/*Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setter
s para acessar e modificar esses atributos. Adicione um metodo verificarIdade que imprime se a pessoa é maior de idade ou não.
 */

public class IdadePessoa {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verificarIdade() {
        if (this.idade >= 18) {
            System.out.println("Essa pessoa e maior de idade.");
        } else {
            System.out.println("Essa pessoa e menor de idade.");
        }


    }
}


