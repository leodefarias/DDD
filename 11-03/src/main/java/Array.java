public class Array {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        String[] nomes = {"João", "Maria", "Pedro"};
        double[] precos = new double[]{1.99, 2.99, 3.99};
        System.out.println(numeros[0]);
        System.out.println(nomes[0]);
        System.out.println(precos[0]);

        int[] notas = new int[4];
        notas[0] = 85;
        notas[1] = 90;
        notas[2] = 78;
        notas[3] = 93;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i+1) + ": " + notas[i]);
        }

        for (int nota : notas) {
            System.out.println("Nota: " + nota);
        }
    }
}
