public class Veiculo {
    protected String modelo;
    protected double valorDiaria;

    public Veiculo(String modelo, double valorDiaria) {
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public double calcularCusto(double valorDiaria, int quantidadeDias, int quantidadeDiasAtraso) {
        double valorFinal = 0;
        if (quantidadeDias >= 7) {
            valorFinal = desconto(valorDiaria, quantidadeDias);
        } else {
            valorFinal = valorDiaria * quantidadeDias;
        }
        return calcularMultas(valorFinal, quantidadeDiasAtraso);
    }

    public double desconto(double valorDiaria, int quantidadeDias) {
        return (valorDiaria * quantidadeDias) - (valorDiaria * quantidadeDias * 0.1);
    }

    public double calcularMultas(double valor, int quantidadeDiasAtraso) {
        return  valor + (valor * (quantidadeDiasAtraso * 0.2));
    }


}


