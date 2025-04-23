public class Metro extends TransporteUrbano {
    public Metro(String nome, int capacidade, int custo, boolean ehEcologico) {
        super(nome, capacidade, custo, ehEcologico);
    }

    @Override
    public void mover() {
        System.out.println(nome + " está se movendo pelos trilhos.");
    }

    @Override
    public void calcularCustoViagem() {
        System.out.printf("O custo da passagem de metrô é R$ %.2f%n", custo);
    }

}
