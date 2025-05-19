public class conversor {
    public static void main(String[] args) {

        double temperatura = 25.5;
        double fahrenheit = (int)(temperatura * 1.8) + 32;

        System.out.printf("A temperatura é %.2f graus Fahrenheit\n", fahrenheit);
    }
}