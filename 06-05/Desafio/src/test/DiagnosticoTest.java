package test;

import controller.DiagnosticoController;

public class DiagnosticoTest {
    public static void main(String[] args) {
        DiagnosticoController ctrl = new DiagnosticoController();

        if (ctrl.listarDiagnosticos().isEmpty()) {
            System.out.println("OK: não há diagnósticos no início");
        } else {
            System.out.println("ERRO: já havia diagnósticos");
        }
        
        ctrl.cadastrarAnimal("Rex", "Cachorro", 5);
        ctrl.registrarDiagnostico("Rex", "Vacinação em dia");

        int total = ctrl.listarDiagnosticos().size();
        if (total == 1) {
            System.out.println("OK: 1 diagnóstico registrado");
        } else {
            System.out.println("ERRO: esperava 1, mas foram " + total);
        }
    }
}
