public class Teste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.soma(2, 3));
        System.out.println(calc.soma(2, 3, 4));
        System.out.println(calc.soma(2.5, 3.5));

        int[] notas = new int[4];
        notas[0] = 85;
        notas[1] = 90;
        notas[2] = 78;
        notas[3] = 93;

        System.out.println(calc.soma(notas));

        Impressora imp = new Impressora();
        imp.imprimir("Leo");
        imp.imprimir(1);

        Pai pai = new Pai();
        pai.mensagem();

        Filho filho = new Filho();
        filho.mensagem();

    }

}
