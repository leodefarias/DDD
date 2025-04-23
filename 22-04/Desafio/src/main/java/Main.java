public class Main {
    public static void main(String[] args) {
        TransporteUrbano t1 = new Onibus("2703-10", 50, 5, false);
        TransporteUrbano t2 = new Metro("Linha Vermelha", 500, 4, false);
        TransporteUrbano t3 = new Bicicleta("Caloi", 1, 0, true);

        t1.exibirInfo();
        t1.mover();
        t1.ehEcologico();

        t2.exibirInfo();
        t2.mover();
        t2.ehEcologico();

        t3.exibirInfo();
        t3.mover();
        t3.ehEcologico();
    }
}
