public class ChefeDeEquipe implements EquipeF1{
    private String nome;

    public ChefeDeEquipe(String nome) {
        this.nome = nome;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está supervisionando as funções dos membros da equipe.");
    }

    @Override
    public void mostrarStatus() {
        System.out.println(nome + " está monitorando o desempenho da equipe.");
    }
}