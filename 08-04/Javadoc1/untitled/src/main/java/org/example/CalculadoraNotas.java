package org.example;
import java.util.Scanner;


public class CalculadoraNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor da nota 1:");
        double nota1 = scanner.nextDouble();

        System.out.print("Insira o valor da nota 2:");
        double nota2 = scanner.nextDouble();

        System.out.print("Insira o valor da nota do trabalho: ");
        double trabalho = scanner.nextDouble();


        double ms = (nota1 * 0.4) + (nota2 * 0.4) + (trabalho * 0.2);
        if (ms >= 7) {
            System.out.println("Sua média semestral foi: " + ms);
        } else {
            System.out.print("Insira o valor da nota do exame: ");
            double exame = scanner.nextDouble();

            double me = (ms + exame) / 2;

            System.out.print("A sua média de exame é " + me);
        }


    }
}
