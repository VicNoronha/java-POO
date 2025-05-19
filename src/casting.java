public class casting {
        public static void main(String[] args) {

            double temperaturaCelsius = 25.5;
            int temperaturaFahrenheit = 50;

            int temperaturaCelsiusInteira = (int) temperaturaCelsius; // Cast de double para int

            System.out.printf("Temperatura Celsius (original): %.1f\n", temperaturaCelsius); // Formato correto para double
            System.out.printf("Temperatura Celsius (inteira): %d\n", temperaturaCelsiusInteira); // Formato correto para int
            System.out.printf("Temperatura Fahrenheit: %d\n", temperaturaFahrenheit); // Formato correto para int
        }
    }