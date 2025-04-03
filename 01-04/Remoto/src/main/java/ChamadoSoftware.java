public class ChamadoSoftware extends Chamado{
    private int sistemaOperacionalId;

    public ChamadoSoftware(int id, String descricao, int sistemaOperacionalId) {
        super(id, descricao);
        this.sistemaOperacionalId = sistemaOperacionalId;
    }

    @Override
    public void solucionarChamado(){
        System.out.println("Chamado de Hardware resolvido: " + this.getDescricao() + " relacionado ao equipamento: " + sistemaOperacionalId);
        this.setStatus(Status.ENCERRADO);
    }

    public int getSistemaOperacionalId() {
        return sistemaOperacionalId;
    }

    public void setSistemaOperacionalId (int sistemaOperacionalId) {
        if (sistemaOperacionalId <= 0) {
            throw new IllegalArgumentException("O sistemaOperacionalId não pode ser nulo, vazio ou inválido (deve ser maior que zero).");
        }
        this.sistemaOperacionalId = sistemaOperacionalId;
    }
}
