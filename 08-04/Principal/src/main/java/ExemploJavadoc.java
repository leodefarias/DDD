/*
* Esta classe demonstra o uso de Javadoc.
* Ela contém um método simples para calcular o quadrado de um número.
*/
public class ExemploJavadoc {
    /**
     * Calcula o quadrado de um número inteiro.
     *
     * @param numero O número que será elevado ao quadrado.
     * @return O quadrado do número fornecido.
     */
    public int calcularQuadrado(int numero) {
        return numero * numero;
    }

    public static void main(String[] args) {
        ExemploJavadoc exemplo = new ExemploJavadoc();
        int resultado = exemplo.calcularQuadrado(4);

        // Exibe o resultado do cálculo.
        System.out.println("Quadrado de 4 é: " + resultado);
    }
}
