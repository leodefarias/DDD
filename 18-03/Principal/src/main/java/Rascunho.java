import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Rascunho {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor: ");
        double valor = sc.nextDouble();

        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        simbolos.setDecimalSeparator('.');

        DecimalFormat formato = new DecimalFormat("#.##", simbolos);
        String valorFormatado = formato.format(valor);

        System.out.println("Valor formatado: " + valorFormatado);
    }
}
