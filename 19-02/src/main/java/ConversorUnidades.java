import java.util.Scanner;

public class ConversorUnidades {
    private static int centimetro, milimetro;
    public static void main(String[] args) {

        double metro = coletarMetros("Insira o valor em metros: ");
        converterParaCentimetros(metro);
        converterParaMilimetros(metro);

    }

    private static void converterParaMilimetros(double metro) {
        milimetro = (int) (metro * 1000);
        System.out.println("O valor em milimetros é de " + milimetro + "mm");
    }

    private static void converterParaCentimetros(double metro) {
        centimetro = (int) (metro * 100);
        System.out.println("O valor em centímetros é de " + centimetro + "cm");
    }

    private static double coletarMetros(String metroInput) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf(metroInput);
        return scanner.nextDouble();




    }
}
