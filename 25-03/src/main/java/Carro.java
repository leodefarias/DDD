public class Carro extends Veiculo {
    int numeroDePortas;

    void exibirDetalhesCarro() {
        exibirDetalhes();
        System.out.println("Número de portas: " + numeroDePortas);
    }
}
