public class Comentarios {
    public static void main(String[] args) {
        // Este é um comentário de linha explicando o próximo código.
        System.out.println("Olá, mundo!");

        /*
        * Este é um comentário de múltiplas linhas.
        * Ele é útil para explicar detalhes mais complexos
        * Ou descrever grandes blocos de código.
        */

        int resultado = somar(5, 3); //Soma dois números.
        System.out.println("Resultado: " + resultado);
    }

    // Método para somar dois números.
    public static int somar(int a, int b) {
        return a + b;
    }
}
