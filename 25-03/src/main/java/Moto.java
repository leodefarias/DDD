public class Moto extends Veiculo {
    boolean temSidecar;

    void exibirDetalhesMoto() {
        exibirDetalhes();
        System.out.println("Tem sidecar? " + (temSidecar ? "Sim" : "Não"));
    }
}
