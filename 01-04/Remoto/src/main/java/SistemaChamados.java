import java.util.ArrayList;
import java.util.List;

public class SistemaChamados {
    private List<Chamado> listaChamado;

    public SistemaChamados() {
        this.listaChamado = new ArrayList<>();
    }

    public void adicionarChamado(Chamado chamado) {
        listaChamado.add(chamado);
    }

    public Chamado buscarChamado(int id) {
        for (Chamado chamado : listaChamado) {
            if (chamado.getId() == id) {
                return chamado;
            }
        }
        return null;
    }

    public void listarChamados() {
        for (Chamado chamado : listaChamado) {
            System.out.println("ID: " + chamado.getId() + ", Descrição: " + chamado.getDescricao() + ", Status: " + chamado.getStatus());
        }
    }
}
