package view;

import controller.DiagnosticoController;
import model.Diagnostico;

import java.util.List;
import java.util.Scanner;

public class DiagnosticoView {
    public void mostrarMenu() {
        Scanner in = new Scanner(System.in);
        DiagnosticoController ctrl = new DiagnosticoController();
        int op = 0;
        while (op != 4) {
            System.out.println("\n1 - Cadastrar Animal");
            System.out.println("2 - Registrar Diagnóstico");
            System.out.println("3 - Ver Diagnósticos");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");
            op = Integer.parseInt(in.nextLine());

            if (op == 1) {
                System.out.print("Nome: ");
                String nome = in.nextLine();
                System.out.print("Espécie: ");
                String esp = in.nextLine();
                System.out.print("Idade: ");
                int idade = Integer.parseInt(in.nextLine());
                ctrl.cadastrarAnimal(nome, esp, idade);
                System.out.println("Animal registrado!");
            }
            else if (op == 2) {
                System.out.print("Nome do Animal: ");
                String nome = in.nextLine();
                System.out.print("Diagnóstico: ");
                String desc = in.nextLine();
                try {
                    ctrl.registrarDiagnostico(nome, desc);
                    System.out.println("Diagnóstico registrado!");
                }
                catch (IllegalArgumentException e) {
                    System.out.println("Animal não encontrado!");
                }
            }
            else if (op == 3) {
                List<Diagnostico> lista = ctrl.listarDiagnosticos();
                if (lista.isEmpty()) {
                    System.out.println("Nenhum diagnóstico.");
                } else {
                    System.out.println("\n--- Diagnósticos Registrados ---");
                    for (Diagnostico d : lista) {
                        System.out.println(
                                "Animal: " + d.getAnimal().getNome()
                                        + " | Diagnóstico: " + d.getDescricao()
                        );
                    }
                }
            }
            else if (op == 4) {
                System.out.println("Saindo...");
            }
            else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
