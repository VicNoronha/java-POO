package Exercicios.Principal;

public class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome); // Chama o construtor da classe pai (Animal)
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " late: Au au!"); // Usa getNome() para pegar o nome do Animal
    }

    @Override
    public String toString() {
        return "Cachorro: " + getNome(); // Usa getNome() para pegar o nome do Animal
    }
}