package Exercicios.Interfaces.exercicio1.Exercicio2;

public class CalculadoraSalaRetangular extends CalculoGeometrico {

    @Override
    public double calcularArea(double altura, double largura) {
        return super.calcularArea(altura, largura);
    }

    public static void main(String[] args) {
        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        double alturaDaSala = 5.89;
        double larguraDaSala = 10.6;

        double areaCalculada = calculadora.calcularArea(alturaDaSala,larguraDaSala);
        double perimetroCalculado = calculadora.calcularPerimetro(alturaDaSala,larguraDaSala);


        System.out.println("A area do retângulo é:  \n"+ areaCalculada);
        System.out.println("O perimetro do retângulo é:  \n" +perimetroCalculado);

    }


}
