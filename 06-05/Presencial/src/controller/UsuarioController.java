package controller;

import model.Usuario;
import view.UsuarioView;

public class UsuarioController {
    private Usuario model;
    private UsuarioView view;

    public UsuarioController(UsuarioView view) {
        this.view = view;
    }

    public void cadastrarUsuario() {
        String nome = view.solicitarNome();
        int idade = view.solicitarIdade();

        model = new Usuario(nome, idade);

        view.mostrarMesagem("Usuário cadastrado com suceso!");
        view.mostrarMesagem("Nome: " + model.getNome());
        view.mostrarMesagem("Idade: " + model.getIdade() + " anos");

    }
}
