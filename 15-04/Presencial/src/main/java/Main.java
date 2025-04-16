public class Main {
    public static void main(String[] args) {
        EquipeFormula1 equipe = new EquipeFormula1();

        EquipeF1 piloto = new Piloto("Hamilton");
        EquipeF1 engenheiro = new Engenheiro("Claire");
        EquipeF1 mecanico = new Mecanico("Gian");
        EquipeF1 chefeDeEquipe = new ChefeDeEquipe("Gustavo");

        equipe.adicionarMembro(piloto);
        equipe.adicionarMembro(engenheiro);
        equipe.adicionarMembro(mecanico);
        equipe.adicionarMembro(chefeDeEquipe);

        System.out.println("Operações da equipe:");
        equipe.iniciarOperacao();

        System.out.println("\nStatus dos membros:");
        equipe.statusGeral();
        System.out.println("------------------");
        System.out.println("------------------");

        OperacoesChamado chamado1 = new ChamadoSuporte();
        chamado1.criarChamado("Problema no email", "Não consigo acessar meu e-mail");
        chamado1.atenderChamado();
        chamado1.fecharChamado();

        System.out.println("------------------");

        OperacoesChamado chamado2 = new ChamadoTI();
        chamado2.criarChamado("Computador travando", "O PC está muito lento.");
        chamado2.atenderChamado();
        chamado2.fecharChamado();
    }
}
