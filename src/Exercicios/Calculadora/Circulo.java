package Exercicios.Calculadora;

public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio; // Fórmula da área do círculo: PI * raio^2
    }

    @Override
    public String toString() {
        return "Círculo (Raio: " + raio + ")";
    }
}