package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de PCC&F:");
        double pccf = sc.nextDouble();

        System.out.print("Digite o valor de GS:");
        double gs = sc.nextDouble();

        double ms1 = (pccf * 0.4) + (gs * 0.6);

        System.out.println("O valor da MS1 é " + ms1);

        sc.close();
    }
}