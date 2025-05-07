package view;

import java.util.Scanner;

public class UsuarioView {
    private Scanner scanner;

    public UsuarioView() {
        scanner = new Scanner(System.in);
    }

    public String solicitarNome() {
        System.out.print("Digite o nome do usuário: ");
        return scanner.nextLine();
    }

    public int solicitarIdade() {
        System.out.print("Digite a idade do usuário: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void mostrarMesagem(String mensagem) {
        System.out.println(mensagem);
    }
}
