package Exercicios.AplicandoPOO.Modulo1;

public class Concessionaria {
    public static void main(String[] args) {
        // Criando um novo objeto Carro usando o construtor
        Carro meuCarro = new Carro("Fusca", 1970, "Azul");


        meuCarro.exibaFichaTecnica();

        int idadeDoCarro = meuCarro.calculaIdadeDoCarro();


        // Exemplo de como usar um getter e um setter (se necessário)
        System.out.println("Cor original: " + meuCarro.getCor());
        meuCarro.setCor("Amarelo"); // Mudando a cor do carro
        System.out.println("Nova cor: " + meuCarro.getCor());
        System.out.println("A idade do carro é: " + idadeDoCarro + " anos.");
        meuCarro.exibaFichaTecnica(); // Exibe a ficha técnica atualizada
    }
}