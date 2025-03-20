import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Util {

    private Scanner scanner = new Scanner(System.in);

    public void formatarValores() {
        int retornoQuantidade = defineQuantidadeDecimaisParaFormatar();
        List<Double> lstRetornoValoresDecimais = receberValoresDecimais(retornoQuantidade);
        String tipoDeSeparador = defineTipoDeSeparador();
        formatar(lstRetornoValoresDecimais, tipoDeSeparador);
    }

    private int defineQuantidadeDecimaisParaFormatar() {
        System.out.print("Defina uma quantidade de números decimais para formatar: ");
        return scanner.nextInt();
    }

    private char defineTipoDeSeparador() {
        System.out.print("Defina o tipo de separador: ");
        return scanner.next().charAt(0);
    }

    private List<Double> receberValoresDecimais(int quantidade) {
        List<Double> listaValoresDecimais = new ArrayList<>();
        for (int i = 1; i <= quantidade; i++) {
            System.out.print(i + "o número: ");
            listaValoresDecimais.add(scanner.nextDouble());
        }
        return listaValoresDecimais;
    }

    private void formatar(List<Double> listaValores, String tipoDeSeparador) {
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);
        simbolos.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#"+tipoDeSeparador+"##", simbolos);

        for (double valor : listaValores) {
            String valorFormatado = formato.format(valor);
            System.out.println("Valor formatado: " + valorFormatado);
        }
    }
}