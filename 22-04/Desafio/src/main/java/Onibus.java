public class Onibus extends TransporteUrbano {
    public Onibus(String nome, int capacidade, int custo, boolean ehEcologico) {
        super(nome, capacidade, custo, ehEcologico);
    }

    @Override
    public void mover() {
        System.out.println(nome + " está sendo pilotado.");
    }

    @Override
    public void calcularCustoViagem() {
        System.out.printf("O custo da passagem de ônibus é R$ %.2f%n", custo);
    }

}
