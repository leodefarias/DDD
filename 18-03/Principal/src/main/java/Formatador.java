import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Formatador {

   public static Scanner sc = new Scanner(System.in);
   public static DecimalFormatSymbols formatacao = new DecimalFormatSymbols(Locale.US);


    public static void main(String[] args) {

        System.out.print("Insira a quantidade de valores: ");
        int quantidade = sc.nextInt();

        System.out.print("Insira o simbolo para o separador: ");
        char simbolo = sc.next().charAt(0);
        formatacao.setDecimalSeparator(simbolo);

        DecimalFormat formato = new DecimalFormat("#.##", formatacao);


        double[] valores = new double[quantidade];

        for(int i = 0; i < quantidade; i++) {
            System.out.print("Insira o " + (i + 1) + "° valor: ");
            valores[i] = sc.nextDouble();
        }

        for(int i = 0; i < quantidade; i++) {
            String valorFormatado = formato.format(valores[i]);
            System.out.println(valorFormatado);
        }
    }

}
