import java.util.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Formatador {

    private int defineQuantidadeDecimaisParaFormatar() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Defina uma quantidade de números decimais para formatar: ");
            return scanner.nextInt();
        } catch (Exception ex) {
            System.out.println("Erro ao ler a quantidade.");
        }
        return 0;
    }

    private List<Double> receberValoresDecimais(int quantidade) {
        Scanner scanner = new Scanner(System.in);

        List<Double> listaValoresDecimais = new ArrayList<>();
        try {
            for (int i = 1; i <= quantidade; i++) {
                System.out.print(i + "o número: ");
                listaValoresDecimais.add(scanner.nextDouble());
            }
        } catch (Exception ex) {
            System.out.println("Erro ao receber os valores.");
        }
        return listaValoresDecimais;
    }

    public List<String> formatar() {
        Scanner scanner = new Scanner(System.in);

        int retornoQuantidade = defineQuantidadeDecimaisParaFormatar();
        List<Double> lstRetornoValoresDecimais = receberValoresDecimais(retornoQuantidade);

        List<String> listaValoresFormatados = new ArrayList<>();
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols(Locale.US);

        System.out.print("Insira o simbolo para o separador: ");
        char simbolo = scanner.next().charAt(0);

        simbolos.setDecimalSeparator(simbolo);

        DecimalFormat formato = new DecimalFormat("#.##", simbolos);

        try {
            for (double valor : lstRetornoValoresDecimais) {
                String valorFormatado = formato.format(valor);
                listaValoresFormatados.add(valorFormatado);
            }
            System.out.println(listaValoresFormatados);
        } catch (Exception ex){
            System.out.println("Erro ao formatar valores.");
        }
        return listaValoresFormatados;
    }

}
