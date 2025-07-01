package Exercicios.AplicandoPOO.Modulo1;
import java.time.LocalDate;

/*Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
 */
public class Carro {
    // Atributos (campos) da classe - são privados para garantir o encapsulamento
    private String modelo;
    private int ano;
    private String cor;


    public Carro(String modelo, int ano, String cor) {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    public void exibaFichaTecnica() {
        System.out.println("\n--- Ficha Técnica do Carro ---");
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("------------------------------\n");
    }

    public int calculaIdadeDoCarro() {

        int anoAtual = LocalDate.now().getYear();
        int idade = anoAtual - this.ano;
        return idade;
    }


    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getCor() {
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}