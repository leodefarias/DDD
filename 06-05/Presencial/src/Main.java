import controller.UsuarioController;
import view.UsuarioView;

public class Main {
    public static void main(String[] args) {
        UsuarioView view = new UsuarioView();
        UsuarioController controller = new UsuarioController(view);

        controller.cadastrarUsuario();
    }
}