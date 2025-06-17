package Exercicios.Principal;

public class TesteAnimalCachorro {
    public static void main(String[] args) {

        // Removida a linha incorreta "Principal.animal animal = new Principal.animal();"
        // Criando uma instância de Cachorro
        Cachorro meuCachorro = new Cachorro("Fido");

        System.out.println(meuCachorro.toString()); // Saída: Cachorro: Fido
        meuCachorro.emitirSom(); // Saída: Fido late: Au au!

        System.out.println("\n--- Cadastro de Animais ---");
        // Exemplo de casting (polimorfismo - Upcasting implícito)
        Animal animalGenerico = meuCachorro; // Uma referência do tipo Animal apontando para um objeto Cachorro

        // O método toString() de Cachorro é chamado porque o objeto REAL é um Cachorro
        System.out.println(animalGenerico.toString()); // Saída: Cachorro: Fido

        // O método emitirSom() de Cachorro é chamado (comportamento polimórfico)
        System.out.println("Som que o animal emite:");
        animalGenerico.emitirSom(); // Saída: Fido late: Au au!
    }
}
