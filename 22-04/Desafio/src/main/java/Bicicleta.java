public class Bicicleta extends TransporteUrbano {
    public Bicicleta(String nome, int capacidade, int custo, boolean ehEcologico) {
        super(nome, capacidade, custo, ehEcologico);
    }

    @Override
    public void mover() {
        System.out.println(nome + " está sendo pedalada.");
    }

    @Override
    public void calcularCustoViagem() {
        System.out.printf("O custo de andar de bicicleta é R$ %.2f%n", custo);
    }

}
