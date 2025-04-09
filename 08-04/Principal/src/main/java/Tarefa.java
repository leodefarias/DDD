import java.util.ArrayList;
import java.util.List;

public class Tarefa {
    private String titulo; /** Variável que armazena o título da tarefa.*/
    private String descricao; /** Variável que armazena a descrição da tarefa.*/
    private boolean concluida; /** Variável que armazena o estado atual da tarefa (false para aberta e true para concluída)*/

    /**
     * Construtur que gera uma tarefa em aberto.
     *
     * @param titulo define o título da nova tarefa.
     * @param descricao define a descrição da nova tarefa.
     */
    public Tarefa(String titulo, String descricao) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.concluida = false;
    }

    /** Muda o estado da variável concluida para true.*/
    public void concluir() {
        this.concluida = true;
    }

    /** Muda o estado da variável concluida para false.*/
    public void reabrir() {
        this.concluida = false;
    }

    /** Retorna o estado atual da variável concluida.*/
    public boolean estaConcluida() {
        return concluida;
    }
    /** Retorna o título da atividade atual.*/
    public String getTitulo() {
        return titulo;
    }

    /** Retorna a descricao da atividade atual.*/
    public String getDescricao() {
        return descricao;
    }
}
