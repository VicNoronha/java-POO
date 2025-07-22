package Exercicios.Interfaces.exercicio1;


public class ConversaoFinanceira {

    // Método para converter um valor em Dólar para Real

    public double converterDolarParaReal(double valorEmDolar) {

        double taxaDeCambioDolarParaReal = 5.70;


        return valorEmDolar * taxaDeCambioDolarParaReal;
    }

}