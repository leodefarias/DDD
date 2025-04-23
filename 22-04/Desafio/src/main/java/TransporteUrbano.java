public abstract class TransporteUrbano implements MeioEcologico {
    protected String nome;
    protected int capacidade;
    protected float custo;
    protected boolean ehEcologico;

    public TransporteUrbano(String nome, int capacidade, int custo, boolean ehEcologico) {
        this.nome = nome;
        this.capacidade = capacidade;
        this.custo = custo;
        this.ehEcologico = ehEcologico;
    }

    public void exibirInfo() {
        System.out.println("O meio de transporte " + nome + " tem capacidade de " + " pessoas");
    }

    public abstract void mover();

    public abstract void calcularCustoViagem();

    @Override
    public void ehEcologico() {
        if(ehEcologico) {
            System.out.println("O meio de transporte é ecológico");
        } else {
            System.out.println("O meio de transporte não é ecológico");
        }
    }

}
