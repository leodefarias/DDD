public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.ano = 2020;
        carro.numeroDePortas = 4;
        carro.exibirDetalhesCarro();

        Moto moto = new Moto();
        moto.marca = "Harley-Davidson";
        moto.ano = 2018;
        moto.temSidecar = true;
        moto.exibirDetalhesMoto();

    }
}
