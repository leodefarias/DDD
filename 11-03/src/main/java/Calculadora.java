class Calculadora {
    int soma(int a, int b) {
        return a + b;
    }

    int soma(int a, int b, int c) {
        return a + b + c;
    }

    double soma(double a, double b) {
        return a + b;
    }

    int soma(int[] lista) {
        int resultado = 0;
        for (int i : lista) {
            resultado += i;
        }
        return resultado;
    }


}