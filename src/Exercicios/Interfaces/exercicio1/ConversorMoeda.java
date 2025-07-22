// ConversorMoeda.java
package Exercicios.Interfaces.exercicio1;

public class ConversorMoeda extends ConversaoFinanceira {

    @Override
    public double converterDolarParaReal(double valorEmDolar) {
        double taxaDeCambioDolarParaReal = 5.70;
        return valorEmDolar * taxaDeCambioDolarParaReal;
    }

    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        double dolares = 100.0;
        double reais = conversor.converterDolarParaReal(dolares);
        System.out.println(String.format("%.2f", dolares) + " dólares equivalem a R$" + String.format("%.2f", reais));
    }
}
