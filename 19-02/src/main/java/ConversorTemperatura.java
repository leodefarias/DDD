import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {

        double tempF = receberTemperaturaFahrenheit("Insira a temperatura em Fahrenheit(°F): ");
        converterParaCelsius(tempF);


    }

    private static void converterParaCelsius(double fahrenheit) {
        double tempC = (fahrenheit - 32) * ((double) 5 / 9);

        System.out.println("A temperatura " + fahrenheit + " é igual a " + tempC + "°C");;
    }

    private static double receberTemperaturaFahrenheit(String inputTempF) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf(inputTempF);

        return scanner.nextDouble();
    }
}
